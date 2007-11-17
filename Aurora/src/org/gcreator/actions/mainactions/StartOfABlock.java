/*
 * StartOfABlock.java
 * 
 * Created on 26/Set/2007, 16:44:23
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.editors.ActorEditor;
import org.gcreator.actions.*;
import org.gcreator.editors.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class StartOfABlock extends ActionPattern{
    
    private static ImageIcon icon = new ImageIcon(StartOfABlock.class.getResource("/org/gcreator/actions/images/Start_Block.png"));
    public StartOfABlock(){
        super();
    }
    
     
    public String getStandardText(JComponent panel){
        return "Begin block";
    }
    public void setStandardImage(ImageIcon icon){
        StartOfABlock.icon = icon;
    }
     
    public String generateEGML(JComponent panel){
        return "{";
    }
     public ImageIcon getStandardImage() {
        return icon;
    }
}
