import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sensei here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sensei extends Actor
{
    static private int a=1;
    static private boolean edge=false;
    /**
     * Act - do whatever the sensei wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        int x = getX();
        int y = getY();
        setLocation( x+a,y );
        if( isAtEdge()&& !edge){
            getImage().mirrorHorizontally();
            a=-1*a;
            edge=true;
        }
        else if(getX()<400&&getX()>300)
        {
            edge=false;// Add your action code here.
        }
    }    
}
