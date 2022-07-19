/*
11) Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

        MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros:");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();

        boolean salir = false;
        do {
            System.out.println("*********MENU*********");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Mltiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("*********************");
            System.out.println("Elija opción:");
            int opcion = leer.nextInt();

            int resultado;

            switch (opcion) {
                case 1:
                    System.out.println("La suma de los numeros seleccionados es: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros seleccionados es: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los numeros seleccionados es: " + (numero1 * numero2));
                    break;
                case 4:
                    System.out.println("La división de los numeros seleccionados es: " + (numero1 / numero2));
                    break;
                case 5:
                    String letra = leer.nextLine();
                    System.out.println("¿Estas seguro que desea salir del programa (S/N)?");
                    letra = leer.nextLine().toUpperCase();

                    if (letra.equals("S")) {
                        System.out.println("Haz eleguido salir del programa");
                        salir = true;

                    } else {
                        System.out.println("Haz eleguido seguir en el programa");

                    }
                    break;
                default:
                    System.out.println("La opción ingresada es incorrecta");
            }
        } while (salir == false);
    }

}
