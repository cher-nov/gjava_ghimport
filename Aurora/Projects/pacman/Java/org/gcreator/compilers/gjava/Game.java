package org.gcreator.compilers.gjava;
import com.golden.gamedev.GameLoader; import com.golden.gamedev.engine.graphics.WindowedMode;
import java.awt.*;
import org.gcreator.compilers.gjava.api.*;
import org.gcreator.compilers.gjava.api.components.*;
import org.gcreator.compilers.gjava.gtge.Scene2D;
import java.awt.image.BufferedImage;
public class Game extends org.gcreator.compilers.gjava.gtge.Basicgame {
public static Sprite G_Creator_NULL_SPRITE;
    Game(){
//loading image code will go here
//loadSprites();
  //      loadScenes();
    //    nextScene();
    }
   public void loadScenes(){
scenes = new Scene2D[]{
new room0(),
new room1(),
new room2(),
new room3()
    };
    }
public void loadSprites() { }
   public static void main(java.lang.String[] args){
       Runningas = "Application";
       game = new GameLoader();
       game.setup(new Game(), new Dimension(640,480), false); frame=((WindowedMode)Game.game.getGame().bsGraphics).getFrame();
       game.start();
   }
}
