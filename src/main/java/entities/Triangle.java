
package entities;

public class Triangle {
    public double base;
    public double altura;
    
    public Triangle(){
        this(0,0);
            }
    
    public Triangle(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getArea() {
        return ((getBase() * getAltura())/2.0);
    }
    
}
