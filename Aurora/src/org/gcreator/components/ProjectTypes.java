/*
 * ProjectTypes.java
 *
 * Created on 4 de Setembro de 2007, 23:59
 */

package org.gcreator.components;

import org.gcreator.managers.*;
import javax.swing.*;

/**
 *
 * @author  LuÃ­s
 */
public class ProjectTypes extends JPanel {
    
    public static final int EMPTY_GAME = 0;
    public static final int RPG_GAME = 1;
    public static final int PLATFORM_GAME = 2;
    public static final int AIR_BATTLE = 3;
    public static final int EMPTY_MODULE = 4;
    
    /** Creates new form ProjectTypes */
    
    public GameProjects gmpro;
    public ModulesProjects modpro;
    //public PackageProjects pkgpro;
    //public ExtensionProjects extpro;
    public NewProject npro;
    
    public ProjectTypes(NewProject npro) {
        initComponents();
        this.npro = npro;
        gmpro = new GameProjects(this);
        modpro = new ModulesProjects(this);
        gmpro.tnum = 1;
        modpro.tnum = 0;
        //pkgpro = new PackageProjects(this);
        //pkgpro.tnum = 2;
        //extpro = new ExtensionProjects(this);
        //extpro.tnum = 3;
        jScrollPane1.setViewportView(gmpro);
        jScrollPane2.setViewportView(modpro);
        
        //jScrollPane2.setViewportView(pkgpro);
        //jScrollPane3.setViewportView(extpro);
        //jTabbedPane1.remove(jScrollPane2);
    }
    
    public int getProjectType(){
        if(gmpro.getSelectedProject()!=-1)
            return gmpro.getSelectedProject();
        if(modpro.getSelectedProject()!=-1)
            return modpro.getSelectedProject();
        /*if(pkgpro.getSelectedProject()!=-1)
            return pkgpro.getSelectedProject();
        if(extpro.getSelectedProject()!=-1)
            return extpro.getSelectedProject();*/
        return -1;
    }
    
    public JTabbedPane getTabbedPane(){
        return jTabbedPane1;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jTabbedPane1.addTab(LangSupporter.activeLang.getEntry(56), jScrollPane1);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jTabbedPane1.addTab(LangSupporter.activeLang.getEntry(206), jScrollPane2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    
}
