public class ExtractLetters {
    /*Extract the four and five letter of the a string */
    public static void main(String[] args) {
        String string = "Dinosaurio";
        String newString = string.substring(3, 5);
        System.out.println("Las letras en las posiciones 4 y 5 son " + newString);
    }
    
}
