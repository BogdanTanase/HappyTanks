package classes;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

public class Tank extends Entities {
     Image tankFacingUp;
     Image tankFacingDown;
     Image tankFacingLeft;
     Image tankFacingRight;
    int mx;
    int my;
    public Tank() {
    }

    public Tank(int hp, Boolean alive, Boolean movable, Image photo, int x, int y,int mx, int my) {
        super(hp, alive, movable, photo, x, y);
        this.mx = mx;
        this.my = my;
        try {
            tankFacingUp = ImageIO.read(new File("src/pictures/tankFacingUp.png"));
        }
        catch(IOException ex){
            System.out.println("tankFacingUp could not be found.");
        }
        try {
            tankFacingDown = ImageIO.read(new File("src/pictures/tankFacingDown.png"));
        }
        catch(IOException ex){
            System.out.println("tankFacingDown could not be found.");
        }
        try {
            tankFacingLeft = ImageIO.read(new File("src/pictures/tankFacingLeft.png"));
        }
        catch(IOException ex){
            System.out.println("tankFacingLeft could not be found.");
        }
        try {
            tankFacingRight = ImageIO.read(new File("src/pictures/tankFacingRight.png"));
        }
        catch(IOException ex){
            System.out.println("tankFacingRight could not be found.");
        }

    }

    //movement methods
    public void moveUp(){
        if ( y < 20 ){
            y = 0;
        }
        else{
            y-=my;
        }
        setPhoto(tankFacingUp);
    }

    public void moveDown(){
        if ( y < 550 ){
            y+=my;
        }
        setPhoto(tankFacingDown);
    }

    public void moveLeft(){
        if ( x < 20 ){
            x = 0;
        }
        else{
            x-=mx;
        }
        setPhoto(tankFacingLeft);
    }

    public void moveRight(){
        if ( x  < 960){
            x+=mx;
        }
        setPhoto(tankFacingRight);
    }


    //draw
    public void drawTank(Graphics g){
        g.drawImage(this.getPhoto(),x,y,null);
    }

}
//https://codereview.stackexchange.com/questions/102005/basic-game-with-moving-objects-in-swing