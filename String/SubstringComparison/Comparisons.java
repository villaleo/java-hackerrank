package String.SubstringComparison;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * Given a string, {@code s}, and an integer, {@code k}, complete the function so that it finds the lexicographically
 * smallest and largest substrings of length {@code k}.
 * <p>
 * Further details are provided in the info.pdf file provided within this directory.
 */
public class Comparisons {
    public static String getMax(List<String> list) {
        String min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(min) > 0) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static String getMin(List<String> list) {
        String max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) < 0) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static String getSmallestAndLargest(String s, int k) {
        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < s.length() - k + 1; i++) {
            substrings.add(s.substring(i, i + k));
        }

        // 'smallest' must be the smallest lexicographically substring of length 'k'
        // 'largest' must be the largest lexicographically substring of length 'k'
        String smallest = getMin(substrings), largest = getMax(substrings);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        
        System.out.println(getSmallestAndLargest(s, k));
    }

}

