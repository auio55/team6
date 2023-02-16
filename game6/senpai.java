import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class senpai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class senpai extends Actor
{
    /**
     * Act - do whatever the senpai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor actor1=getOneIntersectingObject( NT.class);
        Actor actor2=getOneIntersectingObject( TM.class);
        if(actor1!=null||actor2!=null||isAtEdge()){
            getWorld().removeObject( this );
            MyWorld.mob--;
            
            MyWorld.point++;
        }// Add your action code here.
        
    }    
}
