package Triangles;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {

    int firstSidex;
    int firstSidey;
    int secondSidex;
    int secondSizey;
    int ThirdSizex;
    int ThirdSizey;
    static int angles =3;

    public Triangle(){
    }

    public void drawBasicTriangle(Graphics graphics){
        int padding =5;
        int height = 520;
        graphics.drawPolygon(new int[] {padding, WIDTH-padding, WIDTH/2}, new int[] {padding, padding, height}, 3);
    }
    public void drawInnerTriangle(Graphics graphics){
        int padding =5;
        int height = 260;

        graphics.drawPolygon(new int[] {WIDTH/2, (WIDTH+padding)/4, (WIDTH-1)-(WIDTH/4)}, new int[] {padding,height, height},3); //middel big
        graphics.drawPolygon(new int[] {WIDTH/4, (WIDTH+padding+2)/8, (WIDTH/4)+(WIDTH/8+1)}, new int[] {padding,height/2, height/2},3); // left small
        graphics.drawPolygon(new int[] {3*(WIDTH/4),(WIDTH/2)+(WIDTH/8) ,(3*(WIDTH/4))+(WIDTH/8) }, new int[] {padding,height/2, height/2},3); // right small
        graphics.drawPolygon(new int[] {WIDTH/2,(WIDTH/4)+(WIDTH/8) ,(WIDTH/2)+(WIDTH/8) }, new int[] {height,(height/2)+height, (height/2)+height},3); // bottom small
    }

//--------------------------------------------------------------
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

        }
    }
}

