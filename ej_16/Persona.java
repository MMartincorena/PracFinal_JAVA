
import javax.print.DocFlavor;

public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private String sexo;
    private double peso;
    private double altura;


    /**
     * CONSTRUCTORES
     */

    //Por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = "";
        this.peso = 0;
        this.altura = 0;
        this.DNI = this.generateDNI();
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = this.generateDNI();
    }

    //Constructor con todos los atríbutos recibidos por parámetro
    public Persona(String nombre, int edad, String DNI, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = this.generateDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Getters y Setters
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

/*  SETTER descartado
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }*/

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo.equals("Femenino")) {
            this.sexo = "F";
        } else {
            this.sexo = "H";
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String calcularIMC() {
        double imc = peso / (Math.pow(altura, 2));
        if (imc < 20) {
            return "Insuficiente";
        }
        if (imc >= 20 && imc <= 25) {
            return "Normal";
        }
        if (imc > 25) {
            return "Sobrepeso";
        }
        return null;
    }

    public boolean esMayorDeEdad(int edad) {

        if (edad > 18) {
            return true;
        } else {
            return false;
        }
    }

    public String generateDNI() {
        int nro = generateIDDNI();
        String serie = String.valueOf(generateLetra(nro));
        return serie + nro;

    }


    /**
     * Función que genera un número de 8 dígitos
     * @return dni (ENTERO)
     */
    public int generateIDDNI() {
        double dni = 10000000 + Math.random() * 90000000;
        return (int) dni;
    }

    /**
     * Función generaLetra
     * @param dni
     * @return char(letra generada, según fórmula)
     */

    public char generateLetra(int dni) {
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;
        return caracteres.charAt(resto);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
