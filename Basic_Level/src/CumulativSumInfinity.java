import java.util.Scanner;

public class CumulativSumInfinity {
    /*
     * Create an aplication that allow insert a number until insert -1 and calculate
     * the total sum of entered numbers
     */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=0;
        int result = 0;
        while (number!=-1){
            System.out.println("Ingresa un número a la suma");
            number = scanner.nextInt();
            result+=number;
        }
        scanner.close();
        System.out.println("El resultado total de la suma es " + result);
    }

}
