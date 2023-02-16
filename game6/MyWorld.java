import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int timecount = 3000;
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
        mob=0;
        point=0;
        addObject( new NT(), 50, 350 );
        addObject( new TM(), 750, 350 );
        addObject( new sensei(), 400, 380 );
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
        timecount--;
        showText( ""+timecount, 50, 430 );
        if( timecount<=0){
            if(point<60)
            {
                showText( "留年", 50, 430 );
            }
            else
            {
                showText( "進級", 50, 430 );
            }
            
            Greenfoot.stop();
        } 
        if(mob<2)
        {
            switch((int)(Math.random()*((5)+1)))
            {
                case 0:
                    addObject( new senpai(), 200, 380 );
                    break;
                case 1:
                   addObject( new senpai(), 400, 220 );
                   break;
                case 2:
                   addObject( new senpai(), 200, 220 );
                   break;
                case 3:
                   addObject( new senpai(), 600, 380 );
                   break;
                case 4:
                   addObject( new senpai(), 200, 60 );
                   break;
                default:
                    addObject( new senpai(), 600, 60 );
            }
            mob++;
        }
    }
}



