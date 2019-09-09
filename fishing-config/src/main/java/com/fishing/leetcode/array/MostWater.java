package com.fishing.leetcode.array;

/**
 * @program: fishing
 * @author: Tony.Wang
 * @create: 2019/9/4 14:49
 **/
public class MostWater {
    public static int maxArea(int[] height) {
        int max = 0;
        for(int i = 0;i<height.length;i++){
            for (int j = i+1; j < height.length; j++) {
                max = Math.max(max,Math.min(height[i],height[j])*(j -i));
            }
        }
        return max;
    }

    public static int maxArea1(int[] height){
        int max =0,l = 0,r = height.length - 1;
        while (l < r){
            max = Math.max(max,Math.min(height[l],height[r])*(r - l));

            if(max == 116){
                System.out.println(height[l] +" and "+ height[r]);
            }
            if(height[l] < height[r]){
                l++;
            } else {
                r--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,3,6,7,9,10,30,2,15,8,29};
        System.out.println(maxArea1(height));
    }

}
