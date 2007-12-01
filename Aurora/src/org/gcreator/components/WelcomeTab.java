/*
 * WelcomeTab.java
 *
 * Created on 24 de Agosto de 2007, 17:23
 */

package org.gcreator.components;

import javax.swing.*;
import java.awt.*;
import org.gcreator.managers.*;

/**
 *
 * @author  Luís
 */
public class WelcomeTab extends TabPanel{
    
    /** Creates new form WelcomeTab */
    public WelcomeTab() {
        initComponents();
        jLabel1.setText(LangSupporter.activeLang.getEntry(37));
        jLabel2.setText(LangSupporter.activeLang.getEntry(38));
    }
    
    public void paint(Graphics _g){
        Graphics2D g = (Graphics2D) _g;
        DarkGradientPainter.paint(g, getWidth(), getHeight());
        super.paintChildren(g);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSSBlogReadPanel1 = new org.gcreator.components.RSSBlogReadPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rSSReadPanel1 = new org.gcreator.components.RSSReadPanel();
        rSSBlogReadPanel2 = new org.gcreator.components.RSSBlogReadPanel();

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Aurora,");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The Next Generation of G-Creator");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 23, Short.MAX_VALUE)
                        .add(rSSReadPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, rSSBlogReadPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel2))
                    .add(rSSReadPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rSSBlogReadPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private org.gcreator.components.RSSBlogReadPanel rSSBlogReadPanel1;
    private org.gcreator.components.RSSBlogReadPanel rSSBlogReadPanel2;
    private org.gcreator.components.RSSReadPanel rSSReadPanel1;
    // End of variables declaration//GEN-END:variables
    
}
