/*
15) Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package JavaIntro;

public class Ejercicio15 {

    public static void main(String[] args) {
        int vector[] = new int[100];
        int j = 0;

        for (int i = 0; i < vector.length; i++) {
            j += 1;
            vector[i] = j;
        }

        for (int i = 99; i >= 0; i--) {

            System.out.println("El Vector [" + i + "]: " + vector[i]);
        }

    }

}
