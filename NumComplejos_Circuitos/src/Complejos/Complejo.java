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
    
    //Multiplicacion
    public static Complejo Multiplicacion(Complejo X, Complejo Y){
        double newA = (X.getA()*Y.getA())-(X.getB()*Y.getB());
        double newB = (X.getA()*Y.getB())+(X.getB()*Y.getA());
        return new Complejo(newA, newB);
    }
    
    //Division
    public static Complejo Division(Complejo X, Complejo Y){
        double denominador = Math.pow(Y.getA(), 2) + Math.pow(Y.getB(), 2);
        double numA = (X.getA()*Y.getA())+(X.getB()*Y.getB());
        double numB = (X.getB()*Y.getA())-(X.getA()*Y.getB());
        return new Complejo((numA/denominador),(numB/denominador));
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
}
