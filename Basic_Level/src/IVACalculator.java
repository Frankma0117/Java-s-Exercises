import java.util.Scanner;

public class IVACalculator {
    /*
     * Read a number by keyboard that indicates a product price (with decimals) and
     * calculate the final price with IVA of 21%.
     */

     public static void main(String[] args) {
        System.out.println("Ejercicio 9 -  Price with IVA");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto");
        double price = scanner.nextDouble();
        scanner.close();
        double finalPrice = ((price * 21) / 100) + price;
        System.out.println("El precio final del producto con IVA incluido es $" + finalPrice);
     }
}
