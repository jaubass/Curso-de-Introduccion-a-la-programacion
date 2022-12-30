package EjerciciosTema04;

import com.sun.source.tree.SwitchTree;

public class EstructurasDeControl {

    public static void main(String[] args) {

        System.out.println("---------------");
/** IF
 * Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
 * Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
 */
        int numeroIf = -2;

        if (numeroIf < 0){
            System.out.println("El numero es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es 0");
        }
        System.out.println("---------------");

/** WHILE Y DO WHILE
 * Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
 * Incrementar el valor de la variable en uno cada vez que se ejecute.
 * Mostrarlo por pantalla cada vez que se ejecute.
 * Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
 */

    int numeroWhile = 0;

    while (numeroWhile < 3) {
        System.out.println("La variable es: " +numeroWhile);
        numeroWhile = numeroWhile + 1;
    }

        System.out.println("---------------");

    do {
        System.out.println(numeroWhile);
    } while (numeroWhile < 3);

        System.out.println("---------------");
/** FOR
 * Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3,
 * se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
 */

    int numeroFor = 0;

    for (numeroFor = 0; numeroFor < 4; numeroFor++) {
        System.out.println("El valor numerico es: " +numeroFor);
    }

        System.out.println("---------------");

/** SWITCH
* Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
* Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
* También habrá que poner un default para cuando el valor de la variable no sea una estación.
*/

        String estacion = "INVIERNO";

        switch (estacion) {

            case "VERANO":
                System.out.println("Es verano");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
        }
    }
}

