/*
 * PluginsManager.java
 *
 * Created on 7 de Setembro de 2007, 19:47
 */

package org.gcreator.components;

import org.gcreator.components.*;
import javax.swing.*;
import java.io.*;

import org.gcreator.managers.*;
import org.gcreator.plugins.*;

/**
 *
 * @author  Luís
 * 
 */

abstract class AcessibleModel extends AbstractListModel{
    public Object[] getObjects(){return null;}
    public void setObjects(Object[] o){}
}

public class PluginsManager extends javax.swing.JDialog {
    
    /** Creates new form PluginsManager */
    public PluginsManager(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jList1.setModel(new AcessibleModel(){
            Object[] strings = PluginsList.loadPluglist();
            public int getSize() {
                int i = 0;
                if(strings==null)
                    return 0;
                for(Object x : strings)
                    if(x==null)
                        return i;
                    else
                        i++;
                return i;
            }
            public Object getElementAt(int i) { return strings[i]; }
            @Override
            public Object[] getObjects(){
                return strings;
            }
            public void setObjects(Object[] o){
                strings = o;
            }
        });
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(LangSupporter.activeLang.getEntry(110));

        jScrollPane1.setViewportView(jList1);

        jButton1.setText(LangSupporter.activeLang.getEntry(111));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(LangSupporter.activeLang.getEntry(112));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(LangSupporter.activeLang.getEntry(113));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(208, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AcessibleModel model = (AcessibleModel) jList1.getModel();
        Object[] contents = model.getObjects();
        Object[] values = jList1.getSelectedValues();
        int clen = contents.length;
        int vlen = values.length;
        for(int i = 0; i < clen; i++)
            if(contents[i]!=null)
                for(int j = 0; j < vlen; j++)
                    if(values[j]!=null){
                        contents[i] = null;
                        values[j] = null;
                    }
        Object[] newarray = new String[clen-vlen];
        int i = 0;
        int j = 0;
        while(i < clen){
            if(contents[i]!=null){
                newarray[j++] = contents[i];
            }
            i++;
        }
        model.setObjects(newarray);
        //jList1.setModel(model);
        jList1.updateUI();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ((AcessibleModel) jList1.getModel()).setObjects(PluginsList.loadPluglist());
        jList1.updateUI();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String res = JOptionPane.showInputDialog(this, "Insert extension name:\n(Remember that it must be in the 'plugins' directory.");
        AcessibleModel model = (AcessibleModel) jList1.getModel();
        Object[] contents = model.getObjects();
        int clen;
        if(contents!=null)
            clen = contents.length;
        else
            clen = 0;
        Object[] newarray = new String[clen+1];
        int i = 0;
        int j = 0;
        while(i < clen){
            if(contents[i]!=null){
                newarray[j] = contents[i];
                j++;
            }
            i++;
        }
        newarray[j] = res;
        model.setObjects(newarray);
        jList1.updateUI();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void dispose(){
        //Saving
        String writter = "";
        String[] x = (String[]) ((AcessibleModel) jList1.getModel()).getObjects();
        for(String alfa : x){
            if(alfa!=null){
                writter += "<plugin>";
                writter += alfa;
                writter += "</plugin>";
            }
        }
        
        try{
            FileWriter b = new FileWriter("pluglist.xml");
            BufferedWriter out = new BufferedWriter(b);
            out.write("<?xml version = \"1.0\"?>\n");
            out.write("<pluglist>");
            out.write(writter);
            out.write("</pluglist>");
            out.close();
        }
        catch(Exception e){}
        super.dispose();
    }
    
}
