package Graficos.cartesianPlane;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Menu extends JFrame {
    public int x, y;

    public Menu(int gx, int gy){
        super("Cartesian Plane - Created by David Guevara");
        this.x = gx;
        this.y = gy;
        Scene scene = new Scene(x,y);
        add(scene,BorderLayout.CENTER);
    }
}
