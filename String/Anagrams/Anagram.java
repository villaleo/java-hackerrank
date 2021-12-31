package String.Anagrams;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.
 * For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA,
 * aTC, and CtA.
 * <p>
 * Further details are provided in the info.pdf file provided within this directory.
 */
public class Anagram {
    static boolean isAnagram(String a, String b) {
        Map<Character, Integer> characters_a = new HashMap<>();
        Map<Character, Integer> characters_b = new HashMap<>();

        for (char c : a.toLowerCase().toCharArray())
            characters_a.put(c, characters_a.getOrDefault(c, 1) + 1);

        for (char c : b.toLowerCase().toCharArray())
            characters_b.put(c, characters_b.getOrDefault(c, 1) + 1);

        return characters_a.equals(characters_b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
