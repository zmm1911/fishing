package com.fishing.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: fishing
 * @author: Tony.Wang
 * @create: 2019/9/6 9:48
 **/
public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> sum = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3; i++) {
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            // when the smallest 4 numbers sum is bigger than the target ,there is no answer then just break.
            if(nums[i]+ nums[i+1] + nums[i+2]+nums[i+3] > target){
                break;
            }
            if(nums[i] + nums[nums.length -3] + nums[nums.length -2] + nums[nums.length -1] < target){
                continue;
            }
            for (int j = i+1; j < nums.length-2; j++) {
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                if(nums[i]+nums[j]+nums[j+1]+nums[j+2] > target){
                    break;
                }
                if(nums[i] + nums[j] + nums[nums.length -2] + nums[nums.length -1] < target){
                    continue;
                }
                int l = j+1,r = nums.length -1;
                while (l < r){
                    if(nums[i] + nums[j] + nums[l] + nums[r] > target){
                        while (l<r&&nums[r]==nums[r-1]){
                            r--;
                        }
                        r--;
                    }else if(nums[i] + nums[j] + nums[l] + nums[r] < target){
                        while (l<r&&nums[l]==nums[l+1]){
                            l++;
                        }
                        l++;
                    } else {
                        sum.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        while (l<r&&nums[r]==nums[r-1]){
                            r--;
                        }
                        while (l<r&&nums[l]==nums[l+1]){
                            l++;
                        }
                        l++;
                        r--;
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        int target = 0;
        System.out.println(fourSum(nums,target));
    }
}
