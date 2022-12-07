package Complejos;
import java.lang.Math;

/**
 *
 * @author kevin
 */
public class Complejo {
    private double a;
    private double b;
    
    public Complejo(){
        this.a = 0;
        this.b = 1;
    }
    public Complejo(double A, double B){
        this.a = A;
        this.b = B;
    }
    public Complejo(double B){
        this.a = 0;
        this.b = B;
    }
    
    //Sumas
    public static Complejo Suma(Complejo X, double a){
        return new Complejo(X.getA()+a,X.getB()); 
    }
    public static Complejo Suma(Complejo X, Complejo Y){
        return new Complejo(X.getA()+Y.getA(),X.getB()+Y.getB());
    }
    public static Complejo Suma(double a, Complejo X){
        return new Complejo (X.getA()+a,X.getB());
    }
    public static Complejo SumaPolar(Complejo X, Complejo Y){
        Complejo XBinome = Complejo.convertToBinomio(X);
        Complejo YBinome = Complejo.convertToBinomio(Y);
        Complejo sumado = Complejo.Suma(XBinome, YBinome);
        return Complejo.convertToPolar(sumado);
    }
    
    //Restas
    public static Complejo Resta(Complejo X, double a){
        return new Complejo(X.getA()-a,X.getB()); 
    }
    public static Complejo Resta(Complejo X, Complejo Y){
        return new Complejo(X.getA()-Y.getA(),X.getB()-Y.getB());
    }
    public static Complejo Resta(double a, Complejo X){
        return new Complejo (X.getA()-a,X.getB());
    }
    public static Complejo RestaPolar(Complejo X, Complejo Y){
        Complejo XBinome = Complejo.convertToBinomio(X);
        Complejo YBinome = Complejo.convertToBinomio(Y);
        Complejo restado = Complejo.Resta(XBinome, YBinome);
        return Complejo.convertToPolar(restado);
    }
    //Multiplicacion
    public static Complejo Multiplicacion(Complejo X, Complejo Y){
        double newA = (X.getA()*Y.getA())-(X.getB()*Y.getB());
        double newB = (X.getA()*Y.getB())+(X.getB()*Y.getA());
        return new Complejo(newA, newB);
    }
    public static Complejo MultPolar(Complejo X, Complejo Y){
        return new Complejo((X.getA()*Y.getA()),(X.getB()+Y.getB()));
    }
    
    //Division
    public static Complejo Division(Complejo X, Complejo Y){
        double denominador = Math.pow(Y.getA(), 2) + Math.pow(Y.getB(), 2);
        double numA = (X.getA()*Y.getA())+(X.getB()*Y.getB());
        double numB = (X.getB()*Y.getA())-(X.getA()*Y.getB());
        return new Complejo((numA/denominador),(numB/denominador));
    }
    public static Complejo DivisionPolar(Complejo X, Complejo Y){
        return new Complejo((X.getA()/Y.getA()),(X.getB()-Y.getB()));
    }
    
    //Print
    public void show(){
        System.out.printf("Z = ( %f )+( %f i )",this.getA(),this.getB());
    }
    public String showAsString(){
        if(this.getA()==0){
            return (String.format("%.3f", this.getB()) + "i");
        } else if (this.getB()==0){
            return String.format("%.3f", this.getA());
        } else {
            return (String.format("%.3f", this.getA()) + " + " + String.format("%.3f", this.getB()) + "i");
        }
    }
    public String showPolarAsString(){
        return (String.format("%.3f", this.getA()) + " * " + String.format("%.3f", this.getB()) + "º");
    }
    
    //Getters y Setters
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public void setA(double newA){
        this.a = newA;
    }
    public void setB(double newB){
        this.a = newB;
    }

    //Conversion
    public static Complejo convertToPolar(Complejo X){
        double modulo = Math.sqrt((Math.pow(X.getA(), 2))+(Math.pow(X.getB(), 2)));
        double angulo = 0;
        if(X.getA()==0){
            if(X.getB()>0){
                angulo = 90;
            } else if(X.getB()<0){
                angulo = -90;
            } else if(X.getB()==0){
                angulo = 0;
            }
        } else {
            angulo = Math.atan(X.getB()/X.getA());
            angulo = Math.toDegrees(angulo);
            if(X.getA()<0 && X.getB() >0){
                angulo += 180;
            } else if(X.getA()<0 && X.getB()<0){
                angulo -= 180;
            }
        }
        return new Complejo(modulo, angulo);
    }
    public static Complejo convertToBinomio(Complejo X){
        System.out.println(Math.cos(X.getB()));
        double angleRad = Math.toRadians(X.getB());
        return new Complejo(X.getA()*Math.cos(angleRad),X.getA()*Math.sin(angleRad));
    }
}
