package com.yyh.algorithm.sort;

/**
 * @author pc-d
 */
public class Bubble extends Sort {
    public static void sort(int[] arr) {
        sort(arr, true);
    }

    /**
     * 冒泡排序
     * <p>
     * <li>相邻的两个元素比较交换位置，</li>
     * <li> 第一个for循环只是作为循环的次数，只需要循环(length-1)次就可以了</Li>
     * <li> 第二个for循环主要是比较相邻两个元素的大小，再交换位置。循环次数为递减的(length-i-1),
     * 每当第一个for循环完成一次，就有一个数据排好顺序了,所以只需要在循环剩下的就可以了</li>
     *
     * </p>
     *
     * @param arr
     * @param sortAsc true:正序,false:倒序
     */
    public static void sort(int[] arr, boolean sortAsc) {
        for (int i = 1; i < arr.length; i++) {
            boolean swaped = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (sortAsc) {
                    if (arr[j] > arr[j + 1]) {
                        swaped = swap(arr, j, j + 1);
                    }
                } else {
                    if (arr[j] < arr[j + 1]) {
                        swaped = swap(arr, j, j + 1);

                    }
                }
            }
            if (!swaped) {//如果没有交换就说明已经排好序了
                break;
            }
            soutMsg(i, arr);
        }
    }

}
