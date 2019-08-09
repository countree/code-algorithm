package com.yyh.algorithm;

import java.util.Arrays;

/**
 * 方便在子类直接执行代码测试,
 * 省的在每个子类中写main方法
 * <p>
 * static{
 * main = new ${Child}();
 * }
 * </P>
 *
 * @author pc-d
 */
public abstract class RunMain {
    protected static RunMain main;
    protected static String name;
    protected static int[] arr = {2, 1, 5, 6, 1, 7, 5, 8, 2, 9, 4, 12, 9, 0};


    public static void main(String[] args) {
        RunMain s = main;
        if (s == null) {
            System.out.println("需要在子类中添加如下代码:");
            System.out.printf("static{\n\tmain= new ?() ;\n}\n");
        }
        System.out.println(name + "：" + s.getClass().getSimpleName());
        String ostr = s.run();
        System.out.println("执行结果：" + ostr);
    }


    /**
     * 方便在子类直接执行代码测试
     *
     * @return
     */
//    public abstract String name();

    /**
     * 方便在子类直接执行代码测试
     *
     * @return
     */
    protected abstract String run();

    protected static void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    protected static String arrToStr(int[] arr) {
        return Arrays.toString(arr);
    }
}
