/*
10) Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero como limite");
        int numero = leer.nextInt();
        int i = 0;

        while (i < numero) {
            System.out.println("Ingrese otro numero hasta superar el limite");
            i += leer.nextInt();

        }
        System.out.println("El limite " + numero + " fue superado por el numero " + i);
    }
}
