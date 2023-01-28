import java.util.Scanner;

public class CircleArea {
    /**
     * Create an aplication that calculate the area of a circle (pi*r^2) . Radious
     * is request by console . Use the **PI** constant and **pow** method of
     * **Math**.
     */

     public static void main(String[] args) {
        System.out.println("Ejercicio 5 -  Área de un círculo");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo");
        double radious = scanner.nextDouble();
        scanner.close();
        double area = Math.PI * Math.pow(radious, radious);
        System.out.println("El area del circulo es " + area);
     }
}
