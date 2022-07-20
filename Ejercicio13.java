/*
13) Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
  * * * *
  *     *
  *     *
  * * * *
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        int elementos;
        String linea;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero para realizar el grafico");
        elementos = leer.nextInt();

        for (int i = 0; i < elementos; i++) {
            System.out.print("*");

        }
        System.out.println("");

        for (int i = 0; i < elementos - 2; i++) {
            System.out.print("*");

            for (int j = 0; j < elementos - 2; j++) {
                System.out.print(" ");

            }
            System.out.print("*");
            System.out.println("");

        }

        for (int i = 0; i < elementos; i++) {
            System.out.print("*");

        }

    }
}
