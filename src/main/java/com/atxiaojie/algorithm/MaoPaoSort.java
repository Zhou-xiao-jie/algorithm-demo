package com.atxiaojie.algorithm;

/**
 * @ClassName: maopaoSort
 * @Description: 冒泡排序算法
 * @author: zhouxiaojie
 * @date: 2022/1/21 19:24
 * @Version: V1.0.0
 */
public class MaoPaoSort {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {22,33,8,66,99,77,7};
        System.out.print("排序前：[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.println(arr[i]+"]");
            } else {
                System.out.print(arr[i]+",");
            }
        }
        sort1(arr);
        System.out.print("排序后：[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.println(arr[i]+"]");
            } else {
                System.out.print(arr[i]+",");
            }
        }
    }

    private static void sort1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
