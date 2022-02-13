package com.atxiaojie.algorithm;

/**
 * @ClassName: Code6
 * @Description: 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在   第10次落地时，共经过多少米？第10次反弹多高？
 * @author: zhouxiaojie
 * @date: 2022/1/19 14:57
 * @Version: V1.0.0
 */
public class Code6 {
    /*public static void main(String[] args) {
        int sum = 0;
        int t = 100;
        for (int i = 0; i < 10; i++) {
            sum += t;
            t = t / 2;
        }
        System.out.println(sum);
        System.out.println(t);
    }*/
    public static void main(String[] args)
    {
        double s=0;
        double t=100;
        for(int i=1;i<=10;i++)
        {
            s+=t;
            t=t/2;
        }
        System.out.println(s);
        System.out.println(t);

    }
}
