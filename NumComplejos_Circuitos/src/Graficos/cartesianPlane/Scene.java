package Graficos.cartesianPlane;
import elements.Background;
import elements.CartesianPlane;
import elements.Coordinates;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Scene extends JPanel {
    public int x, y;
    public Scene(int gx, int gy){
        this.x = gx;
        this.y = gy;
        
    }
    @Override
    public void paintComponent(Graphics g) {
        Background bg = new Background();
        CartesianPlane cartesianPlane = new CartesianPlane();
        Coordinates coordinates = new Coordinates();

        bg.create(g,this.getWidth(),this.getHeight());
        cartesianPlane.create(g, this.getWidth(), this.getHeight());
        coordinates.create(g, this.getWidth(), this.getHeight(), x, y);
        repaint();
    }
}
