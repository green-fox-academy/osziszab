import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int startEnd = 64;
        int endStart = 20;

        {
            for (int i = 0; i < 14; i++) {
                DrawLines1(startEnd, endStart, graphics);
                startEnd += 20;
                endStart += 20;

            }

            for (int i = 0; i < 14; i++) {
                DrawLines2(startEnd, endStart, graphics);
                startEnd -= 20;
                endStart -= 20;

            }


        }


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

    public static void DrawLines1(int x, int y, Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.drawLine(x, 5, 315, y);


    }

    public static void DrawLines2(int x, int y, Graphics graphics) {
        graphics.setColor(Color.green);
        graphics.drawLine(5,x,y,315);


    }
}
