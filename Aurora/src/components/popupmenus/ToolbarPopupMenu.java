/*
 * ToolbarPopupMenu.java
 * 
 * Created on 13/Set/2007, 12:58:19
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components.popupmenus;

import javax.swing.*;
import java.awt.event.*;

import core.*;
import managers.*;

/**
 *
 * @author Luís
 */
public class ToolbarPopupMenu extends JPopupMenu{
    JMenuItem hide;
    public ToolbarPopupMenu(){
        hide = new JMenuItem(LangSupporter.activeLang.getEntry(116));
        add(hide);
        hide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                _hide();
            }
        });
        this.updateUI();
    }
    private void _hide(){
        aurora.window.items[MenuSupporter.GenerateMenuItemId(2, 1)].setSelected(false);
        aurora.window.items[MenuSupporter.GenerateMenuItemId(2, 1)].getActionListeners()[0].actionPerformed(null);
    }
}
