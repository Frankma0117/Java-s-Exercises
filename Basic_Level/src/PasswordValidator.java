import java.util.Scanner;

public class PasswordValidator {
    /*
     * Create an aplication with a String that contain a password . Before the
     * aplication ask to enter the password with three attemps. When the user hit
     * the aplication stops and show the message "Enhorabuena".
     */

    public static void main(String[] args) {
        String password = "Hola Mundo";
        Scanner scanner = new Scanner(System.in);
        String option = "";
        int attemps = 3;
        boolean isSucess = false;
        while (attemps != 0 && !isSucess) {
            System.out.println("Bienvenido , te quedan " + attemps + " vidas");
            System.out.println("Ingresa la contraseña ");
            option = scanner.nextLine();
            if (option.equals(password)) {
                System.out.println("Enhorabuena , has acertado");
                isSucess = true;
            } else {
                attemps--;
            }
        }
        if(attemps ==0){
            System.out.println("Lo siento ya no tienes más vidas ");
        }
        scanner.close();
    }
}
