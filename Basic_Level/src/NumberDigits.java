import java.util.Scanner;

public class NumberDigits {
    /* Read a positive number by keyboard and show the number of digits */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número");
        int number = scanner.nextInt();
        scanner.close();
        String auxiliar = "";
        int quantityDigits = 0;
        if (number < 0) {
            System.out.println("El número que ingresaste no es entero positivo");
        } else {
            auxiliar = "" + number;
            for (int i = 0; i < auxiliar.length(); i++) {
                quantityDigits++;
            }
        }
        System.out.println("La cantidad de cifras del número ingresado es " + quantityDigits);

    }

}
