package com.yyh.algorithm.sort;

import com.yyh.algorithm.RunMain;

import java.util.Arrays;

/**
 * @author pc-d
 */
public class Bubble extends RunMain {

    static {
        name = "冒泡排序";
        main = new Bubble();
    }


    @Override
    public String run() {
        int[] orgArr = {1, 9, 11, 6, 5, 7, 0, 4, 17, 13, 3, 8, 2, 16, 10};
        sort(orgArr, true);
        System.out.println(">>>>>再倒序排列一遍");
        sort(orgArr, false);
        System.out.println(">>>>>再正序排列一遍");
        sort(orgArr, true);
        return Arrays.toString(orgArr);
    }


    /**
     * 冒泡排序
     * <p>
     * 相邻的两个元素比较交换位置，
     * 最外层循环只是作为循环的次数，冒泡排序只需要循环(length-1)次就可以了
     * 内层循环主要是比较相邻两个元素的大小，再交换位置。循环次数为递减的(length-i-1),
     * 每当最外层循环一次，就有一个数据排好顺序了,所以只需要排列剩下的就可以了
     * </p>
     *
     * @param arr
     * @param sortAsc true:asc,false:desc
     */
    public void sort(int[] arr, boolean sortAsc) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (sortAsc) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr, j, j + 1);
                    }
                } else {
                    if (arr[j] < arr[j + 1]) {
                        swap(arr, j, j + 1);
                    }
                }
            }
            System.out.println("第" + i + "次排序后:" + Arrays.toString(arr));
        }
    }
}
