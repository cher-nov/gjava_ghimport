/*
 * SplashScreen.java
 *
 * Created on 5 de Setembro de 2007, 17:30
 */

package core;

import javax.swing.*;
import java.awt.*;

import plugins.*;

/**
 *
 * @author  Luís
 */
public class SplashScreen extends JFrame {
    
    /** Creates new form SplashScreen */
    public SplashScreen() {
        initComponents();
        Dimension m = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(
                (m.width - this.getWidth()) / 2,
                (m.height - this.getHeight()) / 2);
        setVisible(true);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setTitle("Loading... Please Wait");
        setAlwaysOnTop(true);
        setResizable(false);
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/splashscreen20tf0.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void dispose(){
        super.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}
