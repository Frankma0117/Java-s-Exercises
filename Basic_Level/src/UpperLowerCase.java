import java.util.Scanner;

public class UpperLowerCase {
    /*Convert a phrase to uppercase or lowcase depending of the user's choice */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona el tipo de conversión que deseas realizar \n" +
        "1.Convertir de minúscula a mayúscula\n"+
        "2.Convertir de mayúscula a minúscula");
        int option = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingresa la frase a convertir");
        String phrase = scanner.nextLine();
        scanner.close();
        String result ="";
        if(option==1){
            result = phrase.toUpperCase();
        }else if(option==2){
            result = phrase.toLowerCase();
        }
        System.out.println("El resultado de la operación elegida es " + result);
    }
    
}
