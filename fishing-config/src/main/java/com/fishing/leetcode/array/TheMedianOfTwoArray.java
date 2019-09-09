package com.fishing.leetcode.array;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @program: fishing
 * @description: get the median from two sorted arrays
 * @author: Tony.Wang
 * @create: 2019/8/9 10:23
 **/
public class TheMedianOfTwoArray {


    public static double findMedianFromSortedArrays(int[] nums1, int[] nums2) {
        /**
         * etc nums1[] = {1,3,4,6,8} nums2[] = {2,3,5,7,8,10}
         * first:participation arrays into small array
         * second : make sure the array's are sorted
         * find the max element of the left part and the min element of the right part
         * get the average of the two number
         */
        int m = nums1.length;
        int n = nums2.length;
        // to ensure m<=n
        if (m > n) {
            int[] tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
            int temp = m;
            m = n;
            n = temp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && nums2[j - 1] > nums1[i]) {
                // i is too small
                iMin = i + 1;
            } else if (i > iMin && nums1[i - 1] > nums2[j]) {
                // i is too big
                iMax = i - 1;
                // i is perfect
            } else {
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxLeft = nums1[i - 1];
                } else {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }
                int minRight = 0;
                if (i == m) {
                    minRight = nums2[j];
                } else if (j == n) {
                    minRight = nums1[i];
                } else {
                    minRight = Math.min(nums2[j], nums1[i]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;

    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,4,6,8};
        int[] nums2 = {2,3,5,7,8,10};
        double a = findMedianFromSortedArrays(nums1,nums2);
        System.out.println(a);
    }

}
