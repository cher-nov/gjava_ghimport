package org.gjava.actoreditor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import org.gjava.actoreditor.Action.ActionData;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Properties;
import org.openide.cookies.OpenCookie;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.text.DataEditorSupport;
import org.openide.util.Utilities;
import org.openide.windows.TopComponent;

public class actorDataObject extends MultiDataObject 
implements Lookup.Provider {
    
   public  actorData data = new actorData();
   public Actoreditor ae;// = new ActorEditorTopComponent(this);
    
    public final FileObject pf2;

    public actorDataObject(FileObject pf, actorDataLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        CookieSet cookies = getCookieSet();
        pf2 = pf;
        InputStream input = pf.getInputStream();
        data.name = pf.getName();
        data.path = pf.getPath();
        
        
    BufferedReader from=new BufferedReader(new InputStreamReader(input));
   
        String line;
        boolean found = false;
        while ((line=from.readLine()) != null)
        {
            if (line.contains("<Image>") && line.contains("</Image>") && (found == false))
            {
              data.img = line.replaceAll("<Image>", "").replaceAll("</Image>", "");
               System.out.println(data.img);
               found = true;
            }
        }
    input.close();
       // data = new actorData();
       /* cookies.add(new OpenCookie() {
        
          public void open() {
        
        System.out.println("hey,hey,hey,hey");
         // c = (actorDataObject) node.getCookie(actorDataObject.class);
      
        //ActorEditorTopComponent re = ActorEditorTopComponent.getInstance(pf2.getPath());
        //re.setName(pf2.getPath());
       // re.path = pf2.getPath();
        //re.setHtmlDisplayName(c.getName());
       // re.setIcon(Utilities.loadImage("org/gjava/actoreditor/object.png"));
        //re.open();
       // re.requestActive();
    }
            
        });
        */
    cookies.add(new Save(this));
    cookies.add((Node.Cookie) DataEditorSupport.create(this, getPrimaryEntry(), cookies));
       writejava(); 
    }

    public void writejava()
     throws IOException {
        System.out.println("Write java");
        org.netbeans.api.project.Project pro = org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject();
            
   FileWriter BasicgameFW = new FileWriter(pro.getProjectDirectory().getPath()+"/org/gjava/runner/"+this.getName()+".java");
BufferedWriter Basicgame = new BufferedWriter(BasicgameFW);
    BufferedReader from=new BufferedReader(new InputStreamReader(this.getPrimaryFile().getInputStream()));
    String line="",solid="",visible="",eventcode="";
   
    
    //start java code
    print(Basicgame,"package org.gjava.runner;");
			print(Basicgame,"import java.awt.*;");
			print(Basicgame,"import java.awt.event.*;");
			print(Basicgame,"import javax.swing.*;");
			print(Basicgame,"import java.io.*;");
			print(Basicgame,"import java.util.*;");
			print(Basicgame,"import java.net.*;");
			print(Basicgame,"import java.applet.*;");
         print(Basicgame,"class " + this.getName() + " extends Actor {");
    
         //if already written header
         boolean alarm=false,collision=false,keyboard=false,keypress=false,keyrelease=false,mouse=false;
       while ((line=from.readLine()) != null)
        {
            
             if (line.contains("<Solid>") && line.contains("</Solid>"))
            {
                if (line.contains("True") )
                    
                    solid = "true";
                
                else
                   solid = "false";
            }
              if (line.contains("<Visible>") && line.contains("</Visible>"))
            {
                if (line.contains("True") )
                    
                    visible = "true";
                
                else
                   visible = "false";
            }
             String name="",img="",code="",args="";
             if (line.equals("<Event>")) {
                line=from.readLine();
                
                if (line.contains("<Name>") && line.contains("</Name>")) {
                    name = line.replaceAll("<Name>", "").replaceAll("</Name>", "");
                }
                line=from.readLine();
                if (line.contains("<Image>") && line.contains("</Image>")) {
                    img = line.replaceAll("<Image>", "").replaceAll("</Image>", "");
                }
                
                //write create event
                if (name.equals("Create Event"))
                print(Basicgame,"    public void Create_event() {");
                //write destroy event
                if (name.equals("Destory Event"))
                print(Basicgame,"    public void Destroy_event() {");
                //write step event
                if (name.equals("Step Event"))
                print(Basicgame,"    public void Step() {");
                //write draw event
                if (name.equals("Draw Event"))
                {
                    print(Basicgame,"    public void Draw_event(Graphics g) {");
					print(Basicgame,"			if (visible) {");
					print(Basicgame,"				Graphics comp2D = (Graphics2D)g;");
					print(Basicgame,"				g.setColor( Color.black );");
                }
                
                if (name.contains("Alarm"))
                {
                    if (alarm == false)
                    {
                        print(Basicgame,"    public void Alarm() {");
                        alarm = true;
                    }
                    int event = -1;
                    print(Basicgame,"    	if (G_JAVA_alarm[" + name.replaceAll("Alarm", "").replaceAll(" Event", "") + "] == 0) {");
					
                }
                
                                // 
                                
                
                line=from.readLine();
                while (!line.equals("</Event>")) {
                    code="";
                    args="";
                    //get actions
                    if (line.equals("<Action>")) {
                        line=from.readLine();
                        if (line.contains("<Name>") && line.contains("</Name>")) {
                            name = line.replaceAll("<Name>", "").replaceAll("</Name>", "");
                        }
                        line=from.readLine();
                        if (line.contains("<Image>") && line.contains("</Image>")) {
                            img = line.replaceAll("<Image>", "").replaceAll("</Image>", "");
                            System.out.println(img);
                        }
                        line=from.readLine();
                        if (line.contains("<Code>")) {
                            if (line.contains("</Code>"))
                                code = code+ line.replaceAll("<Code>", "").replaceAll("</Code>", "")+"\n";
                            else
                            while (!line.contains("</Code>")) {
                            code = code+ line.replaceAll("<Code>", "").replaceAll("</Code>", "")+"\n";
                            //System.out.println(code);
                            line=from.readLine();
                            }
                            code = code+ line.replaceAll("<Code>", "").replaceAll("</Code>", "")+"\n";

                        }
                        line=from.readLine();
                        if (line.contains("<Args>")) {
                            if (line.contains("</Args>"))
                                args = args+ line.replaceAll("<Args>", "").replaceAll("</Args>", "")+"\n";
                            else
                            while (!line.contains("</Args>")) {
                            args = args+ line.replaceAll("<Args>", "").replaceAll("</Args>", "")+"\n";
                            //System.out.println(args);
                            line=from.readLine();
                            }
                            args = args+ line.replaceAll("<Args>", "").replaceAll("</Args>", "")+"\n";

                        }
                        
                        //print(Basicgame,"{");
                         print(Basicgame,args);
                          print(Basicgame,code);
                       //  print(Basicgame,"}");
                        
                        line=from.readLine();//</Action>
                        // add the action
                        //Value v = (Value)eventList.events.lastElement();
                        //v.actions.addElement(new ActionValue(name,img,code,args ));
                    }
                    line=from.readLine();
                }
                print(Basicgame,"    }");
       if (name.equals("Draw Event"))
           print(Basicgame,"    }");
       if (name.contains("Alarm"))
             print(Basicgame,"    }");
            }
       
       }
         
    
    {
        
				print(Basicgame,"      " +  this.getName() + "(int X, int Y) {");
				print(Basicgame,"      super(\"" +  this.getName() + "\",\""+data.img.replaceAll(pro.getProjectDirectory().getPath(), "")+"\"," + solid + "," + visible
						+ ",0,0);");
				print(Basicgame,"      this.x = X;");
				print(Basicgame,"      this.y = Y;");
				print(Basicgame,"      this.xstart = X;");
				print(Basicgame,"      this.ystart = Y;");
				print(Basicgame,"      }");
                                
                                
                                
                                

                                //finish class
                                print(Basicgame,"}");
                                
        from.close();
        Basicgame.close();
        /*java.io.PrintStream printStream = new java.io.PrintStream(new java.io.File(pro.getProjectDirectory().getPath() +"/logs/"+this.getName()+".log"));
                            java.lang.System.setErr(printStream);
        com.sun.tools.javac.Javac j = new com.sun.tools.javac.Javac();
        j.javac(new java.lang.String[]{"-classpath",pro.getProjectDirectory().getPath(),pro.getProjectDirectory().getPath() + "/org/gjava/runner/"+this.getName()+".java"
                                    });
        printStream.close();*/
        
    }}
    
     public void print(BufferedWriter file,String printString) throws IOException {
            // printString.replaceAll("\n",""+(char)10);
            file.write(printString);
            file.newLine();
        }
    
    public void setModified(boolean arg0) {
        super.setModified(arg0);
        if (arg0 == true)
        {
//            Iterator opened = TopComponent.getRegistry().getOpened().iterator();
//        while (opened.hasNext())
//        {
//            Object tc = opened.next();
//            if (tc instanceof ActorEditorTopComponent)
//            {
//                ActorEditorTopComponent elc = (ActorEditorTopComponent)tc;
//                
//                if (this.getPrimaryFile().getPath().equals(elc.path))
//                {
//                    //elc.requestActive();
//                    elc.setHtmlDisplayName(elc.getHtmlDisplayName()+"*");
//                    
//                }
//            }
//        }
        }
        
        else if (arg0 == false)
        {
//            Iterator opened = TopComponent.getRegistry().getOpened().iterator();
//        while (opened.hasNext())
//        {
//            Object tc = opened.next();
//            if (tc instanceof ActorEditorTopComponent)
//            {
//                ActorEditorTopComponent elc = (ActorEditorTopComponent)tc;
//                
//                if (this.getPrimaryFile().getPath().equals(elc.path))
//                {
//                    //elc.requestActive();
//                    try {
//                    elc.setHtmlDisplayName(elc.oldDisplayName);
//                    } catch(Exception e) {}
//                    
//                }
//            }
//        }
        }
    }
    
    protected Node createNodeDelegate() {
        return new actorDataNode(this, data);
    }

    public Lookup getLookup() {
        return getCookieSet().getLookup();
    }
}
