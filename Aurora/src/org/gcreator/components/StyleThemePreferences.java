/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components;

import com.l2fprod.common.swing.JFontChooser;
import java.awt.Color;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;
import org.gcreator.components.codeeditor.ColorCodedTextArea;
import org.gcreator.components.impl.VectorListModel;
import org.gcreator.managers.ScriptThemeManager;
import publicdomain.*;

/**
 *
 * @author  luis
 */
public class StyleThemePreferences extends javax.swing.JPanel {
    
    public ColorCodedTextArea g = new ColorCodedTextArea(null, "{\n" +
                "\tvar x, y, z; //Variable declaration\n" +
                "\tx = true;\n" +
                "\ty = 1.0;\n" +
                "\tz = \"Hello World\";\n" +
                "\tif(clipboard_has_text())\n" +
                "\t\treturn clipboard_get_text();\n" +
                "\telse\n" +
                "\t\treturn null;\n" +
                "}");
    
    /** Creates new form StyleThemePreferences */
    public StyleThemePreferences() {
        initComponents();
        Vector<String> v = new Vector<String>();
        Enumeration<String> e = ScriptThemeManager.getColors().keys();
        
        while(e.hasMoreElements()){
            v.add(e.nextElement());
        }
        
        jButton1.setFont(ScriptThemeManager.getFonts().get(v.firstElement()));
        jList1.setModel(new VectorListModel(v));
        jList1.setSelectedIndex(0);
        
        g.setEditable(false);// - doesn't work
        g.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        this.jScrollPane2.setViewportView(g);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        colorSelection1 = new org.gcreator.components.ColorSelection();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Keywords", "Comments", "Strings", "Functions", "Curly Brackets", "Square Brackets", "Brackets", "Semi-colons", "Numbers", "Objects", "JavaDocs", "Plain Text" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preview"));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Style"));

        jLabel1.setText("Color:");

        colorSelection1.setBackground(new java.awt.Color(254, 254, 254));
        colorSelection1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        colorSelection1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                colorSelection1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                colorSelection1MouseReleased(evt);
            }
        });
        colorSelection1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                colorSelection1PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout colorSelection1Layout = new javax.swing.GroupLayout(colorSelection1);
        colorSelection1.setLayout(colorSelection1Layout);
        colorSelection1Layout.setHorizontalGroup(
            colorSelection1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );
        colorSelection1Layout.setVerticalGroup(
            colorSelection1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jLabel2.setText("Font:");

        jButton1.setBackground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Choose Font");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorSelection1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorSelection1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton2.setText("Apply");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void colorSelection1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_colorSelection1PropertyChange
        ScriptThemeManager.getColors().put(jList1.getSelectedValue().toString(), colorSelection1.getBackground());
        ScriptThemeManager.save();
        g.repaint();
    }//GEN-LAST:event_colorSelection1PropertyChange

    private void colorSelection1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorSelection1MousePressed
        colorSelection1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        colorSelection1.repaint();
        ScriptThemeManager.getColors().remove(jList1.getSelectedValue().toString());
        ScriptThemeManager.getColors().put(jList1.getSelectedValue().toString(), colorSelection1.getBackground());
        ScriptThemeManager.save();
        ScriptThemeManager.reload();
    }//GEN-LAST:event_colorSelection1MousePressed

    private void colorSelection1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorSelection1MouseReleased
        colorSelection1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        colorSelection1.repaint();
        ScriptThemeManager.getColors().remove(jList1.getSelectedValue().toString());
        ScriptThemeManager.getColors().put(jList1.getSelectedValue().toString(), colorSelection1.getBackground());
        ScriptThemeManager.save();
        ScriptThemeManager.reload();
    }//GEN-LAST:event_colorSelection1MouseReleased

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        colorSelection1.setBackground(ScriptThemeManager.getColors().get(jList1.getSelectedValue().toString()));
        jButton1.setFont(ScriptThemeManager.getFonts().get(jList1.getSelectedValue().toString()));
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String selectedItem = jList1.getSelectedValue().toString();
        ScriptThemeManager.getFonts().put(selectedItem,JFontChooser.showDialog(this, "Choose Font for "+selectedItem, 
                ScriptThemeManager.getFonts().get(jList1.getSelectedValue().toString())));
        jButton1.setFont(ScriptThemeManager.getFonts().get(selectedItem));
        ScriptThemeManager.save();
    }//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    ScriptThemeManager.reload();
}//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.gcreator.components.ColorSelection colorSelection1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
