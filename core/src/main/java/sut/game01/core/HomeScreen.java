package sut.game01.core;

import static playn.core.PlayN.*;

import tripleplay.game.ScreenStack;
import tripleplay.game.UIScreen;
import tripleplay.game.*;
import tripleplay.ui.Root;
import tripleplay.ui.*;
import playn.core.Font;
import tripleplay.ui.layout.*;
import react.UnitSlot;

public class HomeScreen extends UIScreen {
  public static final Font TITLE_FONT = graphics().createFont("Helvetica", Font.Style.PLAIN, 24);

  private final ScreenStack ss;

  private Root root;

  public HomeScreen(final ScreenStack ss){
      this.ss = ss;
      root = iface.createRoot(AxisLayout.vertical().gap(15), SimpleStyles.newSheet(), layer);

    root.addStyles(Style.BACKGROUND.is(Background.bordered(0xFFCCCCCC, 0xFF99CCFF, 5).inset(5, 10)));
    
    root.setSize(width(), height());

    root.add(new Label("Event Driven Programming").addStyles(Style.FONT.is(HomeScreen.TITLE_FONT)));

    root.add(new Button("start").onClick(new UnitSlot() {
      public void onEmit() {
        ss.push(new TestScreen(ss));
      }
    }));
  }
  public void wasShown (){
    super.wasShown();
  }
}