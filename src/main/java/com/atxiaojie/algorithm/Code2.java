package com.atxiaojie.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Code2
 * @Description:  题目：判断101-200之间有多少个素数，并输出所有素数。
 * @author: zhouxiaojie
 * @date: 2022/1/19 13:38
 * @copyright: 杭州鸿泉物联网技术股份有限公司
 * @Version: V1.0.0
 */
public class Code2 {
    public static void main(String[] args) {
        int num = 0;
        List<Integer> suNum = new ArrayList<Integer>();
        for (int i = 101; i <= 200; i++) {
            if(iszhishu(i)==true){
                num++;
                suNum.add(i);
            }
        }
        System.out.println(num);
        System.out.println(suNum);
    }

    public static boolean iszhishu(int x)
    {
        for(int i=2;i<=x/2;i++){
            if (x % 2==0 ){
                return false;
            }
        }
        return true;
    }
}
