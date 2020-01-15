package com.mark.algorithm.sort;

import java.util.Arrays;

/**
 * @Author: Sunwj@sqbj.com
 * @Date: 2020/1/15 10:22 上午
 * 二分插入排序
 */
public class BinaryInsertSort {

    static void binaryInsertSort(int[] arr){

        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];
            int low = 0, high = i - 1;
            int mid = -1;

            while (low <= high) {
                mid = low + (high - low) / 2;
                if (arr[mid] > temp) {
                    high = mid - 1;
                } else { // 元素相同时，也插入在后面的位置
                    low = mid + 1;
                }
            }

            for (int j = i - 1; j >= low; j--) {
                arr[j + 1] = arr[j];
            }
            arr[low] = temp;
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
