package com.atxiaojie.algorithm;

import java.util.Scanner;

/**
 * @ClassName: Code3
 * @Description: 题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，
 * 因为153=1的三次方＋5的三次方＋3的三次方。
 * @author: zhouxiaojie
 * @date: 2022/1/19 14:04
 * @copyright: 杭州鸿泉物联网技术股份有限公司
 * @Version: V1.0.0
 */
public class Code3 {
    public static void main(String[] args) {

        for (int i = 100; i <= 999; i++) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;
            if(((a*a*a) + (b*b*b) + (c*c*c)) == i){
                System.out.println(i);
            }
        }
    }

}
