/*
 * Scene.java
 * 
 * Created on 13-Sep-2007, 07:50:04
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fileclass.res;

import units.*;
import java.util.*;

/**
 *
 * @author Ali1
 */
public class Scene extends Resource {
public String caption,code; //name is already on the list
public int width,height,speed,snapX,snapY;
public boolean persistant,grid,isometric;
public ViewsModel views;
public Vector<ActorInScene> actors;

public Scene(String name)
{
    this.name = name;
    actors = new Vector<ActorInScene>();
}

public String writeXml()
  {
      String xml = "";
      return xml;
}

    @Override
    public void readXml(String xml) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public String exportToHtml(boolean xhtml){
        return "";
    }
}
