/*
 * ImageEditor2.java
 *
 * Created on 8 de Maio de 2008, 20:46
 */
package org.gcreator.editors;

import java.awt.Color;
import java.awt.image.*;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.*;
import org.gcreator.components.*;
import org.gcreator.fileclass.*;
import org.gcreator.fileclass.res.*;

/**
 *
 * @author  luis
 */
public class ImageEditor2 extends TabPanel {

    public GImage i;
    public boolean changed;
    public ImagePane pane;
    public String type;
    
    public static JFileChooser jFileChooser1 = null;

    /** Creates new form ImageEditor2 */
    public ImageEditor2(Project p, GFile f) {
        this.project = p;
        this.file = f;
        
        i = new GImage();
        if (f.value == null || ((GImage) f.value).image == null) {
            i.image = new ImageIcon(new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB));
            changed = true;
        } else {
            BufferedImage img = new BufferedImage(((GImage) f.value).image.getIconWidth(),
                    ((GImage) f.value).image.getIconHeight(),
                    ((BufferedImage) ((GImage) f.value).image.getImage()).getType());
            img.getGraphics().drawImage(((GImage) f.value).image.getImage(), 0, 0,
                    ((GImage) f.value).image.getImageObserver());
            i.readXml(file.xml);
            i.image = new ImageIcon(img);
        }

        initComponents();
        
        pane = new ImagePane(this);
        jScrollPane1.setViewportView(pane);
    }
    
    @Override
    public boolean canSave(){
        return !changed;
    }
    
    @Override
    public boolean wasModified(){
        return changed;
    }
    
    @Override
    public boolean Save(){
        changed = false;
        file.value = i;
        return true;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        colorSelection1 = new org.gcreator.components.ColorSelection();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        colorSelection2 = new org.gcreator.components.ColorSelection();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Image"));

        jButton1.setText(org.gcreator.managers.LangSupporter.activeLang.getEntry(118));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jLabel1.setText(org.gcreator.managers.LangSupporter.activeLang.getEntry(119));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, -5, 5, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Transparency"));

        colorSelection1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        colorSelection1.setToolTipText("Transparent Colour");
        colorSelection1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorSelection1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorSelection1Layout = new javax.swing.GroupLayout(colorSelection1);
        colorSelection1.setLayout(colorSelection1Layout);
        colorSelection1Layout.setHorizontalGroup(
            colorSelection1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        colorSelection1Layout.setVerticalGroup(
            colorSelection1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jCheckBox1.setText("Transparent");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(colorSelection1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colorSelection1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jCheckBox1)
                .addContainerGap())
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit"));

        colorSelection2.setBackground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout colorSelection2Layout = new javax.swing.GroupLayout(colorSelection2);
        colorSelection2.setLayout(colorSelection2Layout);
        colorSelection2Layout.setHorizontalGroup(
            colorSelection2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        colorSelection2Layout.setVerticalGroup(
            colorSelection2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(255, 0, 255, 10));

        jLabel2.setText("Opacity");

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gcreator/actions/images/Draw2D.png"))); // NOI18N
        jToggleButton1.setSelected(true);
        jToggleButton1.setBorderPainted(false);

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gcreator/actions/images/Draw2D.png"))); // NOI18N
        jToggleButton2.setSelected(true);
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gcreator/actions/images/Draw2D.png"))); // NOI18N
        jToggleButton3.setSelected(true);
        jToggleButton3.setBorderPainted(false);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButton4);
        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gcreator/actions/images/Draw2D.png"))); // NOI18N
        jToggleButton4.setSelected(true);
        jToggleButton4.setBorderPainted(false);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(colorSelection2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton4)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jToggleButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(colorSelection2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton3)
                    .addComponent(jToggleButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
    i.zoom = (Integer) jSpinner1.getValue();
    updateScroll();
}//GEN-LAST:event_jSpinner1StateChanged

private void colorSelection1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorSelection1MouseClicked
        updateScroll();
        i.transparentColor = colorSelection1.getBackground();
}//GEN-LAST:event_colorSelection1MouseClicked

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if (jFileChooser1 == null) {
            jFileChooser1 = new JFileChooser();
        }

        try {
            jFileChooser1.resetChoosableFileFilters();
            JFileFilter filter = new JFileFilter(".*\\.gif|.*\\.jpg|.*\\.png", "Image Files (*.png, *.gif, *.jpg)");
            jFileChooser1.addChoosableFileFilter(filter);
            JFileFilter filter2 = new JFileFilter(".*\\.*", "Any Files (*.*)");
            jFileChooser1.addChoosableFileFilter(filter2);
            jFileChooser1.setFileFilter(filter);
            jFileChooser1.showDialog(this, "OK");
            if (jFileChooser1.getSelectedFile() != null) {
                java.io.File _file = jFileChooser1.getSelectedFile();
                type = _file.getName().substring(_file.getName().lastIndexOf(".") + 1);
                if (type.toLowerCase().equals("gif")) {
                    System.out.println("GIF!");
                    //                    boolean animated = false;
                    ImageReader reader = ImageIO.getImageReadersByFormatName("gif").next();
                    //                    if (reader.getNumImages(true) > 1) {
//                        animated = true;
//                    }
                    reader.setInput(new FileImageInputStream(_file));
                    System.out.println("No: "+reader.getNumImages(true));
                    BufferedImage[] b = new BufferedImage[reader.getNumImages(true)];
                    
                    for (int i = 0; i < reader.getNumImages(true); i++) {
                        b[i] = reader.read(i);
                    }
                    i.image = new ImageIcon(b[0]);
                    //file.treevalue = File.getScaledIcon(new ImageIcon(b[1]));
                } else {
                    i.image = new ImageIcon(ImageIO.read(_file));
                    //file.treevalue = File.getScaledIcon((ImageIcon) file.value);
                }
                org.gcreator.core.Aurwindow.workspace.updateUI();
                jScrollPane1.updateUI();
            }
        } catch (Exception e) {
        }
        updateScroll();
}//GEN-LAST:event_jButton1ActionPerformed

private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jToggleButton2ActionPerformed

private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jToggleButton3ActionPerformed

private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jToggleButton4ActionPerformed

    public void updateScroll() {
        changed = true;
        pane.repaint();
        pane.updateUI();
        jScrollPane1.updateUI();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private org.gcreator.components.ColorSelection colorSelection1;
    public org.gcreator.components.ColorSelection colorSelection2;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    public javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JToggleButton jToggleButton2;
    public javax.swing.JToggleButton jToggleButton3;
    public javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
