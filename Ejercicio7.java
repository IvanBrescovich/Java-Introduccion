/*
7) Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la frase");
        String frase = leer.nextLine();

        if (frase.equals("eureka")) {
            System.out.println("Es Correcto");

        } else {
            System.out.println("Es Incorrecto");
        }

    }

}
