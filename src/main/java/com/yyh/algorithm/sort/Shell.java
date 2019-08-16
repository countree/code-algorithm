package com.yyh.algorithm.sort;

import java.util.Arrays;

/**
 * @author pc-d
 */
public class Shell extends Sort {
    /**
     * 希尔排序
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
            }
            System.out.println("第" + i + "次:" + Arrays.toString(arr));
        }
    }
}

