import java.util.Scanner;

public class Exercise_15 {
    /*
     * Read a number by keyboard and check that this number is mayor o equal to zero
     * , if the number is minor to zero repeat the request and show the number by
     * console.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        do {
            System.out.println("Ingresa un número por consola mayor que cero");
            number = scanner.nextDouble();
        } while (number <= 0);
        System.out.println("El número es " + number);
        scanner.close();
    }

}
