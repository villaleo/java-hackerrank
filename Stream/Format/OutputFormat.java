package Stream.Format;

import java.util.Scanner;

/**
 * Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is
 * to test your understanding of formatting output using printf.
 * <p>
 * Every line of input will contain a String followed by an integer.
 * Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range
 * from 0 to 999.
 * <p>
 * Further details are provided in the info.pdf file provided within this directory.
 */
public class OutputFormat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");
    }
}



