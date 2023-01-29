public class PrimeNumbers1To100 {
    /* Show prime numbers between one and one hundred */

    public static void main(String[] args) {
        int divisors = 0;
        int number = 0;
        for (int i = 1; i <= 100; i++) {
            number = i;
            for (int j = number; j > 0; j--) {
                if (number % j == 0) {
                    divisors++;
                }
            }
            if (divisors <= 2) {
                System.out.print(number+"-");
            }
            divisors = 0;
        }
    }

}