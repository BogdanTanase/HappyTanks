package classes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class Map extends JPanel implements KeyListener {
    private Image background;
    private Image defaultTank;
    private Timer timer;
    private Tank tank1 = new Tank(10,true,true,defaultTank,0,0,20,20);
    private final int DELAY = 10;
    private int[][] mat = new int[50][30];


    Map(){
        initBoard();
    }

    private void initBoard() {
        addKeyListener(this);
        loadBackground();
        setPreferredSize(new Dimension(100,600));
        setFocusable(true);

        try{
            defaultTank = ImageIO.read(new File("src/pictures/tankFacingLeft.png"));
        }
        catch(IOException ex){
            System.out.println("Default tank picture not found");
        }

        populate();
    }


    //background
    private void loadBackground() {
        try {
            background = ImageIO.read(new File("src/pictures/background.png"));
        }
        catch(IOException ex){
            System.out.println("Background could not be found.");
        }
    }

    private void drawBackground(Graphics g){
        g.drawImage(background,0,0,null);
        Toolkit.getDefaultToolkit().sync(); // for smooth animation on Linux
    }




    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        drawBackground(g);
        tank1.drawTank(g);
        repaint();
    }

    //MOVEMENT KEY
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e){
        Integer key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            tank1.moveLeft(mat);
        }

        if (key == KeyEvent.VK_RIGHT) {
            tank1.moveRight(mat);
        }

        if (key == KeyEvent.VK_UP) {
            tank1.moveUp(mat);
        }

        if (key == KeyEvent.VK_DOWN) {
            tank1.moveDown(mat);
        }
    }

    @Override
    public void keyReleased(KeyEvent e){

    }

    //Matrix of possible movement
    private void populate(){
        for ( int i = 10 ; i <= 20 ; i++){
            for ( int j = 0 ; j <= 10; j++ ){
                mat[i][j] = 1;
            }
        }
    }

}
