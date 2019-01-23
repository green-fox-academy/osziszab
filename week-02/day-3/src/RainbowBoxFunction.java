import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        for (int i=1; i<10; i++ ){
            square2(i*20, 25 * i, graphics);
        }

        for (int i = 1; i<10; i++){
            square1(i * 20, 25 * i, graphics);
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
    public static void square1(int size, int color1, Graphics graphics){
        int squaresize1 = 200 - size;
        graphics.setColor(new Color(0, 0, color1));
        graphics.fillRect((WIDTH / 2) - (squaresize1 / 2), (HEIGHT / 2) - (squaresize1 / 2), squaresize1, squaresize1);
    }
    public static void square2(int size2, int color2, Graphics graphics){
        int squareSize2 = 360 - size2;
        graphics.setColor(new Color(color2,0,0));
        graphics.fillRect((WIDTH/2)-(squareSize2/2),(HEIGHT/2)-(squareSize2/2),squareSize2,squareSize2);

    }
}
