package Triangles;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main{
    public static void mainDraw(Graphics graphics) {

        Triangle base = new Triangle();
        base.drawBasicTriangle(graphics);
        base.drawInnerTriangle(graphics);
    }

    // Don't touch the code below
    static int WIDTH = 610;
    static int HEIGHT = 610;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}