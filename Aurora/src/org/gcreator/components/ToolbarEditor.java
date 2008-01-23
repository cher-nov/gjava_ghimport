/*
 * ToolbarManager.java
 *
 * Created on 21 de Dezembro de 2007, 23:38
 */

package org.gcreator.components;

import java.util.*;
import javax.swing.*;
import org.gcreator.components.impl.*;
import org.gcreator.managers.*;

/**
 *
 * @author  luis
 */
public class ToolbarEditor extends javax.swing.JPanel {
    
    /** Creates new form ToolbarManager */
    public ToolbarEditor() {
        initComponents();
        jComboBox1.setModel(new VectorComboBoxModel(ToolbarManager.toolbars));
        jComboBox1.setRenderer(new ToolbarCellRenderer());
        if(ToolbarManager.toolbars.size()>0)
            jComboBox1.setSelectedIndex(0);
        else
            jComboBox1.setSelectedIndex(-1);
        updateToolbar();
        ListCellRenderer r = new ToolButtonListCellRenderer();
        jList1.setCellRenderer(r);
        Vector v = new Vector();
        v.add(new ToolbarSeparator());
        v.addAll(ToolbarManager.toolbuttons);
        jList2.setModel(new VectorListModel(v));
        jList2.setCellRenderer(r);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jCheckBox5 = new javax.swing.JCheckBox();

        jLabel1.setText("Select toolbar to edit:");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Create new Toolbar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Floatable");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Rollover");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Location:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Top", "Bottom", "Left", "Right" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Text Visible");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Image Visible");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jButton2.setText("Remove Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Delete Toolbar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Move Up");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Move Down");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Rename Toolbar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList2);

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jCheckBox5.setText("Bold");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(jCheckBox2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 306, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, 0, 306, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox3)
                                    .addComponent(jCheckBox4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jCheckBox5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                                .addComponent(jButton6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                                .addComponent(jButton7)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jCheckBox1)
                    .addComponent(jButton5)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton6)
                                    .addComponent(jCheckBox5)))
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        Toolbar t = (Toolbar) jComboBox1.getSelectedItem();
        t.floatable = jCheckBox1.isSelected();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        Toolbar t = (Toolbar) jComboBox1.getSelectedItem();
        t.rollover = jCheckBox2.isSelected();
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        updateToolbar();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        int index = jComboBox2.getSelectedIndex();
        Toolbar t = (Toolbar) jComboBox1.getSelectedItem();
        if(index==0){
            t.horizontal = true;
            t.first = true;
        }
        if(index==1){
            t.horizontal = true;
            t.first = false;
        }
        if(index==2){
            t.horizontal = false;
            t.first = true;
        }
        if(index==3){
            t.horizontal = false;
            t.first = false;
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int index = jList1.getSelectedIndex();
        if(index<=0)
            return;
        Toolbar t = (Toolbar) jComboBox1.getSelectedItem();
        ToolbarItem before = t.items.get(index-1);
        ToolbarItem self = t.items.get(index);
        t.items.set(index-1, self);
        t.items.set(index, before);
        updateToolbar();
        jList1.setSelectedIndex(index-1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int index = jList1.getSelectedIndex();
        Toolbar t = (Toolbar) jComboBox1.getSelectedItem();
        t.items.trimToSize();
        if(index>=t.items.size())
            return;
        ToolbarItem after = t.items.get(index+1);
        ToolbarItem self = t.items.get(index);
        t.items.set(index+1, self);
        t.items.set(index, after);
        updateToolbar();
        jList1.setSelectedIndex(index+1);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Toolbar t = (Toolbar) jComboBox1.getSelectedItem();
        if(t!=null){
            ToolbarManager.toolbars.remove(t);
            updateToolbar();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = JOptionPane.showInputDialog(this, "Toolbar name", "untitled");
        if(name==null)
            return;
        Toolbar t = new Toolbar();
        t.name = name;
        ToolbarManager.toolbars.add(t);
        updateToolbar();
        jComboBox1.setSelectedIndex(ToolbarManager.toolbars.indexOf(t));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Toolbar t = (Toolbar) jComboBox1.getSelectedItem();
        if(t==null)
            return;
        ToolbarItem item = (ToolbarItem) jList2.getSelectedValue();
        t.items.add(item);
        updateToolbar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Toolbar t = (Toolbar) jComboBox1.getSelectedItem();
        if(t==null)
            return;
        ToolbarItem item = (ToolbarItem) jList2.getSelectedValue();
        if(item==null)
            return;
        t.items.remove(item);
        updateToolbar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        updateToolItem();
    }//GEN-LAST:event_jList1ValueChanged

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        ToolbarItem item = (ToolbarItem) jList1.getSelectedValue();
        if(item==null||item instanceof ToolbarSeparator)
            return;
        ((ToolbarButton) item).setTextVisible(jCheckBox3.isSelected());
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        ToolbarItem item = (ToolbarItem) jList1.getSelectedValue();
        if(item==null||item instanceof ToolbarSeparator)
            return;
        ((ToolbarButton) item).setImageVisible(jCheckBox4.isSelected());
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        ToolbarItem item = (ToolbarItem) jList1.getSelectedValue();
        if(item==null||item instanceof ToolbarSeparator)
            return;
        ((ToolbarButton) item).setBold(jCheckBox5.isSelected());
    }//GEN-LAST:event_jCheckBox5ActionPerformed
    
    public void updateToolbar(){
        Toolbar t = (Toolbar) jComboBox1.getSelectedItem();
        if(t==null){
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox1.setEnabled(false);
            jCheckBox2.setEnabled(false);
            jComboBox2.setEnabled(false);
            jList1.setModel(new VectorListModel(new Vector()));
            jList1.setEnabled(false);
            jButton5.setEnabled(false);
            jButton8.setEnabled(false);
            return;
        }
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jComboBox2.setEnabled(true);
        jButton5.setEnabled(true);
        jButton8.setEnabled(true);
        jCheckBox1.setSelected(t.floatable);
        jCheckBox2.setSelected(t.rollover);
        if(t.first&&t.horizontal)
            jComboBox2.setSelectedIndex(0);
        if(!t.first&&t.horizontal)
            jComboBox2.setSelectedIndex(1);
        if(t.first&&!t.horizontal)
            jComboBox2.setSelectedIndex(2);
        if(!t.first&&!t.horizontal)
            jComboBox2.setSelectedIndex(3);
        jList1.setEnabled(true);
        jList1.setModel(new VectorListModel(t.items));
        if(t.items.size()==0)
            jList1.setSelectedIndex(-1);
        else
            jList1.setSelectedIndex(0);
        updateToolItem();
    }
    
    public void updateToolItem(){
        ToolbarItem item = (ToolbarItem) jList1.getSelectedValue();
        if(item==null||item instanceof ToolbarSeparator){
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox3.setEnabled(false);
            jCheckBox4.setEnabled(false);
            jCheckBox5.setEnabled(false);
            jCheckBox5.setSelected(false);
            return;
        }
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox3.setSelected(((ToolbarButton) item).isTextVisible());
        jCheckBox4.setSelected(((ToolbarButton) item).isImageVisible());
        jCheckBox5.setSelected(((ToolbarButton) item).isBold());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
}
