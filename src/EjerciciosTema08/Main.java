package EjerciciosTema08;

/**
 * Para practicar la encapsulación:
 * Crear clase Persona.
 * Crear variables las privadas edad, nombre y telefono de la clase Persona.
 * Crear gets y sets de cada propiedad.
 * Crear un objeto persona en el main.
 * Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
 */

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setEdad(40);
        persona1.setNombre("Jau");
        persona1.setTelefono(675214);

        // Usando el toString mostramos los atributos de persona1
        System.out.println(persona1.toString());
        System.out.println("---------------------");

        // Usando los gets mostramos 1 a 1 los atributos
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getTelefono());
        System.out.println("---------------------");

        // Los podemos encadenar en un mismo SOUT
        System.out.println("NOMBRE:" + persona1.getNombre() + " - EDAD:" + persona1.getEdad() + " - TELEFONO:" + persona1.getTelefono());


    }
}
