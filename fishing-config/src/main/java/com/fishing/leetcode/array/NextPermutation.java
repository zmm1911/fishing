package com.fishing.leetcode.array;

/**
 * @program: fishing
 * @author: Tony.Wang
 * @create: 2019/9/10 16:37
 **/
public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int i=nums.length -2;
        while (i>=0&&nums[i+1] <= nums[i]){
            i--;
        }
        if (i>= 0){
            int j = nums.length -1;
            while (j>=0&&nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
        String a ="";
        for (int j = 0; j < nums.length; j++) {
            a = a + String.valueOf(nums[j]) + ",";
        }

        System.out.println(a);

    }

    private static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int[] nums,int start){
        int i = start,j = nums.length - 1;
        while (start < j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,4,7,5,3,2};
        nextPermutation(nums);
    }
}
