/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components.popupmenus;

import org.gcreator.editors.ActorEditor;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

import org.gcreator.events.*;
import org.gcreator.editors.*;

/**
 *
 * @author luis
 */
public class EventPopupMenu extends JPopupMenu{
    
    private Vector<Event> array;
    private ActorEditor edit;
    
    private JMenuItem delete;
    
    public EventPopupMenu(ActorEditor edit){
        this.array = edit.elist.getEvents();
        this.edit = edit;
        delete = new JMenuItem("Delete");
        delete.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                onDelete();
            }
        });
        this.add(delete);
    }
    
    public void onDelete(){
        int x = edit.jList1.getSelectedIndex();
        try{
            array.remove(x);
        }
        catch(Exception e){}
        edit.updateUI();
        edit.updateActionList();
    }
}
