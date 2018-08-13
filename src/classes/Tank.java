package classes;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

public class Tank extends Entities {
    private Image tankFacingUp;
    private Image tankFacingDown;
    private Image tankFacingLeft;
    private Image tankFacingRight;
    private int mx;
    private int my;
    public Tank() {
    }

    Tank(int hp, Boolean alive, Boolean movable, Image photo, int x, int y,int mx, int my) {
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
    void moveUp(int[][] mat){
        setPhoto(tankFacingUp);
        if ( y < 20 ){
           y = 0;
        }
        else{
           if ( canMoveTo(mat)){
               y-=my;
           }
        }
    }

    void moveDown(int[][] mat){
        setPhoto(tankFacingDown);
        if ( y >= 560 ){
            y = 560;
        }
        else{
            if ( canMoveTo(mat)){
                y+=my;
            }
        }
    }

    void moveLeft(int[][] mat){
        setPhoto(tankFacingLeft);
        if ( x < 20 ){
            x = 0;
        }
        else{
            if ( canMoveTo(mat)){
                x-=mx;
            }
        }
    }

    void moveRight(int[][] mat){
        setPhoto(tankFacingRight);
        if ( x >= 960 ){
            x = 960;
        }
        else{
            if ( canMoveTo(mat)){
                x+=mx;
            }
        }
    }


    //draw
    void drawTank(Graphics g){
        g.drawImage(this.getPhoto(),x,y,null);
    }

    private Boolean canMoveTo(int[][] mat){
        if ( x < 0 || x > 960 || y < 0 || y > 560 ){
            return false;
        }
        if ( mat[x/20][y/20] == 0 ){
            return true;
        }
        return false;
    }
}
//https://codereview.stackexchange.com/questions/102005/basic-game-with-moving-objects-in-swing