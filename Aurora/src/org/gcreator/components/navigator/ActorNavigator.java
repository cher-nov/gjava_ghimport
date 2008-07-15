/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.navigator;

import javax.swing.*;

/**
 *
 * @author  luis
 */
public class ActorNavigator extends JPanel {
    
    /** Creates new form ActorNavigator */
    private org.gcreator.fileclass.GFile file;
    public ActorNavigator(org.gcreator.fileclass.GFile actor) {
        this.file = actor;
        initComponents();
    }
    public org.gcreator.fileclass.res.Actor getActor(){
        if(file==null)
            return null;
        Object o = file.value;
        if(o!=null&&o instanceof org.gcreator.fileclass.res.Actor)
            return (org.gcreator.fileclass.res.Actor) o;
        return null;
    }
    
    public String getHTML(){
        System.out.println("get HTML");
        org.gcreator.fileclass.res.Actor actor = getActor();
        if(actor==null){
            return "<b><font color='red'>Invalid Actor</font></b>";
        }
        String result = "<b>Name:</b> ";
        //result += actor.name;
        result += file.name;
        result += "<br/><b>Extends:</b> ";
        result += actor.extend;
        result += "<br/><b>Sprite:</b> ";
        result += actor.sprite;
        result += "<br/><b>Mask:</b> ";
        result += actor.mask;
        result += "<br/><b>Depth:</b> ";
        result += actor.depth;
        result += "<br/><b>Solid:</b> ";
        result += actor.solid ? "True" : "False";
        result += "<br/><b>Visible:</b>: ";
        result += actor.visible ? "True" : "False";
        result += "<br/><b>Persistent</b> ";
        result += actor.persistent ? "True" : "False";
        return result;
    }
    
    public void updateUI(){
        System.out.println("update UI");
        super.updateUI();
        try{
            jEditorPane1.setText(getHTML());
        }
        catch(Exception e){}
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        jEditorPane1.setContentType("text/html");
        jEditorPane1.setEditable(false);
        jEditorPane1.setText(getHTML());
        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
