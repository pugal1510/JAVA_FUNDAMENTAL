package src.Array;

import javax.management.StandardEmitterMBean;

public class sortedarray {
    public static void main(String[] args) {
        int[] arr = {68, 25, 71, 43, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }
            }
        }
        for (int num = 0; num < arr.length; num++) {
            System.out.println(arr[num]);
        }


    }
}
