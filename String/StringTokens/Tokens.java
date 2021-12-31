package String.StringTokens;

import java.util.Scanner;

/**
 * Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
 * We define a token to be one or more consecutive English alphabetic letters. Then, print the number
 * of tokens, followed by each token on a new line.
 * <p>
 * Further details are provided in the info.pdf file provided within this directory.
 */
public class Tokens {
    public static void main(String[] args) {
        Scanner buffer = new Scanner(System.in);
        String s = buffer.nextLine();
        buffer.close();

        // Each token is delimited by a symbol that is not an alphabetic letter.
        // (In this case, the symbols are '!', ',', '?', '.', '_', '@', and ' '.)
        var result = s.trim().split("[ !,?._'@]+");
        boolean isAllSpaces = result.length == 1 && result[0].isEmpty();

        if (isAllSpaces)
            System.out.println(0);
        else {
            System.out.println(result.length);
            for (var token : result) {
                System.out.println(token);
            }
        }
    }
}
