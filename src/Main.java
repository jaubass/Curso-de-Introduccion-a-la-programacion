public class Main {
    public static void main(String[] args) {


        int a = 5;
        int b = 5;
        int c = 10;

        Coche miCoche = new Coche();
        miCoche.addPuerta();
        miCoche.addPuerta();



        System.out.println("El resultado de la suma es: " +sumar(a, b, c));
        System.out.println("El resultado de la resta es: " +restar(a, b, c));
        System.out.println("El numero de puertas del coche es: " +miCoche.puertas);


    }

    public static int sumar (int a, int b, int c) {
        return a + b + c;
    }

    public static int restar (int a, int b, int c) {
        return c - b - a;
    }


}