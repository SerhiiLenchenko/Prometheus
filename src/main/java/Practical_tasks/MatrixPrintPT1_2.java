package Practical_tasks;

import java.util.Arrays;

/**
 * Created by Dell on 2/16/18.
 */
public class MatrixPrintPT1_2 {
    public static void main(String[] args) {
        int size = 8;

        int [][] matrixB = {
                {1,2,123,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        /*System.out.println(matrixB[0][1] + " ");
        System.out.println(matrixB[0][3] + " ");
        System.out.println(matrixB[4][4] + " ");*/

       // int [][] matrixA = new int[5][5];

        for (int i=0; i<matrixB.length; i++) {
            /*for (int j=0; j<matrixB[i].length; j++) {
                //matrixB[i][j] = i+j+1;*/
                System.out.println(Arrays.toString(matrixB[i]));
            }
            System.out.println();
        }
    }

