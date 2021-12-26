package Stream.EOF;

import java.util.*;

/**
 * The challenge here is to read n lines of input until you reach EOF, then number and
 * print all n lines of content.
 * <p>
 * Further details are provided in the info.pdf file provided within this directory.
 */
public class EndOfFile {

    public static void main(String[] args) {
        Scanner buffer = new Scanner(System.in);
        int counter = 1;
        while (buffer.hasNext()) {
            System.out.println((counter++) + " " + buffer.nextLine());
        }
    }
}
