public class StringToASCCI {
    /*
     * Iterate throught the previous String and transform all character of this
     * ASCCI code . Show the result in rect line separated by an space between each
     * character
     */

     public static void main(String[] args) {
        String string = "La lluvia en Sevilla es maravillosa";
        for (int i = 0; i < string.length(); i++) {
            int characterASCCI = (int)string.charAt(i);
            System.out.print(characterASCCI + "-");
        }
        🙂 
     }

}
