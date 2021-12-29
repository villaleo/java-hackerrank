package String.Introduction;

import java.util.Locale;
import java.util.Scanner;

/**
 * Given two strings of lowercase English letters, A and B, perform the following operations:
 * <p>
 * 1. Sum the lengths of A and B.
 * <p>
 * 2. Determine if A is lexicographically larger than B.
 * <p>
 * 3. Capitalize the first letter in A and B and print them on a single line, separated by a space.
 * <p>
 * Further details are provided in the info.pdf file provided within this directory.
 */
public class IntroToStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int sum = A.length() + B.length();
        boolean isLexicographicallyLarger = A.compareTo(B) > 0;
        String capitalized = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(sum);
        System.out.println(isLexicographicallyLarger ? "Yes" : "No");
        System.out.println(capitalized);
    }
}

