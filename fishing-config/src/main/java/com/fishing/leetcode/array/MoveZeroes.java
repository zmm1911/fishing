package com.fishing.leetcode.array;

/**
 * @program: fishing
 * @author: Tony.Wang
 * @create: 2019/9/12 16:01
 **/
public class MoveZeroes {
    public static void moveZeroes(int[] nums){
        int count=0;
        for (int num : nums){
            if(num != 0){
                nums[count++] = num;
            }
        }
        while (count < nums.length){
            nums[count++] = 0;
        }

    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12,4,0,3};
        moveZeroes(nums);
    }
}
