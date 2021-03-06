package com.mark.algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Sunwj@sqbj.com
 * @Date: 2020/1/16 1:27 下午
 *
 * 两数之和
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum {


    public static void main(String[] args) {
        
        int[] nums = new int[]{2, 7, 11, 15,1,6,5,8,3};

        int target = 9;

        twoSum(nums,target);

    }

    /**
     * 先使用最暴力的方法进行代码完成
     * 这里的思路就是先循环这个数组，分别拿出来数组的每一项和它后边的依次进行+运算，验证是否=目标值
     *
     * 时间复杂度 O(n²）
     * 空间负责度 O(1)
     * @param nums
     * @param target
     * @return
     */
    private static void twoSum(int[] nums, int target) {

        if (nums.length>0) {
            
            for (int i = 0; i < nums.length; i++) {
                
                int startNum = nums[i];

                for (int j = i+1; j < nums.length; j++) {
                    int endNum = nums[j];

                    if (target == (startNum+endNum)) {
                        System.out.println("startNum = " + startNum + ", endNum = " + endNum);
                    }
                }
            }
        }
    }


    /**
     * 更优的解法1 -- 兩邊哈希表
     * 思路：
     * @param nums
     * @param target
     */
    private static void betterTwoSum(int[] nums, int target) {

    }

}
