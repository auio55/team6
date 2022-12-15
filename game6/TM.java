import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Taro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TM extends Actor
{
    final int speed_jump = 5;
    final int speed_gravity = 5;
    final int speed_lr = 5;
    final int height_jump = 150;
    final int offset_x = 20;
    final int offset_y = 10;
        
    int jumping = 0;
    boolean up_pressed = false;
    
    private boolean movingleft = true; // 画像が右向きの場合は false をセット
    
    public void act()
    {
        int x = getX();
        int y = getY();
        int w = getImage().getWidth();
        int h = getImage().getHeight();
        int dx = 0;
        int dy = 0;        
        boolean grounded = false;

        // 接地判定
        if( jumping == 0 ){
            Actor block = getOneObjectAtOffset(-offset_x,h/2,block.class);
            if( block == null ) block = getOneObjectAtOffset(offset_x,h/2,block.class);
            if( block != null ) grounded = true;
        }
        
        // キー入力
        if( Greenfoot.isKeyDown( "left" ) ){
            dx = -speed_lr;
            if( ! movingleft ){
                movingleft = true;
                getImage().mirrorHorizontally();
            }
            setLocation( x-1,y );
        }
        if( Greenfoot.isKeyDown( "right" ) ){
            if( movingleft ){
                movingleft = false;
                getImage().mirrorHorizontally();
            }
            setLocation( x+1,y );
            dx = speed_lr;
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            if( !up_pressed ){
                up_pressed = true;
                if( grounded ) jumping = height_jump/speed_jump;
            }
        }
        else up_pressed = false;            

        // 上下移動
        if( jumping > 0 ){
            dy = -speed_jump;
            --jumping;
        }
        else if( !grounded ){
            dy = speed_gravity;
        }

        // ブロックとの衝突判定
        if( dy < 0 ){
            Actor block = getOneObjectAtOffset(-offset_x,-h/2+dy,block.class);
            if( block == null ) block = getOneObjectAtOffset(offset_x,-h/2+dy,block.class);
            if( block != null ){
                int by = block.getY();
                int bh = block.getImage().getHeight();
                dy = (by+bh/2)-(y-h/2);
                jumping = 0;
            }
        }
        if( dy > 0 ){
            Actor block = getOneObjectAtOffset(-offset_x,h/2+dy,block.class);
            if( block == null ) block = getOneObjectAtOffset(offset_x,h/2+dy,block.class);
            if( block != null ){   
                int by = block.getY();
                int bh = block.getImage().getHeight();
                dy = (by-bh/2)-(y+h/2);
            } 
        } 
        if( dx < 0 ){
            Actor block = getOneObjectAtOffset(-w/2+dx,-offset_y+dy,block.class);
            if( block == null ) block = getOneObjectAtOffset(-w/2+dx,offset_y+dy,block.class);
            if( block != null ){
                int bx = block.getX();
                int bw = block.getImage().getWidth();
                dx = (bx+bw/2)-(x-w/2);
            }
        }
        if( dx > 0 ){
            Actor block = getOneObjectAtOffset(w/2+dx,-offset_y+dy,block.class);
            if( block == null ) block = getOneObjectAtOffset(w/2+dx,offset_y+dy,block.class);
            if( block != null ){
                int bx = block.getX();
                int bw = block.getImage().getWidth();
                dx = (bx-bw/2)-(x+w/2);
            }
        }
        
        setLocation( x+dx, y+dy );
    }  

}
