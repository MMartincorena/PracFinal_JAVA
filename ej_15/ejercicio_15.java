
import java.util.Scanner;

/**
 * @Author Martín Martincorena
 */

/*
 * 15. Hacer un programa que muestre el siguiente menú de opciones
 ****** GESTION CINEMATOGRÁFICA ********
 * 1- NUEVO ACTOR
 * 2- BUSCAR ACTOR
 * 3- ELIMINAR ACTOR
 * 4- MODIFICAR ACTOR
 * 5- VER TODOS LOS ACTORES
 * 6- VER PELICULAS DE LOS ACTORES
 * 7- VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
 * 8- SALIR
 *  EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO
 *  EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR
 *  EL MENU NUEVAMENTE.
 */

public class ejercicio_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // menu();
        int opcion = 0;
        while (opcion != 8) {
            menu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Opcion 1: Nuevo actor");
                    break;
                case 2:
                    System.out.println("Opcion 2: Buscar actor");
                    break;
                case 3:
                    System.out.println("Opcion 3: Eliminar actor");
                    break;
                case 4:
                    System.out.println("Opcion 4: Modificar actor");
                    break;
                case 5:
                    System.out.println("Opcion 5: Ver todos los actores");
                    break;
                case 6:
                    System.out.println("Opcion 6: Ver pelicula de los actores");
                    break;
                case 7:
                    System.out.println("Opcion 7: Ver cateoria de las peliculas de los actores");
                    break;
                default:
                    System.out.println("Opción 8: Salir");
                    break;
            }
        }
        System.out.println("Cerrando el sistema");
        System.exit(0);

    }


    public static void menu() {
        System.out.println("" +
                "**** GESTION CINEMATOGRÁFICA ****\n" +
                "\n" +
                "1- NUEVO ACTOR\n" +
                "2- BUSCAR ACTOR\n" +
                "3- ELIMINAR ACTOR\n" +
                "4- MODIFICAR ACTOR\n" +
                "5- VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "7- VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8- SALIR");
    }
}