package com.mark.algorithm.sort;

import java.util.Arrays;
import java.util.Date;

/**
 * @Author: Sunwj@sqbj.com
 * @Date: 2020/1/15 10:19 上午
 * 冒泡排序
 * 概念：数组进行排序，两两比较相邻记录的关键字，如果反序则交换，直到没有反序的记录为止。
 *
 */
public class BubbleSort {

    /**
     * 正常冒泡排序
     * 理解：
     * @param array
     */
    static void bubbleSort(int[] array){

        Date StartTime = new Date();
        if (array == null || array.length <= 1) {
            return;
        }
        for (int i = array.length-1; i > 0 ; i--) {
            //当前需要进行逐一比较的值
            for (int j = 0 ; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        Date endTime = new Date();
        System.out.println("array = " + Arrays.toString(array) + "执行的时间差为" + (endTime.getTime()-StartTime.getTime()));
    }

    /**
     * 更优的冒泡排序方法--如果经过一轮遍历发现已经是有序的就不再进行排序
     * 理解：
     * @param array
     */
    static void betterBubbleSort(int[] array){

        Date StartTime = new Date();
        if (array == null || array.length <= 1) {
            return;
        }
        boolean flag = true;

        for (int i = array.length-1; i >0 ; i--) {
            flag = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
                flag = true;
            }
            if (!flag) {
                break;
            }
        }
        Date endTime = new Date();
        System.out.println("array = " + Arrays.toString(array)+ "执行的时间差为" + (endTime.getTime()-StartTime.getTime()));
    }

}
