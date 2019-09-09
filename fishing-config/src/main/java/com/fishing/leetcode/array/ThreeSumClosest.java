package com.fishing.leetcode.array;

import java.util.Arrays;

/**
 * @program: fishing
 * @author: Tony.Wang
 * @create: 2019/9/5 14:36
 **/
public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {

        // sort the array
        Arrays.sort(nums);
        // get the fist sum
        int tmp = nums[0] + nums[1] + nums[2];
        // 双指针循环：从第二个元素开始++，最后一个元素--
        for (int i = 0; i < nums.length; i++) {
            int l = i+1,end = nums.length-1;
            while (l < end){
                int sum = nums[i] + nums[l] + nums[end];
                if(Math.abs(sum - target) < Math.abs(tmp - target)){
                    tmp = sum;
                }
                if (sum > target){
                    end--;
                } else if(sum < target){
                    l++;
                }else {
                    return tmp;
                }
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,6,7,9,10,30,2,15,8,29};
        int target = 75;
        System.out.println(threeSumClosest(nums,target));
    }
}
