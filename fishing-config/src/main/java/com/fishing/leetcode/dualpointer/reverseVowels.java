package com.fishing.leetcode.dualpointer;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @program: fishing
 * @author: Tony.Wang
 * @create: 2020/1/5 15:06
 **/
public class reverseVowels {
    private final static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

    public static String reverseVowels(String s){
        if(s==null) {
            return null;
        }
        int i=0,j=s.length() -1;
        char[] result = new char[s.length()];
        while (i<=j){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if(!vowels.contains(ci)){
                result[i++] = ci;
            } else if(!vowels.contains(cj)){

                result[j--] = cj;
            } else {
                result[i++] = cj;
                result[j--] = ci;
            }
        }

        return  new String(result);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
