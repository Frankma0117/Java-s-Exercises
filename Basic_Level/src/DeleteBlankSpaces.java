import java.util.Scanner;

public class DeleteBlankSpaces {
    /* Delete the blank spaces in a phrase request by console */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la frase a validar");
        String phrase = scanner.nextLine();
        scanner.close();
        System.out.println(phrase.replace(" ", ""));
    }
}
