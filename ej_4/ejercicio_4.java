import java.util.Scanner;

/**
 * @Author Martín Martincorena
 */

/*
 *   4. Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio
 *      final con IVA. El IVA será una constante que será del 21%.
 */

public class ejercicio_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del articulo");
        Double precio = sc.nextDouble();
        double iva = 0.21;
        Double precioFinal = precio + ((precio * iva));

        System.out.println("El precio final del articulo: " + precioFinal);
    }

}
