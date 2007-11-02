/*
 * Actor.java
 * 
 * Created on 09-Sep-2007, 16:42:21
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.fileclass.res;

import java.util.Enumeration;
import java.util.Vector;
import org.gcreator.events.Event;

/**
 *
 * @author Ali1
 */
public class Actor extends Resource {

    public boolean visible,  solid,  persistant;
    public org.gcreator.fileclass.File sprite = null;
    public String extend,  mask;
    public int index,  depth;
    public Vector events; //<Event>

    public Actor(String name) {
        this.name = name;
        events = new Vector(); //<Event>
    }

    public String writeXml() {
        String xml = "";
        xml += "<?xml version=\"1.0\"?>\n"; //changes for new version of actor
        xml += "<actoreditor version=\"1.0\"/>\n";
        xml += "<Solid>" + solid + "</Solid>\n";
        xml += "<Visible>" + visible + "</Visible>\n";
        xml += "<Persistant>" + persistant + "</Persistant>\n";
        if (sprite == null) {
            xml += "<Sprite>//!NULLSPRITE</Sprite>";
        } else {
            xml += "<Sprite>" + sprite.getPath() + "</Sprite>";
        }
                for (Enumeration e = events.elements() ; e.hasMoreElements() ;) {
            xml += ((Event)e.nextElement()).writeXml();
        }
        return xml;
    }

     
    public void readXml(String xml) {
        //TODO read the XML
        String[] data = xml.split("\n");
        String version = "1.0"; //guess
        for (int i = 0; i < data.length; i++) {
            if (data[i].contains("<actoreditor")) {
                version = data[i].replaceAll("<actoreditor version=\\\"", "").replaceAll("\\\"/>", "");
                if (!version.equals("1.0")) {
                    System.out.println("Warning! Version is" + version);
                }
            } else if (data[i].contains("<Solid>")) {
                solid = Boolean.parseBoolean(data[i].replaceAll("<Solid>", "").replaceAll("</Solid>", ""));
            } else if (data[i].contains("<Visible>")) {
                visible = Boolean.parseBoolean(data[i].replaceAll("<Visible>", "").replaceAll("</Visible>", ""));
            } else if (data[i].contains("<Persistant>")) {
                persistant = Boolean.parseBoolean(data[i].replaceAll("<Persistant>", "").replaceAll("</Persistant>", ""));
            } else if (data[i].contains("<event")) {
                String n = data[i].replaceAll("<event type=\"(.*?)\">", "$1");
                System.out.println("Event " + n);
                try {
                    Event evt;
                    events.add(evt = Event.getNewEventFromName(n));
                    i = evt.readXml(data, i);
                } catch (Exception e) {
                }
            }
        }
    }

     
    public String exportToHtml(boolean xhtml) {
        String html = "";
        if (xhtml) {
            html += "<!DOCTYPE html\nPUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\n\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">";
        } else {
            html += "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">";
        }
        html += "\n";
        html += "<html>\n";
        html += "<head>\n";
        html += "\t<title>" + name + "</title>\n";
        html += "</head>\n";
        html += "<body>\n";

        html += "<table border=";
        if (xhtml) {
            html += "\"";
        }
        html += "1";
        if (xhtml) {
            html += "\"";
        }
        html += " width=";
        if (xhtml) {
            html += "\"";
        }
        html += "100%";
        if (xhtml) {
            html += "\"";
        }
        html += ">\n";
        html += "<tr>\n";
        html += "<td>\n";

        html += "Name: " + name + "<br";
        if (xhtml) {
            html += "/";
        }
        html += ">\n";

        html += "<fieldset>\n<legend>Sprite</legend>\n</fieldset>\n";

        html += "<input type=\"checkbox\"";
        if (visible) {
            html += " checked";
            if (xhtml) {
                html += "=\"checked\"";
            }
        }
        html += " disabled";
        if (xhtml) {
            html += "=\"disabled\" /";
        }
        html += ">Visible<br";
        if (xhtml) {
            html += "/";
        }
        html += ">\n";

        html += "<input type=\"checkbox\"";
        if (solid) {
            html += " checked";
            if (xhtml) {
                html += "=\"checked\"";
            }
        }
        html += " disabled";
        if (xhtml) {
            html += "=\"disabled\" /";
        }
        html += ">Solid<br";
        if (xhtml) {
            html += "/";
        }
        html += ">\n";

        html += "<input type=\"checkbox\"";
        if (persistant) {
            html += " checked";
            if (xhtml) {
                html += "=\"checked\"";
            }
        }
        html += " disabled";
        if (xhtml) {
            html += "=\"disabled\" /";
        }
        html += ">Persistant<br";
        if (xhtml) {
            html += "/";
        }
        html += ">\n";

        if (xhtml) {
            html += "</td>\n";
        }
        if (xhtml) {
            html += "</tr>\n";
        }
        html += "</table>\n";

        html += "</body>\n";
        html += "</html>";

        return html;
    }

    //SuppressWarnings("unchecked")
    public Resource clone() {
        Actor a = new Actor(name);
        a.depth = depth;
        Object o = events.clone();
        if (o != null && o instanceof Vector) { //<?>
            a.events = (Vector) o; //<Event>
        } else {
            a = null;
        }
        a.extend = extend;
        a.index = index;
        a.mask = mask;
        a.persistant = persistant;
        a.solid = solid;
        a.visible = visible;
        a.sprite = sprite;
        return a;
    }
}
