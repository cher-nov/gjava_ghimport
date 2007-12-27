/*
 * TimelineEditor.java
 *
 * Created on 27 de Dezembro de 2007, 19:31
 */

package org.gcreator.editors;

import org.gcreator.components.*;
import org.gcreator.exceptions.*;
import org.gcreator.fileclass.*;

/**
 *
 * @author  luis
 */
public class TimelineEditor extends TabPanel {
    
    /** Creates new form TimelineEditor */
    public TimelineEditor(org.gcreator.fileclass.File file, Project project) throws WrongResourceException {
        this.project = project;
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
