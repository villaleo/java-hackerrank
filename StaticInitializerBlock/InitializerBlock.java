package StaticInitializerBlock;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Static initialization blocks are executed when the class is loaded, and you can initialize static variables
 * in those blocks.
 * <p>
 * It's time to test your knowledge of Static initialization blocks.
 * <p>
 * You are given a class Solution with a main method. Complete the given code so that it outputs the area of a
 * parallelogram with breadth B and height H. You should read the variables from the standard input.
 * <p>
 * If B <= 0 or H <= 0, the output should be "java.lang.Exception: Breadth and height must be positive" without
 * quotes. the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
 * <p>
 * Further details are provided in the info.pdf file provided within this directory.
 */
public class InitializerBlock {
    static int B;
    static int H;
    static boolean flag = true;

    // Field to initialize the static instance variables
    static {
        Scanner buffer = new Scanner(System.in);
        B = buffer.nextInt();
        H = buffer.nextInt();

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}


