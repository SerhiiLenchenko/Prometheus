package Practical_tasks;

import java.util.Arrays;

/**
 * Created by Dell on 2/16/18.
 */
public class PT1_2MatrixPrint {
    public static void main(String[] args) {
        String[][] ArrA = new String[5][5];
        int i,j = 0;
        int k = 1;
        for (i=0; i<5; i++) {
            for (j = 0; j< 5; j++) {
                if (i==j || j==(ArrA[i].length)-i-1) ArrA[i][j] = " * ";
                else
                if (k<=9) ArrA[i][j] = " " + Integer.toString(k) + " ";
                else
                    ArrA[i][j] = Integer.toString(k) + " ";
                k++;
                System.out.print(ArrA[i][j]);
            }
            System.out.println();
        }
    }
}

