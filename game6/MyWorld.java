import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    static public int mob=0;
    static public int point=0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        addObject( new NT(), 50, 350 );
        addObject( new TM(), 750, 350 );
        addObject( new sensei(), 400, 350 );
        //addObject( new sensei2(), 300, 350 );
        
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
    public void act()
    {   showText( ""+point, 100, 50 );
        if(mob<1)
        {
            switch((int)(Math.random()*((2)+1)))
            {
                case 0:
                    addObject( new senpai(), 200, 300 );
                    break;
                case 1:
                   addObject( new senpai(), 300, 200 );
                   break;
                default:
                    addObject( new senpai(), 400, 100 );
            }
            mob++;
        }
    }
}
