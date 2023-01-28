public class MayorMinorEqual {

    /**
     * Declare two numeric variables (with the value you want) and indicated which
     * is greater of the two , if they are the same indicate that too. You see
     * changing the values to verify that it works.
     **/

    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 4;
        System.out.println("Ejercicio 2 - Condicionales");
        if (number1 > number2) {
            System.out.println("La variable uno es MAYOR que la variable dos");
        } else if (number1 < number2) {
            System.out.println("La variable uno es MENOR que la variable dos");
        } else {
            System.out.println("La variable uno es IGUAL que la variable dos");
        }
    }
}
