package com.mark.algorithm.sort;

import java.util.Arrays;

/**
 * @Author: Sunwj@sqbj.com
 * @Date: 2020/1/15 10:20 上午
 * 直接插入排序
 * 概念：它的工作原理是通过构建有序序列，对于未排序数据，
 * 在已排序序列中从后向前扫描，找到相应位置并插入。
 * 插入排序在实现上，通常采用in-place排序（即只需用到{O(1)}的额外空间的排序），
 * 因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 */
public class StraightInsertionSort {

    static void insertionSort (int[] array) {

        if (array == null || array.length <= 1) {
            return;
        }
        //拿到一个数组，将数组的之前的全部项和当前的对比，如果小于则交换
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            //这个步骤是将i之前的全部进行遍历进行比较，
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        System.out.println("array = " + Arrays.toString(array));
    }
}
