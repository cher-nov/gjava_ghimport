/*
 * Changes Copyright (C) 2007 TGMG www.g-creator.org
 * Copyright (C) 2007 Clam <ebordin@aapt.net.au>
 *
 * This file is part of Lateral GM.
 * Lateral GM is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for details.
 */

package org.gcreator.components;

import org.gcreator.editors.SpriteEditor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.*;


public class SubimagePreview extends JPanel {

    private static final long serialVersionUID = 1L;
    private SpriteEditor editor;
    private static final int ORIGIN_SIZE = 20;

    public SubimagePreview(SpriteEditor frame) {
        super();
        editor = frame;
    }

     
    public void paint(Graphics g) {
        boolean isBlack = true;
        for (int i = 0; i <= getWidth() / 10; i++) {
            boolean isNBlack = isBlack;
            for (int j = 0; j <= getHeight() / 10; j++) {
                if (isBlack = !isBlack) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.LIGHT_GRAY);
                }
                g.fillRect(i * 10 + 1, j * 10 + 1, 10, 10);
            }
            isBlack = !isNBlack;
        }

        if (editor.getCurrentImage() != null) {
            g.drawImage(editor.getCurrentImage().getImage(), 0, 0, editor.getCurrentImage().getImageObserver());
        }
        g.setColor(Color.BLACK);
        g.drawLine(editor.sprite.originX-10, editor.sprite.originY, editor.sprite.originX+10, editor.sprite.originY);
        g.drawLine(editor.sprite.originX, editor.sprite.originY-10, editor.sprite.originX, editor.sprite.originY+10);
        g.drawRect(editor.sprite.BBleft-1, editor.sprite.BBTop-1, editor.sprite.width-editor.sprite.BBRight-editor.sprite.BBleft, editor.sprite.height-editor.sprite.BBTop-editor.sprite.BBBottom);
        g.drawRect(editor.sprite.BBleft+1, editor.sprite.BBTop+1, editor.sprite.width-editor.sprite.BBRight-editor.sprite.BBleft, editor.sprite.height-editor.sprite.BBTop-editor.sprite.BBBottom);
        g.setColor(Color.WHITE);
        g.drawRect(editor.sprite.BBleft, editor.sprite.BBTop, editor.sprite.width-editor.sprite.BBRight-editor.sprite.BBleft, editor.sprite.height-editor.sprite.BBTop-editor.sprite.BBBottom);
    }
    
     
    public int getWidth(){
        if(editor.getCurrentImage()==null)
            return 0;
        return editor.getCurrentImage().getIconWidth();
    }
    
     
    public int getHeight(){
        if(editor.getCurrentImage()==null)
            return 0;
        return editor.getCurrentImage().getIconHeight();
    }
    
     
    public Dimension getPreferredSize(){
        return new Dimension(getWidth(), getHeight());
    }
}