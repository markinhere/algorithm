package com.mark.algorithm.sort;

import java.util.Arrays;

/**
 * @Author: Sunwj@sqbj.com
 * @Date: 2020/1/15 11:32 上午
 * 主的排序调用方法
 */
public class MainSort {

    public static void main(String[] args) {

        int[] array = {2,4,1,6,8,3,5,0,9,11,23,19,21,34,54,12,55,77,32};
        //冒泡排序--正常情况
//        BubbleSort.bubbleSort(array);
        //更优冒泡排序
//        BubbleSort.betterBubbleSort(array);

        //简单选择排序
//        SimpleSelectionSort.simpleSelectionSort(array);

        //插入排序
//        StraightInsertionSort.insertionSort(array);

        //二分法插入排序
        BinaryInsertSort.binaryInsertSort(array);
    }
}
