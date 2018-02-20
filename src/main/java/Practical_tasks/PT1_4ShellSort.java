package Practical_tasks;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Dell on 2/19/18.
 */
public class PT1_4ShellSort {
    public static void main(String[] args) {
        int[] array = { 6, 7, 8, 9,1, 2, 3, 4, 5};
        int length = array.length;
        boolean flag = true;
        int s;

        int incS = 0;
        ArrayList<Integer> gaps = new ArrayList<Integer>();
        //int gapsSedgewick[];

//        ArrayList<Integer> gaps = new ArrayList<Integer>();
//        for (int i=0; i<length; i++) {
//            d = i*5;
//            gaps.add(d);
//            System.out.println(gaps.get(i));

        for (s = 0; (incS * 3) < length; s++) {
            if (s % 2 == 0) {
                incS = (int) ((9 * Math.pow(2, s)) - (9 * Math.pow(2, s / 2)) + 1);
            } else {
                incS = (int) ((8 * Math.pow(2, s)) - (6 * Math.pow(2, (s + 1) / 2)) + 1);
            }
            gaps.add(incS);
            System.out.println(gaps.get(s));
            System.out.println(incS);
        }
        System.out.println(incS);
        for (int i = 1; (gaps.size() - i) >= 0; i++){
            int g = gaps.get(gaps.size()-i);
            for (int j = 0; (j + g) < (length); j++){

                if (array[j] > array[j+ g]){
                    int t = array[j];
                    array[j] = array[j + g];
                    array[j + g] = t;

//        while(flag) {
//            flag = false;
//            while (gaps.get(i) < gaps.size()) {
//                for (int j = 0; j < length; j++) {
//                    if (array[j] > array[j + gaps.get(s)]) {
//                        int t = array[j];
//                        array[j] = array[j + gaps.get(s)];
//                        array[j + gaps.get(s)] = t;
//                        flag = true;
//
                    }

                }
            }

//        int gapsSedgewick[] = new int[s];
//
//        for (int i = 0; (incS * 3) < length; i++) {
//            if (i % 2 == 0) {
//                incS = (int) ((9 * Math.pow(2, i)) - (9 * Math.pow(2, i / 2)) + 1);
//            } else {
//                incS = (int) ((8 * Math.pow(2, i)) - (6 * Math.pow(2, (i + 1) / 2)) + 1);
//            }
//            gapsSedgewick[i] = incS;
//        }


//        for (int i = 0; i < s; i++) {
//            System.out.print(gapsSedgewick[i] + " ");
//        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

