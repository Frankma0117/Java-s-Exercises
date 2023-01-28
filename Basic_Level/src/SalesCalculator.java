import java.util.Scanner;

import javax.swing.JOptionPane;

public class SalesCalculator {
    /*
     * Create an aplication that asks us a number of sales and after ask to enter
     * sale by sale . Finally show the sum of all sales.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de ventas totales");
        int quantitySales = scanner.nextInt();
        double resultSales = 0;
        for (int i = 0; i < quantitySales; i++) {
            System.out.println("Ingrese la venta N° " + i);
            resultSales += scanner.nextDouble();
        }
        scanner.close();
        System.out.println("El valor total de las ventas es $" + resultSales);
    }

}
