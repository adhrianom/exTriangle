

package main.principal;
import javax.swing.JOptionPane;
import entities.Triangle;
public class Principal {

    public static void main(String[] args) {
        Triangle triangulo = new Triangle();
        
        triangulo.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triangulo")));
        
        triangulo.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triangulo")));
        
        
        JOptionPane.showMessageDialog(null, "A area do triangulo é: " + triangulo.getArea());
    }
}
