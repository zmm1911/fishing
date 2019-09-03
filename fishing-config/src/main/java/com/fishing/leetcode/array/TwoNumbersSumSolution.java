package com.fishing.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: fishing
 * @description: calculate two nummbers to get these sum
 * @author: Tony.Wang
 * @create: 2019/8/8 15:19
 **/
public class TwoNumbersSumSolution {
    public int[] twoSum(int[] nums, int target) {
        for (int i =0;i<nums.length;i++){
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] == target - nums[i]){
                    return new int[]{i,j} ;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSumHashTwice(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int j = 0; j < nums.length; j++) {
            int temp = target - nums[j];
            if (map.containsKey(temp) && map.get(temp) !=j ) {
                return new int[] {j,map.get(temp)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSumHashOnce(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                return new int[] {map.get(temp),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
