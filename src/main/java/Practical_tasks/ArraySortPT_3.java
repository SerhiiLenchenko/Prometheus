package Practical_tasks;

/**
 * Created by Dell on 2/19/18.
 */
public class ArraySortPT_3 {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 4, 6,7,8,9};
        int length = array.length;
        boolean flag = true;

            while(flag) {
                flag = false;
                for (int j = 1; j < length; j++) {
                    if (array[j] < array[j - 1]) {
                        int t = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = t;
                        flag = true;

                    }

                }
            }






        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
