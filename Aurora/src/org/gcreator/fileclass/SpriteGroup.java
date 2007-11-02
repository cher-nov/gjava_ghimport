/*
 * ActorGroup.java
 * 
 * Created on 5/Set/2007, 23:24:50
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

/**
 *
 * @author Luís
 */
public class SpriteGroup extends Group{
    public SpriteGroup(){
        super();
    }
    
    public SpriteGroup(Folder root, String name){
        super(root, name);
    }
    
     
    public boolean allowsFileType(String format){
        if(format.equals("sprite"))
            return true;
        return false;
    }
    
     
    public boolean allowsGroup(Group group){
        if(group instanceof SpriteGroup)
            return true;
        return false;
    }
    
     
    public Group newGroup(String name){
        Group group = new SpriteGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "SpriteGroup";
    }
}
