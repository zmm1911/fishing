package com.fishing.leetcode.array;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: fishing
 * @author: Tony.Wang
 * @create: 2019/9/12 16:20
 **/
public class MatrixReshape {
    public int[][] matrixReshapeUseQueue(int[][] nums,int r,int c){
        int[][] res = new int[r][c];
        if (nums.length == 0|| r * c !=nums.length * nums[0].length){
            return nums;
        }
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                queue.add(nums[i][j]);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = queue.remove();
            }
        }
        return res;
    }

    public int[][] matrixReshape(int[][] nums,int r,int c){
        int[][] res = new int[r][c];
        if (nums.length == 0|| r * c !=nums.length * nums[0].length){
            return nums;
        }
        int row = 0,col=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                res[row][col] =nums[i][j];
                col++;
                if(col == c){
                    row++;
                    col = 0;
                }
            }
        }

        return res;
    }

    public static int[][] matrixReshapeDive(int[][] nums,int r,int c){
        int[][] res = new int[r][c];
        if (nums.length == 0|| r * c !=nums.length * nums[0].length){
            return nums;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                res[count /c ][count % c] =nums[i][j];
                count++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},{5,6,7}};
        int r = 4,c=2;
        System.out.println(matrixReshapeDive(nums,r,c));
    }



}
