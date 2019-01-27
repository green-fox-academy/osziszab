import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        int triangleSize=15;
        int line =0;

            graphics.drawLine(0,HEIGHT-triangleSize,HEIGHT,HEIGHT-triangleSize);
            graphics.drawLine(0,HEIGHT-triangleSize, HEIGHT/2,5);
            graphics.drawLine(HEIGHT/2,5,HEIGHT,HEIGHT-triangleSize);

        for( int i = 0;i < 21; i++){
            line=i*triangleSize;
            graphics.drawLine(0+line,HEIGHT-triangleSize, HEIGHT/2+line,5+line);


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
}
