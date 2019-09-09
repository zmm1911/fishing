package com.fishing.leetcode.array;

import java.util.Arrays;

/**
 * @program: fishing
 * @author: Tony.Wang
 * @create: 2019/9/6 15:52
 **/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
