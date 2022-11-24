import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class techi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class techi extends Actor
{
    /**
     * Act - do whatever the techi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
    }// Add your action code here.

        // Add your action code here.
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(-90);
        move(1);
        }   

    }
}
