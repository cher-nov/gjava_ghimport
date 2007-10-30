/*
 * ImageEditor.java
 *
 * Created on 10 September 2007, 02:24
 */

package org.gcreator.editors;

import org.gcreator.components.TabPanel;
import org.gcreator.components.ImageDisplayer;
import javax.swing.*;

import org.gcreator.components.*;
import java.awt.*;
import javax.imageio.ImageIO;
import org.gcreator.fileclass.File;
import org.gcreator.fileclass.Project;

/**
 *
 * @author  Ali1
 */
public class ImageEditor extends TabPanel {
    
    /** Creates new form ImageEditor */
    private org.gcreator.fileclass.File file;
    
    private ImageDisplayer displayer;
    
    public ImageEditor(org.gcreator.fileclass.File file,Project project) {
        this.project = project;
        this.file = file;
        displayer = new ImageDisplayer(this, file);
        initComponents();
        
        jScrollPane1.setViewportView(displayer);
        
        jTextField1.setText(file.name);
        
        int w = 0;
        int h = 0;
        if(file.value!=null){
            w = ((ImageIcon) file.value).getIconWidth();
            h = ((ImageIcon) file.value).getIconHeight();
        }
        widthLabel.setText("Width: " + w);
        heightLabel.setText("Height: " + h);
    }
    
    @Override
    public boolean wasModified(){
        return false;
    }
    
    @Override
    public boolean canSave(){
        return false; //Not needed
    }
        
    @Override
    public boolean Save(){
        return true;
    }
    
    @Override
    public void dispose(){
        if(!wasModified())
            super.dispose();
        else{
            java.lang.Object[] options = {"Yes",
                    "No",
                    "Cancel"};
            int n = JOptionPane.showOptionDialog(frame,
            "You have unsaved changes in your document.\n" +
            "Do you want to save it?",
            "Save document?",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[2]);
            if(n==JOptionPane.YES_OPTION){
                if(Save())
                    super.dispose();
            }
            if(n==JOptionPane.NO_OPTION){
                super.dispose();
            }
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        widthLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        colorSelection1 = new org.gcreator.components.ColorSelection();

        jButton1.setText(org.gcreator.managers.LangSupporter.activeLang.getEntry(118));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel1.setText(org.gcreator.managers.LangSupporter.activeLang.getEntry(119));

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        widthLabel.setText("0");

        heightLabel.setText("0");

        colorSelection1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        colorSelection1.setToolTipText("Transparent Colour");

        org.jdesktop.layout.GroupLayout colorSelection1Layout = new org.jdesktop.layout.GroupLayout(colorSelection1);
        colorSelection1.setLayout(colorSelection1Layout);
        colorSelection1Layout.setHorizontalGroup(
            colorSelection1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 37, Short.MAX_VALUE)
        );
        colorSelection1Layout.setVerticalGroup(
            colorSelection1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 26, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                .add(jButton1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 162, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(6, 6, 6)
                                .add(colorSelection1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                .add(widthLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(heightLabel)))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jButton1)
                            .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel1)
                            .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(widthLabel)
                            .add(heightLabel)))
                    .add(colorSelection1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public static JFileChooser jFileChooser1 = null;
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jFileChooser1==null)
            jFileChooser1 = new JFileChooser();
        
        try{
            jFileChooser1.resetChoosableFileFilters();
			JFileFilter filter = new JFileFilter(".*\\.gif|.*\\.jpg|.*\\.png","Image Files (png, gif, jpg)");
			jFileChooser1.addChoosableFileFilter(filter);
			jFileChooser1.setFileFilter(filter);
        jFileChooser1.showDialog(this, "OK");
        if(jFileChooser1.getSelectedFile()!=null){
            java.io.File _file = jFileChooser1.getSelectedFile();
            file.type = _file.getName().substring(_file.getName().lastIndexOf(".")+1);
            file.value = new ImageIcon(ImageIO.read(_file));
            file.treeimage = File.getScaledIcon((ImageIcon) file.value);
            //file.treeimage = File.getScaledIcon((ImageIcon) file.value);
            org.gcreator.core.Aurwindow.workspace.updateUI();
            jScrollPane1.updateUI();
            System.out.println(file.name + "." + file.type);
        }
        }
        catch(Exception e){}
        int w = 0;
        int h = 0;
        if(file.value!=null){
            w = ((ImageIcon) file.value).getIconWidth();
            h = ((ImageIcon) file.value).getIconHeight();
        }
        widthLabel.setText("Width: " + w);
        heightLabel.setText("Height: " + h);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        file.name = jTextField1.getText();
        org.gcreator.core.Aurwindow.workspace.updateUI();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        file.name = jTextField1.getText();
        org.gcreator.core.Aurwindow.workspace.updateUI();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        updateScroll();
    }//GEN-LAST:event_jSpinner1StateChanged
    
    public void updateScroll(){
        System.out.println("Update");
        if(((Integer) jSpinner1.getValue()) > 5)
            jSpinner1.setValue(5);
        else if(((Integer) jSpinner1.getValue()) < -5)
            jSpinner1.setValue(-5);
        displayer.zoom = getZoom();
        displayer.updateUI();
        jScrollPane1.updateUI();
    }
    
    public double getZoom(){
        int x = ((Integer) jSpinner1.getValue()).intValue();
        switch(x){
        case 5: return 6;
        case 4: return 5;
        case 3: return 4;
        case 2: return 3;
        case 1: return 2;
        case 0: return 1;
        case -1: return 0.5;
        case -2: return 0.33;
        case -3: return 0.25;
        case -4: return 0.2;
        default: return 0.16;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private org.gcreator.components.ColorSelection colorSelection1;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel widthLabel;
    // End of variables declaration//GEN-END:variables
    
}