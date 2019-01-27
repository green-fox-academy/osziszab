import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    private static void mainDraw(Graphics graphics) {

        int addition = 10;
        int jump;

        for (int i = 0; i < 16; i++) {
            jump = i * addition;
            drawLine(WIDTH-jump, WIDTH, WIDTH, jump,graphics);
            drawLine(WIDTH+jump, WIDTH, WIDTH, jump,graphics);
            drawLine(WIDTH, 2*WIDTH-jump, WIDTH-jump, WIDTH,graphics);
            drawLine(WIDTH, 2*WIDTH-jump, jump+WIDTH, WIDTH,graphics);
        }

    }

    private   static void drawLine(int x1,int y1, int x2, int y2, Graphics graphics ){

        graphics.setColor(Color.green);
        graphics.drawLine(x1,y1,x2,y2);


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
