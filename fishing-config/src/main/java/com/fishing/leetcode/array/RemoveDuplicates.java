package com.fishing.leetcode.array;

/**
 * @program: fishing
 * @author: Tony.Wang
 * @create: 2019/9/6 13:05
 **/
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length ; j++) {
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,2,3,3,3,4,4,5};
        System.out.println(removeDuplicates(nums));
    }
}
