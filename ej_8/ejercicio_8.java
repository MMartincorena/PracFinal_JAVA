
import java.util.Scanner;

/**
 * @Author Martín Martincorena
 */

/*
 *    8. Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no.
 *       Usa un switch para ello.
 */

public class ejercicio_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar día de la semana: ");
        String dia = sc.next().toLowerCase();

        switch(dia){
            case "lunes":
                System.out.println("Día laboral.");
                break;
            case "martes":
                System.out.println("Día laboral.");
                break;
            case "miercoles":
                System.out.println("Día laboral.");
                break;
            case "jueves":
                System.out.println("Día laboral.");
                break;
            case "viernes":
                System.out.println("Día laboral.");
                break;
            case "sabado":
                System.out.println("Día no laboral.");
                break;
            case "domingo":
                System.out.println("Día no laboral.");
                break;
            default:
                System.out.println("Día incorrecto.");
        }

    }
}
