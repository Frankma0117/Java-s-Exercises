import java.util.Scanner;

public class PrimeNumber {
    /*
     * Read a number by keyboard and indicate if the number is prime or not . The
     * prime number is that one that only is divided into one and itself
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisors = 0;
        System.out.println("Ingresa el número a verificar");
        int number = scanner.nextInt();
        scanner.close();
        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                divisors++;
            }
        }
        if (divisors > 2) {
            System.out.println("El número NO es primo");
        } else {
            System.out.println("El número ES primo");
        }

    }

}
