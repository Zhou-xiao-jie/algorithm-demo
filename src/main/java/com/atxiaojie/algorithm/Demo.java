package com.atxiaojie.algorithm;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: Demo
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2022/1/20 19:45
 * @Version: V1.0.0
 */
public class Demo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        //带入一个银行办理业务的案例来模拟我们的AQS如何进行线程的管理和通知唤醒
        //3个线程模拟3个来银行网点，受理窗口办理业务的顾客
        //A 顾客就是第一个顾客，此时受理窗口没有任何人，A可以直接去办理
        new Thread(() -> {
            lock.lock();
            try{
                System.out.println("---------A thread come in");
                try {
                    TimeUnit.MINUTES.sleep(20L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }finally {
                lock.unlock();
            }
        },"A").start();

        //B 第二个顾客，第2个线程，由于受理业务的窗口只有一个（只能一个线程持有锁，此时B只能等待）
        //进入候客区
        new Thread(() -> {
            lock.lock();
            try{
                System.out.println("---------B thread come in");
            }finally {
                lock.unlock();
            }
        },"B").start();

        //C 第二个顾客，第3个线程，由于受理业务的窗口只有一个（只能一个线程持有锁，此时C也只能等待）
        //进入候客区
        new Thread(() -> {
            lock.lock();
            try{
                System.out.println("---------C thread come in");
            }finally {
                lock.unlock();
            }
        },"C").start();

    }
}
