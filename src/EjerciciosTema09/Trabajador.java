package EjerciciosTema09;

/**
 * Crea una clase Persona con las siguientes variables:
 * La edad
 * El nombre
 * El teléfono
 * Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
 * Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
 * Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
 */

public class Trabajador extends Persona {

    protected int salario;

    public Trabajador(int edad, String nombre, int telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "salario=" + salario +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
