package String.Substring;

import java.util.Scanner;

/**
 * Given a string, {@code s}, and two indices, {@code start} and {@code end}, print a substring consisting of all
 * characters in the inclusive range from {@code start} to {@code end - 1}.
 * <p>
 * Further details are provided in the info.pdf file provided within this directory.
 */
public class Substrings {
    public static void main(String[] args) {
        Scanner buffer = new Scanner(System.in);
        String s = buffer.next();

        int start = buffer.nextInt();
        int end = buffer.nextInt();

        System.out.println(s.substring(start, end));
    }
}
