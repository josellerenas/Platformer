package main;

import javax.swing.*;

public class GameWindow {
    private JFrame jframe;

    public GameWindow(GamePanel gamePanel) {
        jframe = new JFrame();
        jframe.setSize(400,400);
        // Next line enables terminating the program when closing the window.
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        // Because reasons, the next line must be at the bottom of the method to avoid bugs.
        jframe.setVisible(true);
    }
}
