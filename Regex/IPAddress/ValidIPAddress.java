package Regex.IPAddress;

import java.util.Scanner;

/**
 * Write a class called MyRegex which will contain a string pattern. You need to write a regular
 * expression and assign it to the pattern such that it can be used to validate an IP address.
 * <p>
 * Further details are provided in the info.pdf file provided within this directory.
 */
public class ValidIPAddress {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(MyRegex.pattern));
        }

    }
}

class MyRegex {
    public static String pattern = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
    // (25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)
}