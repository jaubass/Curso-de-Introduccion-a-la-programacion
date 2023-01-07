package EjerciciosTema09;

public class Main {

    public static void main(String[] args) {

        Persona cliente = new Cliente(30, "Pepe", 12121212, 1000);
        Persona trabajador = new Trabajador(40, "Ana", 989898, 1400);

        System.out.println(cliente);
        System.out.println(trabajador);

    }
}
