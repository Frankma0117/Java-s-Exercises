import java.util.Scanner;

public class PairNumber {
    /*
     * Read a number by keyword and indicate if the number is divisible by two
     * (rest=0) if the number isn't divisible indicate.
     */

    public static void main(String[] args) {
        System.out.println("Ejercicio 6 -  Divisible by two");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número para verificar");
        int number = scanner.nextInt();
        scanner.close();
        if (number % 2 == 0) {
            System.out.println("El numero ES divisible con resto cero entre dos");
        } else {
            System.out.println("El numero NO ES divisible con resto cero entre dos");
        }
    }

}
