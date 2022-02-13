import java.util.Scanner;

/**
 * @Author Martín Martincorena
 */

// Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.

public class ejercicio_12 {
    public static void main(String[] args) {
        Scanner keyScanner = new Scanner(System.in);
        String texto_1, texto_2;
        try {
            System.out.print("Ingresa una palabra: ");
            texto_1 = keyScanner.nextLine();

            System.out.print("Ingresa otra palabra: ");
            texto_2 = keyScanner.nextLine();

            if (texto_1.equalsIgnoreCase(texto_2)) {
                System.out.println("Son iguales");
            } else {
                System.out.println("No son iguales, las diferencias son: " + obtenerDiferencias(texto_1, texto_2));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static String obtenerDiferencias(String texto_1, String texto_2) {
        if (texto_1 == null) {
            return texto_2;
        }
        if (texto_2 == null) {
            return texto_1;
        }
        int at = indiceDeLaDiferencia(texto_1, texto_2);
        if (at == -1) {
            return "";
        }
        return texto_2.substring(at);
    }

    public static int indiceDeLaDiferencia(String texto_1, String texto_2) {
        if (texto_1 == texto_2) {
            return -1;
        }
        if (texto_1 == null || texto_2 == null) {
            return 0;
        }
        int i;
        for (i = 0; i < texto_1.length() && i < texto_2.length(); ++i) {
            if (texto_1.charAt(i) != texto_2.charAt(i)) {
                break;
            }
        }
        if (i < texto_2.length() || i < texto_1.length()) {
            return i;
        }
        return -1;
    }
}