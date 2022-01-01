package Stacks.BalancedExpression;

import java.util.EmptyStackException;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * There will be multiple lines in the input file, each having a single non-empty string. You should read input
 * till end-of-file. For each case, print 'true' if the string is balanced, 'false' otherwise.
 * <p>
 * Further details available in the {@code info.pdf} file.
 */
public class BalancedParenthesis {
    private static boolean isBalancedExpression(String input) {
        Stack<Character> stack = new Stack<>();
        char[] inputArray = input.toCharArray();

        if (inputArray.length % 2 != 0)
            return false;

        for (char c : inputArray) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);

            try {
                if (c == ')' && stack.peek() == '(')
                    stack.pop();
                else if (c == '}' && stack.peek() == '{')
                    stack.pop();
                else if (c == ']' && stack.peek() == '[')
                    stack.pop();
            } catch (EmptyStackException e) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Queue<String> response = new java.util.LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.nextLine();
            response.add(isBalancedExpression(input) ? "true" : "false");
        }

        for (String s : response)
            System.out.println(s);
    }
}
