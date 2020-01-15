package com.mark.algorithm.utils;

/**
 * @Author: Sunwj@sqbj.com
 * @Date: 2020/1/15 2:45 下午
 * 排序的工具类
 */
public class SortUtils {


    //表示v<w的时候
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
