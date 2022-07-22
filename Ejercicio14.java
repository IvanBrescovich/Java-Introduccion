/*
14) Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
  El cambio de divisas es:
  0.86 libras es un 1 €
  1.28611 $ es un 1 €
  129.852 yenes es un 1 €



 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        double euros;
        String moneda;

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de euros a convertir: ");
        euros = leer.nextDouble();
        System.out.print("Ahora ingrese la moneda a convertir dolar, libra o yen: ");
        moneda = leer.next();

        convertir(euros, moneda);

    }

    public static void convertir(double euros, String moneda) {

        switch (moneda) {
            case "dolar":
                System.out.println(euros + " Euro = " + (euros * 1.28) + " " + moneda);
                break;
            case "libra":
                System.out.println(euros + " Euro = " + (euros * 0.86) + " " + moneda);
                break;
            case "yen":
                System.out.println(euros + " Euro = " + (euros * 129.85) + " " + moneda);
                break;
            default:
                System.out.println("Selecciono incorrectamente la moneda, no es posible hacer la conversión");
                break;
        }

    }

}
