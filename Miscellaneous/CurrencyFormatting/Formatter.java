package Miscellaneous.CurrencyFormatting;

import java.util.*;
import java.text.*;

/**
 * Given a double-precision number, {@code payment}, denoting an amount of money, use the NumberFormat class'
 * getCurrencyInstance method to convert {@code payment} into the US, Indian, Chinese, and French currency formats.
 * <p>
 * Further details are provided in the info.pdf file provided within this directory.
 */
public class Formatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        var indiaLocale = new Locale("en", "IN");

        var us = NumberFormat.getCurrencyInstance(Locale.US);
        var india = NumberFormat.getCurrencyInstance(indiaLocale);
        var china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        var france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}