package sut.game01.core;

import static playn.core.PlayN.*;

import playn.core.Game;
import playn.core.Image;
import playn.core.ImageLayer;
import playn.core.Mouse;
import playn.core.Mouse.*;
import tripleplay.game.ScreenStack;
import tripleplay.game.UIScreen;
import tripleplay.game.*;
import tripleplay.ui.Root;
import tripleplay.ui.*;
import playn.core.Font;
import tripleplay.ui.layout.*;
import react.UnitSlot;
import sut.game01.core.character.*;

public class GameScreen extends Screen {
  private final ScreenStack ss;
    private Zealot zealot;

  public GameScreen(final ScreenStack ss,ImageLayer bb,ImageLayer bg){
      this.ss = ss;
      //this.layer.add(bg);
      //this.layer.add(bb);
  }
  @Override
  public void wasShown (){
    super.wasShown();
    zealot = new Zealot(width()-100f,height()-100f);
    this.layer.add(zealot.layer());
  }
    public void update(int delta) {
        this.zealot.update(delta);
    }

}