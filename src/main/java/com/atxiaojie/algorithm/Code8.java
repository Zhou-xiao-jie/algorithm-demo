package com.atxiaojie.algorithm;

/**
 * @ClassName: Code8
 * @Description: 题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
 * @author: zhouxiaojie
 * @date: 2022/1/19 15:30
 * @Version: V1.0.0
 */
public class Code8 {
    public static void main(String[] args) {
        System.out.println(total(1));
    }
    public static int total(int day){
        if(day == 10){
            return 1;
        } else{
            return (total(day+1)+1)*2;
        }
    }
}
