import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int timecount = 1000;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        addObject( new NT(), 50, 350 );
        addObject( new TM(), 750, 350 );
        for(int i=0;i<=1000;i+=50){
            addObject( new block(), 0+i, 430 );            
        }
        for(int i=0;i<=600;i+=50){
            addObject( new block(), 100+i, 270 );            
        }
        for(int i=0;i<=250;i+=50){
            addObject( new block(), i, 110 );            
        }
        for(int i=0;i<=250;i+=50){
            addObject( new block(), 550+i, 110 );            
        }
    }
    public void act() {
    timecount--;
    showText( ""+timecount, 50, 430 );
      if( timecount==0){
        showText( "TIME OVER", 50, 430 );
        //Greenfoot.stop();
    }    
    }
}



