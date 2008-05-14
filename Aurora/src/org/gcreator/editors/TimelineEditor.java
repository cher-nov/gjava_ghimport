/*
 * TimelineEditor.java
 *
 * Created on 27 de Dezembro de 2007, 19:31
 */

package org.gcreator.editors;

import org.gcreator.units.TimelineStep;
import java.util.Vector;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.event.*;
import org.gcreator.actions.*;
import org.gcreator.components.*;
import org.gcreator.components.impl.*;
import org.gcreator.components.popupmenus.*;
import org.gcreator.core.*;
import org.gcreator.exceptions.*;
import org.gcreator.fileclass.*;
import org.gcreator.fileclass.res.*;
import org.gcreator.managers.*;

/**
 *
 * @author  luis
 */
public class TimelineEditor extends TabPanel {
    
    private Timeline timeline;
    int from;
    DefaultComboBoxModel actmodel = new DefaultComboBoxModel();
    /** Creates new form TimelineEditor */
    public TimelineEditor(org.gcreator.fileclass.GFile file, Project project) throws WrongResourceException {
        this.project = project;
        this.file = file;
        if (file.value == null) {
            timeline = new Timeline(file.name);
            file.value = timeline;
        } else if (file.value instanceof Timeline) {
            this.timeline = (Timeline) file.value;
        } else {
            throw new WrongResourceException();
        }
        initComponents();
        PopupListener a = new PopupListener(jList1, new ActionPopupMenu(this));
        a.update = true;
        jList1.addMouseListener(a);
        jTextField1.setText(file.name);
        jTextField1.getDocument().addDocumentListener(new DocumentListener(){
            public void changedUpdate(DocumentEvent evt){
                updateName();
            }
            public void insertUpdate(DocumentEvent evt){
                updateName();
            }
            public void removeUpdate(DocumentEvent evt){
                updateName();
            }
        });
        jComboBox3.setModel(new VectorComboBoxModel(timeline.steps));
        jComboBox3.setRenderer(new TimelineStepsCellRenderer());
        jComboBox2.setModel(new DefaultComboBoxModel(ActionContainer.actionCats));
        jComboBox2.setRenderer(new ActionListCellRenderer());
        jList2.setModel(new DefaultComboBoxModel(ActionContainer.actionCats.get(0).patterns));
        jList2.setCellRenderer(new ActionListCellRenderer());
        jList1.setCellRenderer(new ActionsCellRenderer());
        jList1.setModel(actmodel);
    }
    
    public void updateName(){
        file.name = jTextField1.getText();
        //timeline.name = file.name;
        gcreator.panel.workspace.updateUI();
    }
    
    public void updateActionList() {
        actmodel.removeAllElements();
        if (jComboBox3.getSelectedItem() == null) {
            return;
        }
        Vector<org.gcreator.actions.Action> actions = (TimelineStep) jComboBox3.getSelectedItem();
        for (int i = 0; i < actions.size(); i++) {
            actmodel.addElement(actions.get(i));
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jComboBox2 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        jSplitPane1.setDividerLocation(150);

        jLabel1.setText(LangSupporter.activeLang.getEntry(136));

        jTextField1.setText("jTextField1");

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Remove");

        jButton4.setText("Change");

        jButton5.setText("Duplicate");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .add(jLabel1)
                    .add(jButton2)
                    .add(jButton3)
                    .add(jButton4)
                    .add(jButton5))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton5)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jSplitPane2.setDividerLocation(130);

        jPanel5.setMinimumSize(new java.awt.Dimension(100, 0));

        jButton1.setText(LangSupporter.activeLang.getEntry(146));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList2);

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jComboBox2, 0, 268, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jButton1))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(jPanel5);

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setMaximumSize(new java.awt.Dimension(250, 0));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jList1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jList1MouseDragged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jComboBox3, 0, 129, Short.MAX_VALUE)
            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel2);

        jSplitPane1.setRightComponent(jSplitPane2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSplitPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSplitPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            System.out.println("adding");
            if (jComboBox3.getSelectedItem() == null) {
                return;
            }
            if (jList2.getSelectedValue() == null) {
                return;
            }
            System.out.println("creating ap");
            ActionPattern ap = (org.gcreator.actions.ActionPattern) jList2.getSelectedValue();
            System.out.println("proceeding");
            org.gcreator.actions.Action a = new org.gcreator.actions.Action(this, ap);
            System.out.println("Action: "+a.getLabel());
            TimelineStep step = (TimelineStep) jComboBox3.getSelectedItem();
            System.out.println("Step " + step.stepnum);
            step.add(a);
            System.out.println("added");
            updateActionList();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jList2.setModel(new DefaultComboBoxModel(((ActionCategory) jComboBox2.getSelectedItem()).patterns));
        jList2.updateUI();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        jList1.setSelectedIndex(jList1.locationToIndex(evt.getPoint()));
}//GEN-LAST:event_jList1MouseClicked

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        from = jList1.locationToIndex(evt.getPoint());
        //jList2.updateUI();
}//GEN-LAST:event_jList1MousePressed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        if (jList1.getSelectedValue() == null) {
            return;
        }
        
        jScrollPane3.setViewportView(((org.gcreator.actions.Action) jList1.getSelectedValue()).getPanel());
}//GEN-LAST:event_jList1ValueChanged

    private void jList1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseDragged
        int to  = jList1.locationToIndex(evt.getPoint());
        if (to == from) return;
        org.gcreator.actions.Action remove = ((org.gcreator.events.Event) jList1.getSelectedValue()).actions.remove(from);
        ((org.gcreator.events.Event) jList1.getSelectedValue()).actions.add(to,remove);
        from = to;
        updateActionList();
}//GEN-LAST:event_jList1MouseDragged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String s = JOptionPane.showInputDialog(this, "Step number:", 0);
        if(s==null)
            return;
        try{
            int i = Integer.parseInt(s);
            if(i<0)
                return;
            TimelineStep step = new TimelineStep();
            step.stepnum = i;
            timeline.steps.add(step);
            jList1.updateUI();
            jComboBox3.updateUI();
        }
        catch(Exception e){}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        updateActionList();
    }//GEN-LAST:event_jComboBox3ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox2;
    public javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    
}
