package com.yyh.algorithm.sort;

/**
 * 选择排序
 */
public class Selection extends Sort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(arr, i, min);
            }
            soutMsg(i,arr);
        }
    }
}
