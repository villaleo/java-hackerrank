package Array.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

/**
 * You are given {@code n} lines. In each line there are zero or more integers. You need to answer a few queries
 * where you need to tell the number located in {@code y}<sup>th</sup> position of {@code x}<sup>th</sup> line.
 * <p>
 * Further details available in the {@code info.pdf} file.
 */
public class NumberLocations {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        Scanner buffer = new Scanner(System.in);
        int n = buffer.nextInt();

        ArrayList<Integer> temp = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int d = buffer.nextInt();

            if (d == 0) {
                list.add(new ArrayList<>());
                continue;
            }

            for (int j = 0; j < d; j++)
                temp.add(buffer.nextInt());

            list.add(new ArrayList<>(temp));
            temp.clear();
        }

        int q = buffer.nextInt();

        for (int i = 0; i < q; i++) {
            int x = buffer.nextInt(), y = buffer.nextInt();
            try {
                if (list.get(x - 1).isEmpty())
                    throw new IndexOutOfBoundsException();

                queue.add(list.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                queue.add(-1);
            }
        }

        for (int entry : queue)
            System.out.println(entry == -1 ? "ERROR!" : entry);
    }
}
