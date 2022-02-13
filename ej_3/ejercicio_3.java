import java.util.Scanner;

/**
 * @Author Martín Martincorena
 */

/*
 *   3. Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
 *      (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
 */

public class ejercicio_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo:");
        Double radio = sc.nextDouble();

        //Math.por (radio, exponente 2) - Math.PI es el valor del número PI
        Double area = Math.pow(radio, 2) * Math.PI;

        System.out.println("El área del circulo es: " + area);

    }

}