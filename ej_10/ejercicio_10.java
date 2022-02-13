
import java.util.Scanner;

/**
 * @Author Martín Martincorena
 */

/* 10. Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.*/

public class ejercicio_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = sc.nextLine();

        frase.trim();
        System.out.println("Frase sin espacios: " + frase.replace(" ", ""));
    }

}
