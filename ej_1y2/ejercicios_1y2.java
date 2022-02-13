
import java.util.Scanner;

/**
 * @Author Martín Martincorena
 */

/*
 *     1. Declara 2 variables numéricas(con el valor que desees),he indica cual es mayor de los dos.
 *        Si son iguales indicarlo también.Ve cambiando los valores para comprobar que funciona.
 *
 *     2. Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores,menores o iguales.
 */

public class ejercicios_1y2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num_1 = sc.nextInt();

        System.out.println("Ingrese el segundo número");
        int num_2 = sc.nextInt();

        if (num_1 == num_2) {
            System.out.println("Ambos números tienen el mismo valor");
        } else if (num_1 > num_2) {
            System.out.println("El valor del primer número (" + num_1 + ") es el mayor de los ingresados");
        } else {
            System.out.println("El valor del segundo número (" + num_2 + ") es el mayor de los ingresados");
        }
    }

}
