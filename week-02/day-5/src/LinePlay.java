import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    private static void mainDraw(Graphics graphics) {
        int x1=0;
        int x2;
        int y2=0;

        int addition = 20;

        for (int i = 0; i < WIDTH/addition; i++) {
            x1 +=addition;
            x2 = WIDTH-5;

            y2 += addition;

            drawLine(x1, 5, x2, y2, Color.blue, graphics);
            drawLine(5, x1, y2, x2, Color.green, graphics);
        }
    }
    private  static void drawLine (int startx, int starty, int endx, int endy, Color color, Graphics graphics) {
        graphics.setColor(color);
        graphics.drawLine(startx, starty, endx, endy);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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