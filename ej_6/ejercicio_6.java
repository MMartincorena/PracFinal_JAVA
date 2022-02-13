import java.util.ArrayList;

/**
 * @Author Martín Martincorena
 */

/* 6. Realiza el ejercicio anterior usando un ciclo for. */

public class ejercicio_6 {

    public static void main(String[] args) {

        ArrayList listaPares = new ArrayList();
        ArrayList listaImpares = new ArrayList();

        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                listaPares.add(i);
            } else {
                listaImpares.add(i);
            }
        }

        System.out.println("Lista de números pares: " + listaPares);
        System.out.println("Lista de números impares: " + listaImpares);
    }
}
