import java.util.Scanner;

public class CuentaLetras {

    public static void main(String[] args) {

        int vocal = 0;
        int consonante = 0;
        String frase;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la frase");

        frase = entrada.nextLine().toLowerCase();

        for (int cont = 0; cont < frase.length(); cont++) {
            char caracter = frase.charAt(cont);

            if (Character.isLetter(caracter)) {
                if ("aeiou".indexOf(caracter) != -1) {
                    vocal++;
                } else {
                    consonante++;
                }
            }
        } // fin del for

        System.out.println("La frase tiene:");
        System.out.println(vocal + " vocales");
        System.out.println(consonante + " consonantes");

        entrada.close();
    }
}