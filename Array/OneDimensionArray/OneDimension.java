package Array.OneDimensionArray;

import java.util.Scanner;

/**
 * An array is a simple data structure used to store a collection of data in a contiguous block of memory.
 * Each element in the collection is accessed using an index, and the elements are easy to find because
 * they're stored sequentially in memory.
 * <p>
 * Create an array, {@code a}, capable of holding {@code n} integers.
 * Modify the code in the loop so that it saves each sequential value to its corresponding location in the array.
 * For example, the first value must be stored in {@code a[0]}, the second value must be stored in {@code a[1]}, and so on.
 */
public class OneDimension {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = scan.nextInt();
        scan.close();

        for (int j : a)
            System.out.println(j);
    }
}
