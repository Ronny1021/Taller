package cadenainvertida;

import java.util.*;

public class Cadenalnvertida {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String Cadena = "";
        String Cadena_Invertida = "";

        System.out.println("Escribe una cadena: ");

        Cadena = lector.nextLine();

        for (int i = Cadena.length() - 1; i >= 0; i--) {
            Cadena_Invertida += Cadena.charAt(i);
        }

        System.out.println("La cadena invertida es: " + Cadena_Invertida);

    }
}