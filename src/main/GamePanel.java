package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public GamePanel() {

    }

    // This method must always be named like this.
    public void paintComponent(Graphics g) {
        // Next line calls the paintComponent method of the super class JPanel.
        // You must always call it, it's like cleaning the surface in order to paint.
        super.paintComponent(g);

        g.fillRect(100,100,200,50);
    }
}
