package com.fishing.leetcode.dualpointer;

/**
 * @program: fishing
 * @author: Tony.Wang
 * @create: 2019/11/12 15:10
 **/
public class judgeSquareSum {
    public static boolean judgeSquareSum(int target){
        if(target < 0) {
            return false;
        }
        int i = 0,j = (int)Math.sqrt(target);
        while (i<=j){
            int temp = i*i + j*j;
            if(temp == target){
                System.out.println(i+"---"+j);
                return true;
            } else if(temp > target){
                j--;
            } else {
                i++;
            }
        }
        System.out.println(i+"---"+j);
        return false;
    }

    public static void main(String args[]){
        System.out.println(judgeSquareSum(2));
    }
}
