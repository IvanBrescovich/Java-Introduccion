/*
16) Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        int elemento, numeroBuscar, numerosEncontrados = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos del vector");
        elemento = leer.nextInt();

        int vector[] = new int[elemento];

        for (int i = 0; i < vector.length; i++) {

            //Como Math.random va a generar un dato de tipo double colocamos int para convertirlo
            //y con el * le damos el rango en este caso de 0 a 100
            vector[i] = (int) (Math.random() * 100);

        }

        System.out.println("Ingrese un numero a buscar dentro del vector");
        numeroBuscar = leer.nextInt();

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] == numeroBuscar) {

                System.out.println("Vector [" + i + "]: " + numeroBuscar);

                numerosEncontrados++;
            }
        }

        if (numerosEncontrados == 0) {

            System.out.println("No se encontro ninguna vez el número " + numeroBuscar + " en el vector");

        } else {

            System.out.println("El número " + numeroBuscar + " se encontro en el vector " + numerosEncontrados + " veces");

        }

    }

}
