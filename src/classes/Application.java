package classes;

import javax.swing.*;
import java.awt.EventQueue;

public class Application extends JFrame {

    public Application(){
        initUI();
    }

    private void initUI(){
        add(new Map());
        setSize(1000, 600);
        setTitle("Happy Tanks");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

    }


    public static void main(String[] args) {

        EventQueue.invokeLater(()->{
           Application ap = new Application();
           ap.setVisible(true);
        });
    }
}
