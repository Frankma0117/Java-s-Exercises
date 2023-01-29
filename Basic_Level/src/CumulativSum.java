import java.util.Scanner;

public class CumulativSum {
    /*Perform the sum from one to a specific number greater than one */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número límite de la suma acumulativa");
        int number = scanner.nextInt();
        scanner.close();
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result+=i;
        }
        System.out.println("El resultado de la suma acumulativa es " + result);
    }
}
