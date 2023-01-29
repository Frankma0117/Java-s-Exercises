import java.util.ArrayList;
import java.util.List;

public class PositiveNegativeZeros {

    /*
     * Given an array of integers, calculate the ratios of its elements that are
     * positive, negative, and zero. Print the decimal value of each fraction on a
     * new line with places after the decimal.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        for (int number : arr) {
            if (number > 0) {
                positives++;
            } else if (number < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }
        System.out.println(positives / (double) arr.size());
        System.out.println(negatives / (double) arr.size());
        System.out.println(zeros / (double) arr.size());
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(-5);
        list.add(0);
        list.add(-7);
        list.add(9);
        PositiveNegativeZeros.plusMinus(list);
    }
}
