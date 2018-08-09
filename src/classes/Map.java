package classes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Map extends JPanel{
    private Image background;



    public Map(){
        initBoard();
    }

    private void initBoard() {
        loadBackground();
        setPreferredSize(new Dimension(100,600));
    }

    private void loadBackground() {
        try {
            background = ImageIO.read(new File("src/pictures/background.png"));
        }
        catch(IOException ex){
            System.out.println("Background could not be found.");
        }
    }

    @Override
    public void paintComponent(Graphics g){
        g.drawImage(background,0,0,null);
    }

}
