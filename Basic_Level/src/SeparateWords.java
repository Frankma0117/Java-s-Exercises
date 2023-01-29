public class SeparateWords {
    /*Separate the words of the phrase and count the quantity of words */

    public static void main(String[] args) {
        String string = "Hola amigos de Java";
        String[] separated = string.split(" ");
        for (String word : separated) {
            System.out.print(word + "-");
        }
        System.out.println("\nLa cantidad de palabras es " + separated.length);
    }
    
}
