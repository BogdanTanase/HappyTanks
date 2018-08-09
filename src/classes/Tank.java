package classes;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Tank extends Entities{
    private Image tankFacingUp;
    private Image tankFacingDown;
    private Image tankFacingLeft;
    private Image tankFacingRight;
    public Tank() {
    }

    public Tank(int hp, Boolean alive, Boolean movable, Image photo, int x, int y, int mx, int my) {
        super(hp, alive, movable, photo, x, y, mx, my);
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


    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            moveLeft();
            setPhoto(tankFacingLeft);
        }

        if (key == KeyEvent.VK_RIGHT) {
            moveRight();
            setPhoto(tankFacingRight);
        }

        if (key == KeyEvent.VK_UP) {
            moveUp();
            setPhoto(tankFacingUp);
        }

        if (key == KeyEvent.VK_DOWN) {
            moveDown();
            setPhoto(tankFacingDown);
        }
    }

    public void keyReleased(KeyEvent e){

    }

}
