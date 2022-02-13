package com.atxiaojie.algorithm;

/**
 * @ClassName: Code4
 * @Description: 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * @author: zhouxiaojie
 * @date: 2022/1/19 14:27
 * @Version: V1.0.0
 */
public class Code4 {
    public void fengjie(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+"*");
                fengjie(n/i);
            }
        }
        System.out.print(n);
        System.exit(0);///不能少这句，否则结果会出错
    }
    public static void main(String[] args){
        String str="";
        Code4 c=new Code4();
        str=javax.swing.JOptionPane.showInputDialog("请输入N的值（输入exit退出）：");
        int N;
        N=0;
        try{
            N=Integer.parseInt(str);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
        System.out.print(N+"分解质因数："+N+"=");
        c.fengjie(N);
    }
}
