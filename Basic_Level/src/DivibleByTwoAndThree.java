public class DivibleByTwoAndThree {
    /**
     * Show the numbers from one to one hundred divisible by two and three .
     * Use any loop you like.
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + "-");
            }
        }
    }
}
