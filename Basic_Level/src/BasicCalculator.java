public class BasicCalculator {

    /**Declare two numeric variables (with the value you want). 
     * Display by console the addtion , subtraction ,
     * multiplication , division and module (remainder of the division).
    **/
    public static void main(String[] args) throws Exception {
        int number1 = 3;
        int number2 = 4;
        System.out.println("Ejercicio 1 - Operaciones básicas");
        System.out.println("El resultado de la suma de los dos numeros es : " + (number1+number2));
        System.out.println("El resultado de la resta de los dos numeros es : " + (number1-number2));
        System.out.println("El resultado de la multiplicación de los dos numeros es : " + number1*number2);
        System.out.println("El resultado de la división de los dos numeros es : " + number1/number2);
        System.out.println("El resultado del módulo de los dos numeros es : " + number1%number2);
    }
}
