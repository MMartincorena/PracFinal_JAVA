
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        try {


            Scanner sc = new Scanner(System.in);

            //INGRESO PERSONA 1
            Persona p1 = new Persona();
            System.out.println("Persona 1-----------------");
            System.out.println("Ingrese nombre: ");
            p1.setNombre(sc.next());
            System.out.println("Ingrese Edad: ");
            p1.setEdad(sc.nextInt());
            System.out.println("Ingrese Sexo: ");
            p1.setSexo(sc.next());

            System.out.println("Ingrese Peso: ");
            p1.setPeso(sc.nextDouble());
            System.out.println("Ingrese Altura: ");
            p1.setAltura(sc.nextDouble());


            //INGRESO PERSONA 2
            Persona p2 = new Persona();
            System.out.println("Persona 2-----------------");
            System.out.println("Ingrese nombre: ");
            p2.setNombre(sc.next());
            System.out.println("Ingrese Edad: ");
            p2.setEdad(sc.nextInt());
            System.out.println("Ingrese Sexo: ");
            p2.setSexo(sc.next());

            //INGRESO PERSONA 3
            Persona p3 = new Persona();
            System.out.println("Persona 3-----------------");
            System.out.println("Ingrese nombre: ");
            p3.setNombre(sc.next());
            System.out.println("Ingrese Edad: ");
            p3.setEdad(sc.nextInt());
            System.out.println("Ingrese Sexo: ");
            p3.setSexo(sc.next());
            System.out.println("Ingrese Peso: ");
            p3.setPeso(sc.nextDouble());
            System.out.println("Ingrese Altura: ");
            p3.setAltura(sc.nextDouble());

            //VERIFICO ESTADO FISICO
            System.out.println("Estado físico de P1: " + p1.getNombre() + "Resultados de IMC: " + p1.calcularIMC());
            System.out.println("Estado físico de P2: " + p1.getNombre() + "Resultados de IMC: " + p2.calcularIMC());
            System.out.println("Estado físico de P3: " + p1.getNombre() + "Resultados de IMC: " + p3.calcularIMC());

            //VERIFICO SI ES MAYOR
            if (p1.esMayorDeEdad(p1.getEdad())) {
                System.out.println(p1.getNombre() + " es mayor");
            } else {
                System.out.println(p1.getNombre() + " es menor");
            }

            if (p2.esMayorDeEdad(p2.getEdad())) {
                System.out.println(p2.getNombre() + " es mayor");
            } else {
                System.out.println(p2.getNombre() + " es menor");
            }

            if (p1.esMayorDeEdad(p3.getEdad())) {
                System.out.println(p3.getNombre() + " es mayor");
            } else {
                System.out.println(p3.getNombre() + " es menor");
            }


            System.out.println("INFORMACIÓN DE LAS PERSONAS");
            System.out.println(p1.toString());
            System.out.println(p2.toString());
            System.out.println(p3.toString());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
