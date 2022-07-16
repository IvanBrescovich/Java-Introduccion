/* 
1) Escribir un programa que pida dos números enteros por teclado y 
calcule la suma de los dos. El programa deberá después mostrar 
el resultado de la suma.
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero para realizar la suma");

        int numero1 = leer.nextInt();

        System.out.println("Ingrese otro numero para realizar la suma");

        int numero2 = leer.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("La suma de " + numero1 + " y " + numero2
                + " da como resultado " + resultado);
    }

}
