package com.atxiaojie.algorithm;

/**
 * @ClassName: Test
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2022/1/21 15:14
 * @Version: V1.0.0
 */
public class Test extends Father{
    private String name = "test";
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.getName());
    }
}

class Father{
    private String name = "father";
    public String getName(){
        return name;
    }
}
