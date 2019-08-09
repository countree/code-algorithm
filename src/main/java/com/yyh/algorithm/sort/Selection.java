package com.yyh.algorithm.sort;

import com.yyh.algorithm.RunMain;

public class Selection extends RunMain {
    static {
        main = new Selection();
        name = "选择排序";
    }

    @Override
    public String run() {
        sort2(arr);
        return arrToStr(arr);
    }

    public static void sort1(int[] arr) {
        int min;
        int max;
        int count = arr.length;
        for (int i = 0; i < count; i++) {
            // 初始化未排序序列中最小数据数组下标
            min = i;
            // 初始化未排序序列中最大数据数组下标
            max = count - 1;
            for (int j = i; j < count; j++) {
                // 在未排序元素中继续寻找最小元素，并保存其下标
                if (arr[min] >= arr[j]) {
                    min = j;
                }
                // 在未排序元素中继续寻找最大元素，并保存其下标
                if (arr[max] <= arr[j]) {
                    max = j;
                    System.out.println("交换第" + i * j + ":" + arrToStr(arr));
                }
            }
            // 将未排序列中最小元素放到已排序列头
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            // 将未排序列中最大元素放到已排序列尾
            // 将未排序列中最大元素放到已排序列尾
            if (max != count - 1) {
                if (max == i) {
                    int temp = arr[min];
                    arr[min] = arr[count - 1];
                    arr[count - 1] = temp;
                } else {
                    int temp = arr[max];
                    arr[max] = arr[count - 1];
                    arr[count - 1] = temp;
                }
            }
            System.out.println("第" + i + "次:" + arrToStr(arr));
            count--;
        }
    }

    public void sort2(int[] arr) {
        int sp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    sp++;
                    swap(arr, i, j);
                    System.out.println("交换第" + sp + ":" + arrToStr(arr));
                }
            }
            System.out.println("第" + i + "次:" + arrToStr(arr));
        }
    }

}
