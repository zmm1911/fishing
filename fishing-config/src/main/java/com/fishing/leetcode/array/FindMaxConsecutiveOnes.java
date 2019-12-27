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

    static  int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;// 0000 0000 0000 1111   0000 0000
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= 1 << 30) ? 1 << 30 : n + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(java.util.UUID.randomUUID().toString().replaceAll("-",""));
    }
}
