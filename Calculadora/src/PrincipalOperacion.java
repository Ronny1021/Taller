
import javax.swing.JOptionPane;


public class PrincipalOperacion {

    public static void main(String[] args) {
         
        Operacion calculo = new Operacion();
        
        calculo.pedirDatos();
        calculo.sumar();
        calculo.restar();
        calculo.multiplicar();
        calculo.dividir();
        calculo.mostrarResultados();
    }
    
}
