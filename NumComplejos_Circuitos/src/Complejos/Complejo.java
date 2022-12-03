package Complejos;

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
    public static Complejo Suma(){
        return new Complejo(); 
    }
    public static Complejo Suma(Complejo X, Complejo Y){
        return new Complejo(X.getA()+Y.getA(),X.getB()+Y.getB());
    }
    public static Complejo Suma(double a, Complejo X){
        return new Complejo ();
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
