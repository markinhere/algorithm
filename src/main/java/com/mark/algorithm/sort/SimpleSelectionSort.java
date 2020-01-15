package com.mark.algorithm.sort;

import com.mark.algorithm.utils.SortUtils;

import java.util.Arrays;

/**
 * @Author: Sunwj@sqbj.com
 * @Date: 2020/1/15 10:20 上午
 * 简单选择排序
 * 概念：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，
 * 然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 */
public class SimpleSelectionSort {


    /**
     * 正常情况简单选择排序
     * @param array
     */
    static void simpleSelectionSort(int[] array) {

        if (array == null || array.length <= 1) {
            return;
        }

        for (int i = 0; i < array.length-1 ; i++) {
            int min = i;
            //这里表示用第一个和后边全部依次比较，如果发现前边的小，则进行交换，直到最终拿到最小的那个
            for (int j = i+1; j < array.length ; j++) {
                if (SortUtils.less(array[j],array[min])) {
                    min = j;
                }
                SortUtils.swap(array,i,min);
            }
        }
        System.out.println("array = " + Arrays.toString(array));
    }

}
