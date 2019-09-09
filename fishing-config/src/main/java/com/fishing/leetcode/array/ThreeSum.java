package com.fishing.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: fishing
 * @author: Tony.Wang
 * @create: 2019/9/5 11:24
 **/
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if(i > 0 && nums[i-1]==nums[i]){
                continue;
            }
            int l = i+1,r = nums.length -1;

            while (l < r){
                if(nums[r] > -nums[l] - nums[i]){
                    while (l < r && nums[r-1]==nums[r]){
                        r--;
                    }
                    r --;
                } else if (nums[r] <-nums[l] - nums[i] ){
                    while (l < r && nums[l+1]==nums[l]){
                        l++;
                    }
                    l++;
                } else {
                    list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    r--;
                    l++;
                }
            }
        }

        return list;
    }

}
