// basicgame.java
// by TGMG

// import the required classes
package org.gcreator.compilers.gjava.core;
import java.awt.*;
import javax.swing.*;
import java.

// the main class
net.*;


// the main class
import org.gcreator.compilers.gjava.components.Actor;
import org.gcreator.compilers.gjava.components.Scene;


// the main class
import org.gcreator.compilers.gjava.components.font;
import org.gcreator.compilers.gjava.components.sprite;
/**
 * The basics for a game, rewritten in G-Java for your game.
 * @author G-java
 */
public class basicgame {

//The Game Settings
GameSettings gs = new GameSettings();

public static JFrame f;
public static URL u;
public static String Runningas;
public static Scene Current_room;
public static JApplet Eapplet;

// Declare the reasources
public static sprite[] sprite = new sprite[5];
public static font[] font = new font[2];
public static Actor[] obj = new Actor[7];
public basicgame(URL u) {

 }

public basicgame(URL u, JApplet embed) {}

public basicgame() {}

public static void load_Sprites() {}
public static void load_Sounds() {}
public static void load_Backgrounds() {}
public static void load_Fonts() {}
public static Actor load_Objects(int objectid, int X, int Y, double id) {return null;}

public static void load_Timelines()
	{
	// TODO Auto-generated method stub
	
	}

public static void load_Paths()
	{
	// TODO Auto-generated method stub
	
	}
}

class load_Rooms {

public static JFrame Room;
public static int firstroom = 1; 
public static int lastroom = 5; 
public static JApplet maingamep;
public static Scene[] rooms = new Scene[5];
public static int roomid;
public static Image GIcon;
public static int getroom[]= {1,0,3,4,5};

load_Rooms(int roomid) {}

load_Rooms(int roomid,JApplet maingamep) {}

public static boolean if_prev_room(int roomid) {return false;}

public static boolean if_next_room(int roomid) {return false;}

public static void prev_room(int roomid,JApplet maingamep) {}

public static void prev_room(int roomid) {}

public static void next_room(int roomid,JApplet maingamep) {}

public static void next_room(int roomid) {}

public static void change_room(int roomid){}

public static void change_room(int roomid,JApplet maingamep) {}

public static void restart_room(int roomid,JApplet maingamep) {}

public static void restart_room(int roomid) {}

public static void remove_room(int roomid) {}
}
