package elements;
import constants.Constants;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Color;

public class Coordinates extends JPanel {
    private static Graphics2D coordinates;
    private static Color color = Constants.xy_AxisColor;
    private static Color point = Constants.point;
    public void create(Graphics g, int width, int height,int gx, int gy){
        // Variables
        int limite = (width / (width/30) ), space = width/30, valueCoordinate = 0;
        String coordinateX = "", coordinateY = "";
        //
        coordinates = (Graphics2D) g;
        coordinates.setColor(color);
        // Central Coordinate
        coordinates.fillOval(( (width/2) - (Constants.POINTSIZE/2) ), ( (height/2) - (Constants.POINTSIZE/2) ), Constants.POINTSIZE,Constants.POINTSIZE);
        // Coordinates of Right Side
        for(int i = 0; i < limite; i++){
            // Ovals
            coordinates.fillOval((width/2) - (Constants.POINTSIZE/2) + space, (height/2) - (Constants.POINTSIZE/2), Constants.POINTSIZE, Constants.POINTSIZE);
            coordinates.fillOval((width/2) - (Constants.POINTSIZE/2),(height/2) - (Constants.POINTSIZE/2) + space, Constants.POINTSIZE, Constants.POINTSIZE );
            coordinateX = coordinateY = String.valueOf(valueCoordinate+1);
            // Letters
            coordinates.drawString(coordinateX,(width/2) - (Constants.POINTSIZE/2) + space, (height/2) + (Constants.POINTSIZE*4));
            coordinates.drawString("-"+coordinateY,(width/2) - (Constants.POINTSIZE*4), (height/2) + (Constants.POINTSIZE+ space));
            // Increment Variables
            valueCoordinate++;
            space += width/30;
        }
        // Coordinates of Left Side
        space = width/30;
        valueCoordinate = 0;
        for(int i = limite; i > 0; i--) {
            // Ovals
            coordinates.fillOval((width/2) - (Constants.POINTSIZE/2) - space, (height/2) - (Constants.POINTSIZE/2), Constants.POINTSIZE, Constants.POINTSIZE);
            coordinates.fillOval((width/2) - (Constants.POINTSIZE/2),(height/2) - (Constants.POINTSIZE/2) - space, Constants.POINTSIZE, Constants.POINTSIZE );
            coordinateX = coordinateY = String.valueOf(valueCoordinate+1);
            // Letters
            if(i != limite)
                coordinates.drawString("-"+coordinateX,(width/2) - (Constants.POINTSIZE/2) - space, (height/2) + (Constants.POINTSIZE*4));
            coordinates.drawString(coordinateY,(width/2) - (Constants.POINTSIZE*4), (height/2) + (Constants.POINTSIZE - space));
            // Increment Variables
            valueCoordinate++;
            space += width/30;
        }
        coordinates.setColor(point);
        //X,Y                                                       X                                                       y
        coordinates.fillOval((width/2) - (Constants.POINTSIZE/2) + (gx*(width/30)), (height/2) - (Constants.POINTSIZE/2) - (gy*(width/30)), Constants.POINTSIZE, Constants.POINTSIZE);
        coordinates.drawString("Real",(width/2) + 150, (height/2) + 50);
        coordinates.drawString("Imaginario",(width/2) - 100, (height/2) - 150);
    }
}
