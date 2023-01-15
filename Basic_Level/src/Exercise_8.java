import java.util.Scanner;

public class Exercise_8 {
   /*
    * Modify the previous exercises to request the character and show the number in
    * ASCCI table.
    */

   public static void main(String[] args) {
      System.out.println("Ejercicio 8 -  ASCCI Number");
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingresa el caracter a transformar");
      char character = scanner.next().charAt(0);
      System.out.println("El caracter leido es " + character);
      scanner.close();
      int number = (int) character;
      System.out.println("El caracter " + character + " es representado en ASCCI por el numero " + number);
   }
}
