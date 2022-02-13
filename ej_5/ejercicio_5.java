import java.util.ArrayList;

/**
 * @Author Martín Martincorena
 */

/*
 * 5. Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
 */

public class ejercicio_5 {

    public static void main(String[] args) {

        ArrayList listaPares = new ArrayList();
        ArrayList listaImpares = new ArrayList();

        int numero = 0;

        while (numero <= 100) {
            if (numero % 2 == 0) {
                listaPares.add(numero);
            } else {
                listaImpares.add(numero);
            }
            numero++;
        }

        System.out.println("Lista de números pares: " + listaPares);
        System.out.println("Lista de números impares: " + listaImpares);

    }

}
