/*
 * ActorInScene.java
 * 
 * Created on 10/Set/2007, 21:58:56
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package units;

import java.awt.*;

/**
 *
 * @author Luís
 */
public class ActorInScene {
    public fileclass.File actor;
    public int x;
    public int y;
    
    public ActorInScene(fileclass.File actor, int x, int y){
        this.actor = actor;
        this.x = x;
        this.y = y;
    }
}
