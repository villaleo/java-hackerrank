package HashMaps;

import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

/**
 * You are given a phone book that consists of people's names and their phone number. After that you will be given
 * some person's name as query. For each query, print the phone number of that person.
 * <p>
 * The first line will have an integer {@code n} denoting the number of entries in the phone book. Each entry consists
 * of two lines: a name and the corresponding phone number.
 * <p>
 * After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
 * <p>
 * Further details available in the {@code info.pdf} file.
 */
public class Map {
    public static void main(String[] argh) {
        java.util.Map<String, Integer> phonebook = new HashMap<>();
        Queue<String> queue = new java.util.LinkedList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();

            phonebook.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.nextLine();

            if (!phonebook.containsKey(s)) {
                queue.add("Not found");
                continue;
            }
            queue.add(s + "=" + phonebook.get(s));
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
