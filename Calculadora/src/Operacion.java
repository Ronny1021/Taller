import javax.swing.*;

public class Operacion {
    
    private double numero1;
    private double numero2;
    private double suma;
    private double resta;
    private double multiplicacion;
    private double division;
  
    public Operacion(){
        
        numero1 = 0.0;
        numero2 = 0.0;
        suma = 0.0;
        resta = 0.0;
        multiplicacion = 0.0;
        division = 0.0;
        
    }
    
public void pedirDatos (){
    numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el numero 1"));
    numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el numero 2"));
} 

public void sumar(){
    suma = numero1 + numero2;
    
}

public void restar(){
    resta = numero1 - numero2;

}

public void multiplicar(){
    multiplicacion = numero1 * numero2;
    
}
public void dividir(){
    division = numero1 / numero2;
}

public void mostrarResultados(){
    JOptionPane.showMessageDialog(null, "El resultado de las operaciones es: " + 
            "\nSuma: " + suma + "\nResta: " + resta + "\nMultiplicacion: " + multiplicacion + "\nDivision: " + division);
}
}
