package classes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Map extends JPanel {
    private Image background;
    private Timer timer;
    private Tank tank1;
    private final int DELAY = 10;

    public Map(){
        initBoard();
    }

    private void initBoard() {
        addKeyListener(new keyBinding());
        loadBackground();
        setPreferredSize(new Dimension(100,600));
        setFocusable(true);
        setDoubleBuffered(true);

        tank1= new Tank();


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

    //tank
    private void drawTank(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(tank1.getPhoto(),tank1.getX(),tank1.getY(), this);
    }




    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        drawBackground(g);
        drawTank(g);
        repaint();
        Toolkit.getDefaultToolkit().sync();
    }


    private class keyBinding extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            tank1.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            tank1.keyPressed(e);
        }
    }
}
