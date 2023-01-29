import java.util.Scanner;

public class RandomNumbers {
    /*
     * Read two numbers and generate ten random numbers between those numbers , use
     * the Math.random methos by generate a random number
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el límite inferior de los números a generar");
        int inferiorLimit = scanner.nextInt();
        System.out.println("Ingresa el límite superior de los números a generar");
        int superiorLimit = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < 10; i++) {
            System.out.println(inferiorLimit + (int) (Math.random() * (superiorLimit - inferiorLimit + 1)));
        }
    }

}
