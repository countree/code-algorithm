package com.yyh.algorithm.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SortTest {
    int[] arr = {3, 6, 2, 7, 1, 5, 4, 9, 7, 23, 5, 13, 7, 8, 36};
    int[] orgArr = {3, 6, 2, 7, 1, 4, 5, 7, 9, 23, 5, 13, 7, 8, 36};

    private void name(String name) {
        System.out.println(">>>排序方式：" + name);
    }

    @Before
    public void before() {
        System.out.println("数组:" + Arrays.toString(arr));
        System.out.println("大小：" + arr.length);
    }

    @After
    public void after() {
        System.out.println("排序后：" + Arrays.toString(arr));
        arr = orgArr;
        System.out.println("↓");
        System.out.println("↓");
        System.out.println("↓");
    }

    @Test
    public void bubble() {
        name("冒泡排序");
        Bubble.sort(arr);
    }

    @Test
    public void selection() {
        name("选择排序");
        Selection.sort(arr);
    }
}
