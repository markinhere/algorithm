package com.mark.algorithm.utils;

/**
 * @Author: Sunwj@sqbj.com
 * @Date: 2020/1/16 11:24 上午
 * 随机生产一个一维数组
 */
public class RandomArray {

    public static int[]  gennerateArray(int len,int max){
        int[] arr=new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*max);
        }
        return arr;
    }
}
