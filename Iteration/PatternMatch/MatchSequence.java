package Iteration.PatternMatch;

import java.util.*;
import java.lang.Math;

/**
 * You are given q queries in the form of a, b, and n. For each query, print the series corresponding
 * to the given a, b, and n values as a single line of n space-separated integers.
 * <p>
 * Series format and further details are specified in the external file info.pdf.
 */
class MatchSequence {
    public static int sumSeries(int a, int b, int n) {
        int sum = a + b;
        if (n == 0) return sum;
        for (int i = 1; i < n; i++) {
            sum += ((int) (Math.pow(2, i))) * b;
        }
        return sum;
    }

    public static void display(int a, int b, int n) {
        for (int i = 1; i < n + 1; i++) {
            System.out.print(sumSeries(a, b, i) + " ");
        }
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            display(a, b, n);
            System.out.println();
        }
        in.close();
    }
}
