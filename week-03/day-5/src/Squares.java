import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
    public static void mainDraw(Graphics graphics) {

        plusSignRect(0,0, WIDTH, HEIGHT, graphics);
        plusSignRect(WIDTH/3, 0, WIDTH/3, HEIGHT/3, graphics);
        plusSignRect(0, HEIGHT/3, WIDTH/3, HEIGHT/3, graphics);
        plusSignRect(WIDTH - WIDTH/3, HEIGHT/3, WIDTH/3, HEIGHT/3, graphics);
        plusSignRect(WIDTH/3, HEIGHT - HEIGHT/3, WIDTH/3, HEIGHT/3, graphics);
    }
    public static void plusSignRect(int diffX, int diffY, int widthVar, int heightVar, Graphics graphics) {

        graphics.drawRect((widthVar / 3) + diffX,0 + diffY, widthVar / 3, heightVar / 3);
        graphics.drawRect(0 + diffX,(heightVar / 3) + diffY, (widthVar / 3), heightVar / 3);
        graphics.drawRect((widthVar - widthVar / 3) + diffX,(heightVar / 3) + diffY, widthVar / 3, heightVar/3);
        graphics.drawRect((widthVar / 3) + diffX,(heightVar - heightVar / 3) + diffY, widthVar / 3, heightVar/3);
    }

    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

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