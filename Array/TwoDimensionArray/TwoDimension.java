package Array.TwoDimensionArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * You are given a  2D array. An hourglass in an array is a portion shaped like this:
 * <pre>  {@code a b c}</pre>
 * <pre>  {@code * d *}</pre>
 * <pre>  {@code e f g}</pre>
 * The characters a-g represent a number in the range [-9, 9] and the asterisks are numbers which are
 * <strong>not</strong> part of the hourglass. In this problem you have to print the largest sum among
 * all the hourglasses in the array.
 * <p>
 * Further details available in the {@code info.pdf} file.
 */
public class TwoDimension {
    private static final int BOARD_SIZE = 6;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < BOARD_SIZE; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < BOARD_SIZE; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }
        bufferedReader.close();

        List<Integer> hourglassSums = new ArrayList<>();
        int[] currentHourglass = new int[BOARD_SIZE + 1];
        // hourglass[0, 1, 2] = * * *
        // hourglass[3] =         *
        // hourglass[4, 5, 6] = * * *

        for (int x = 1; x < BOARD_SIZE - 1; x++) {
            for (int y = 1; y < BOARD_SIZE - 1; y++) {
                currentHourglass[0] = arr.get(x - 1).get(y - 1);
                currentHourglass[1] = arr.get(x - 1).get(y);
                currentHourglass[2] = arr.get(x - 1).get(y + 1);
                currentHourglass[3] = arr.get(x).get(y);
                currentHourglass[4] = arr.get(x + 1).get(y - 1);
                currentHourglass[5] = arr.get(x + 1).get(y);
                currentHourglass[6] = arr.get(x + 1).get(y + 1);

                hourglassSums.add(IntStream.of(currentHourglass).sum());
            }
        }

        int maxHourglassSum = hourglassSums.stream().max(Integer::compareTo).get();
        System.out.println(maxHourglassSum);
    }
}
