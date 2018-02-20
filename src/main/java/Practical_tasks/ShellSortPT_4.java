package Practical_tasks;

import java.util.Arrays;

/**
 * Created by Dell on 2/19/18.
 */
public class ShellSortPT_4 {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = array.length;
        boolean flag = true;
        int s = 0;
        int incS = 0;
        //int gapsSedgewick[];

        for (s = 0; (incS * 3) < length; s++) {
            if (s % 2 == 0) {
                incS = (int) ((9 * Math.pow(2, s)) - (9 * Math.pow(2, s / 2)) + 1);
            } else {
                incS = (int) ((8 * Math.pow(2, s)) - (6 * Math.pow(2, (s + 1) / 2)) + 1);
            }

            System.out.println(incS);
        }
        int gapsSedgewick[] = new int[s];

        for (int i = 0; (incS * 3) < length; i++) {
            if (i % 2 == 0) {
                incS = (int) ((9 * Math.pow(2, i)) - (9 * Math.pow(2, i / 2)) + 1);
            } else {
                incS = (int) ((8 * Math.pow(2, i)) - (6 * Math.pow(2, (i + 1) / 2)) + 1);
            }
            gapsSedgewick[i] = incS;
        }


        for (int i = 0; i < s; i++) {
            System.out.print(gapsSedgewick[i] + " ");
        }

    }
}

