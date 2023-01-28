import java.util.Scanner;

public class SecondGradeEquation {
    /*
     * Create an aplication that calculate the equation of second grade . Request
     * the variables a , b and c by console and check before the discriminant (Use
     * the sqlrt of Math).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de a ");
        double a = scanner.nextDouble();
        System.out.println("Ingrese el valor de b ");
        double b = scanner.nextDouble();
        System.out.println("Ingrese el valor de c ");
        double c = scanner.nextDouble();
        scanner.close();
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        if (discriminant < 0) {
            System.out.println(
                    "El discriminante (" + discriminant
                            + ") de la ecuación es negativo por tanto no es posible realizar la solución cuadrática");
        } else {
            double root = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
            double solution1 = (-b + root) / (2 * a);
            double solution2 = (-b - root) / (2 * a);
            System.out.println("Las soluciones de la ecuación cuadrática son: " + solution1 + " " + solution2);
        }
    }
}
