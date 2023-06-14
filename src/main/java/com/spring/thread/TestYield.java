package com.spring.thread;

/**
 * @author pengdayi
 * @ClassName: TestYield
 * @Description:测试线程礼让 礼让不一定成功，看cpu心情
 * @date 2023/5/21 下午11:43
 */
public class TestYield {
    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield, "a").start();
        new Thread(myYield, "b").start();
    }
}

class MyYield implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程开始执行");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "线程结束执行");
    }
}