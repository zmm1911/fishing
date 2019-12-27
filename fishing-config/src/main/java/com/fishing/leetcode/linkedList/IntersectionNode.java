package com.fishing.leetcode.linkedList;


import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @program: fishing
 * @author: Tony.Wang
 * @create: 2019/9/24 18:00
 **/
public class IntersectionNode {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }


    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        ListNode l1 = headA,l2 = headB;
        while (l1 != l2){
            l1 = (l1==null)?headB:l1.next;
            l2 = (l2==null)?headA:l2.next;
        }
        return l1;
    }

    public static void main(String[] args) {

        String filename = "";
        String urlString= "";
        String temp = "http://krk-course.oss-cn-beijing.aliyuncs.com/pdf/1-15/2019-02-18/7962c76d864046b3a93e9ec17c23e990/";
        int size = 60;


        try {
            for (int i =1;i <size;i++){
                filename = i+".jpg";
                urlString= temp+filename;
                saveUrl(filename,urlString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void saveUrl(final String filename, final String urlString)
            throws MalformedURLException, IOException {
        BufferedInputStream in = null;
        FileOutputStream fout = null;
        try {
            in = new BufferedInputStream(new URL(urlString).openStream());
            fout = new FileOutputStream(filename);

            final byte data[] = new byte[1024];
            int count;
            while ((count = in.read(data, 0, 1024)) != -1) {
                fout.write(data, 0, count);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (fout != null) {
                fout.close();
            }
        }
    }
}
