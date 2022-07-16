/*
4) Dada una cantidad de grados centígrados se debe mostrar su equivalente 
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los grados centigrados a comparar");
        double centig = leer.nextDouble();

        double fahren = 32 + (9 * centig / 5);

        System.out.println("Los " + centig + "° centigrados equivalen "
                + "a " + fahren + "° fahrenheit");

    }

}
