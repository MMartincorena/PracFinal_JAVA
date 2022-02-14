import java.util.Scanner;

/**
 * @Author Martín Martincorena
 */

/*
 * 14. Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde el numero
 *     introducido hasta 1000 con saldos de 2 en 2.
 */

public class ejercicio_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int nro = sc.nextInt();
        int aux = nro;

        while (aux < 1000) {
            aux = aux + 2;
            System.out.println(aux);
        }

    }
}