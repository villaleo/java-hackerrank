package String.Reverse;

import java.util.*;

/**
 * Given a string A, print 'Yes' if it is a palindrome, print 'No' otherwise.
 * <p>
 * Further details are provided in the info.pdf file provided within this directory.
 */
public class ReverseString {
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for (char c : str.toCharArray())
            stack.push(c);
        while (!stack.empty())
            res.append(stack.pop());
        return res.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if (A.equals(reverseString(A)))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}




