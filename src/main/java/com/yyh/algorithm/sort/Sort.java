package com.yyh.algorithm.sort;

import java.util.Arrays;

public class Sort {
    protected static void soutMsg(int i, int[] arr) {
        System.out.println("第" + i + "次:" + Arrays.toString(arr));
    }

    /**
     * 交换位置
     *
     * @param arr
     * @param i
     * @param j
     * @return
     */
    protected static boolean swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
        return true;
    }
}
