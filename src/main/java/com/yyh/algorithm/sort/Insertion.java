package com.yyh.algorithm.sort;

/**
 * @author pc-d
 */
public class Insertion extends Sort {
    /**
     * 插入排序
     * 顺序出一个元素作为基数和排好序的数据一个一个对比，如果比基数大元素就自动后移一位
     * 如果比基数小，就把基数放到当前元素的前一位置。
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        //假设数组左边是已经排好序的，右边是未排序的, i 是参照位置
        //顺序遍历数组中的数据，把 i 当作基数(当前需要排序的元素)
        for (int i = 1; i < arr.length; i++) {
            int indexValue = arr[i];
            //假设基数就是最小的数据
            int minIndex = i;
            //遍历已经排好序的元素
            // i 的左边即(小于<i) 的下标的元素是已经排好序的
            // j 可以直接替换为 minIndex,改为int minIndex=i-1;for(;minIndex>=0;minIndex--)
            for (int j = i - 1; j >= 0; j--) {
                // 拿基数和排好序的元素一个一个对比，如果比基数大则需要把当前元素后移一位,给基数腾个位置出来，好插入基数
                if (arr[j] > indexValue) {
                    arr[j + 1] = arr[j];
                    minIndex = j;
                } else {
                    break;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = indexValue;
            }
            soutMsg(i, arr);
        }
    }
}

