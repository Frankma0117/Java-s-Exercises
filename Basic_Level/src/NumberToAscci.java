import java.util.Scanner;

public class NumberToAscci {
    /*
     * Read a number by keyword and show by console the respective character ASCCI.
     */

     public static void main(String[] args) {
        System.out.println("Ejercicio 7 -  ASCCI Character");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el caracter a transformar");
        int number = scanner.nextInt();
        scanner.close();
        char character = (char) number;
        System.out.println("El numero " + number + " representado en ASCCI es " + character);
     }
}
