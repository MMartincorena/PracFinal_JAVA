
import java.util.Scanner;

/*
 * @Author Martín Martincorena
 */

/*
 *   11. Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
 *       indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
 */

public class ejercicio_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        int cantVocales = 0;
        char ch;
        for (int i = 0; i < frase.length(); i++) {
            ch = frase.charAt(i);

            if (String.valueOf(ch).equals("a") || String.valueOf(ch).equals("e")
                    || String.valueOf(ch).equals("i")
                    || String.valueOf(ch).equals("o")
                    || String.valueOf(ch).equals("u")) {
                cantVocales++;
            }
        }
        System.out.println("Longitud de la frase ingresada: " + frase.length() + "\n"
                + "Cantidad de vocales en la frase: " + cantVocales);


    }
}
