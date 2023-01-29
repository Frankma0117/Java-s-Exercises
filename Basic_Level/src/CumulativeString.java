import java.util.Scanner;

public class CumulativeString {
    /*
     * Ask the user that write various phrases until that insert a empty string and
     * show the resulting string
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la primer frase");
        String phrase = scanner.nextLine();
        String result = phrase;
        while (phrase.length()!=0) {
            System.out.println("Ingresa la frase siguiente");
            phrase = scanner.nextLine();
            result += phrase + " ";
        }
        scanner.close();
        System.out.println("El string acumulativo es " + result);
    }
}
