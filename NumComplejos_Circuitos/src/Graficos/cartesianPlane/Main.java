package Graficos.cartesianPlane;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import constants.Constants;

public class Main {
    // Creación del Frame Principal
    public static void createFrame(int x, int y) {
        Menu frame = new Menu(x,y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Constants.WIDTH, Constants.HEIGHT);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String [] args, int xx, int yy) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createFrame(xx,yy);
            }
        });
    }
}
