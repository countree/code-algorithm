package com.yyh.algorithm.sort;

public class Sort {
    /**
     * 交换位置
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
