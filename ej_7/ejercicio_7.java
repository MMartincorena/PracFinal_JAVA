import java.util.Scanner;

/**
 * @Author Martín Martincorena
 */

/*
 *   7. Lee un número por teclado y comprueba que este número es mayor o igual que cero,
 *      si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
 */

public class ejercicio_7 {

    public static void main(String[] args) {

        Scanner keyScanner = new Scanner(System.in);

        int i = 0;

        do {
            try {
                System.out.print("Ingresa un número: ");
                i = keyScanner.nextInt();
                System.out.print("Número ingresado: " + i);
            } catch (Exception e) {
                System.out.println("Ingrese un valor numérico.");
            }
        } while (i < 0);
    }
}

