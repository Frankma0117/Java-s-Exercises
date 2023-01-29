public class StringVowels {

    public static void main(String[] args) {
        String string = "La lluvia en Sevilla es una maravilla";
        int vowels = 0;
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                vowels++;
            }
        }
        System.out.println("El total de vocales del mensaje es " + vowels);
    }

}
