package com.yyh.algorithm.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SortTest {
    int[] orgArr = {9, 7, 23, 5, 13, 8, 36, 3, 6, 2, 11, 1, 4};
    int[] arr = orgArr;

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

    @Test
    public void insertion() {
        name("插入排序");
        Insertion.sort(arr);
    }
}
