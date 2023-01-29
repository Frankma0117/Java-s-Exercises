import java.util.Scanner;

public class EqualsWords {
    /* Ask to the user two words by keyboard and indicate if the words are equals */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la primer palabra");
        String word1 = scanner.nextLine();
        System.out.println("Ingresa la segunda palabra");
        String word2 = scanner.nextLine();
        scanner.close();
        if (word1.equals(word2)) {
            System.out.println("Las palabras SON iguales");
        } else {
            System.out.println("Las palabras NO son iguales");
        }

    }

}
