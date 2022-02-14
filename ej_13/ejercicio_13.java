import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/***
 * @Author Martín Martincorena
 */

// 13. Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)

public class ejercicio_13 {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY/MM/DD HH:MM:SS");

        System.out.println("Fecha y hora actual -> "+ dtf.format(LocalDateTime.now()));
    }
}