import java.util.Scanner;

public class PolishCalculator {
    /*
     * Create an aplication that request two numbers and a arithmetic sign , perform
     * the operation according to the operators and the sign and show the result.
     * The avalaible signs are "+" for de sum operation , "-" for de substract
     * operation , "*" for de multiplication operation,
     * "/" for de division operation , "^" for de power operation and "%" for de
     * module operation
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer operador");
        int operator1 = scanner.nextInt();
        System.out.println("Ingresa el segundo operador");
        int operator2 = scanner.nextInt();
        System.out.println("Ingresa el signo operador");
        char sign = scanner.next(). charAt(0);
        scanner.close();
        switch (sign) {
            case '+':
                System.out.println("El resultado de la suma es " + (operator1 + operator2));
                break;
            case '-':
                System.out.println("El resultado de la resta es " + (operator1 - operator2));
                break;
            case '*':
                System.out.println("El resultado de la multiplicación es " + (operator1 * operator2));
                break;
            case '/':
                System.out.println("El resultado de la división es " + (operator1 / operator2));
                break;
            case '%':
                System.out.println("El resultado del módulo es " + (operator1 % operator2));
                break;
            case '^':
                System.out.println("El resultado de la potencia es " + (Math.pow(operator1, operator2)));
                break;
        }
    }

}
