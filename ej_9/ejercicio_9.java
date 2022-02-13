
import java.util.Scanner;

/**
 * @Author Martín Martincorena
 */

/*
 *   9. Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String anterior por una e,
 *      adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.
 */

public class ejercicio_9 {

    public static void main(String[] args) {
        String cadena = "La sonrisa sera la mejor arma contra la tristeza";

        System.out.println("Frace original: \n" + cadena);

        String cadenaModificada = cadena.replace("a", "e");
        System.out.println("Frace con la A reemplazado por E: \n" + "    " + cadenaModificada);

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frace: ");
        String miFrase = sc.nextLine();

        System.out.println("Frace ya concatenada: \n" + "    " + cadenaModificada + " " + miFrase);
    }

}
