package com.fishing.leetcode.array;

/**
 * @program: fishing
 * @author: Tony.Wang
 * @create: 2019/9/17 13:23
 **/
public class FindMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums){
        int count = 0,temp=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                count++;
                if(count > temp){
                    temp = count;
                }
            } else {
                count = 0;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
