package com.mark.algorithm.sort;

import com.mark.algorithm.utils.RandomArray;

/**
 * @Author: Sunwj@sqbj.com
 * @Date: 2020/1/15 11:32 上午
 * 主的排序调用方法
 */
public class MainSort {

    public static void main(String[] args) {

        int[] array = RandomArray.gennerateArray(1000,2000);
        //冒泡排序--正常情况
//        BubbleSort.bubbleSort(array);
        //更优冒泡排序
        BubbleSort.betterBubbleSort(array);

        //简单选择排序
//        SimpleSelectionSort.simpleSelectionSort(array);

        //插入排序
//        StraightInsertionSort.insertionSort(array);

        //二分法插入排序
//        BinaryInsertSort.binaryInsertSort(array);
    }
}
