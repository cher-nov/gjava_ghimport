/*
 * aurora.java
 * 
 * Created on 24/Ago/2007, 13:32:12
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.core;

import org.gcreator.editors.ActorEditor;
import org.gcreator.plugins.*;
import org.gcreator.managers.*;
import org.gcreator.clipboard.*;
import org.gcreator.languages.*;

import javax.swing.*;
import org.gcreator.components.NewFileGroup;
import org.gcreator.components.NewProject;
import org.gcreator.help.AboutPanel;

/**
 *
 * @author Luís
 */
public class gcreator {
    private static String[] arguments;
    public static final String version = "1.0alpha"; 
    public static Aurwindow window;
    public static String output = "";
    private static SplashScreen splash;
    public static PluginCore[] plugins;
    public static ClipboardManager clipboard = new ClipboardManager();
    public static String folder;
    public static final String java_version = System.getProperty("java.version");
    
    public static String[] getargs(){
        return arguments;
    }
    
    protected static boolean applet;
    
    public static void main(String[] args){
        applet = false;
        __main(args);
    }
    
    protected static boolean plugload = true;
    
    public static void __main(String[] args, boolean plugload, boolean applet){
        gcreator.plugload = plugload;
        gcreator.applet = applet;
        __main(args);
    }
    
    public static void __main(String[] args){
        //System.setProperty("file.encoding", "UTF-8");
        boolean plugload = true;
        System.out.println("Running Java version " + java_version);
        for(int i = 0; i < args.length; i++){
            System.out.println("args[" + i + "] = " + args[i]);
            if(args[i].equals("-safe"))
                plugload = false;
        }
        if(!applet){
        folder = "" + gcreator.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		int location = folder.lastIndexOf("/");
		folder = folder.substring(0,location+1);
		folder = folder.replaceAll("file://","");
		folder = folder.replaceAll("%20"," ");
		folder = folder.substring(1);
		folder = folder.replace("/","\\");
                if(plugload)
                    plugins = Plugger.getPlugList(PluginsList.loadPluglist());
        }
        arguments = args;
        if(!applet&&plugload){
            Plugger.loadPlugins(plugins);
            Plugger.onSplashStart(plugins);
        }
        splash = new SplashScreen(applet);
        
        String[] settings = null;
        
        if(!applet){
            settings = SettingsIO.loadSettings();
        }

        if (settings == null) {
            settings = new String[5];
            settings[0] = "Native";
            settings[1] = "Tabs";
            settings[2] = "Visible";
            settings[3] = "English";
            settings[4] = "Visible";
        }

        LangSupporter.activeLang = new English();
        
        if (!settings[3].equals("English")) {
            if (settings[3].equals("Portuguese (European)")) {
                LangSupporter.activeLang = new Portuguese();
            } else if (settings[3].equals("German")) {
                LangSupporter.activeLang = new German();
            } else if (settings[3].equals("German (Old)")) {
                LangSupporter.activeLang = new GermanOld();
            } else if (settings[3].equals("Russian")) {
                LangSupporter.activeLang = new Russian();
            } else if (settings[3].equals("Spanish")) {
                LangSupporter.activeLang = new Spanish();
            } else {
                utilities.addError(36);
            }
        }

        try {
            if (settings != null && settings[0] != null && settings[0].equals("Native")) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } else if (settings == null || settings[0] == null || settings[0].equals("Cross-platform")) {
                javax.swing.plaf.metal.MetalLookAndFeel.setCurrentTheme(new javax.swing.plaf.metal.OceanTheme());
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } else if (settings[0].equals("Motif")) {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            } else if (settings[0].equals("Metal")) {
                javax.swing.plaf.metal.MetalLookAndFeel.setCurrentTheme(new javax.swing.plaf.metal.DefaultMetalTheme());
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            }
            
        } catch (Exception e) {}
        if(!applet&&plugload)
            Plugger.onMainWindowStart(plugins);
        //ActorEditor.setupActions();
        
        window = new Aurwindow(settings);
        window.console.setText(output);
        Aurwindow.globalsettings = new org.gcreator.components.GlobalSettings();
        Aurwindow.newfilegroup = new NewFileGroup();
        Aurwindow.newproject = new NewProject();
        Aurwindow.about = new AboutPanel();
        if(splash!=null){
            if(!applet&&plugload)
                Plugger.onSplashDispose(gcreator.plugins);
            window.menubar.updateUI();
            splash.dispose();
        }
    }
}
