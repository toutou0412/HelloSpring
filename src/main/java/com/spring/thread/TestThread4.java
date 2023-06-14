package com.spring.thread;

/**
 * @author pengdayi
 * @ClassName: TestThread4
 * @Description:
 * @date 2023/5/20 下午3:22
 */
//多个线程操作一个对象
//买火车票的例子
public class TestThread4 implements Runnable {

    private int ticketNums = 10;

    @Override
    public void run() {
        while (ticketNums > 0) {
            //模拟延时
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->拿到了第" + ticketNums-- + "票");
        }
    }

    public static void main(String[] args) {
        TestThread4 testThread4 = new TestThread4();
        new Thread(testThread4, "小明").start();
        new Thread(testThread4, "老师").start();
        new Thread(testThread4, "黄牛").start();
    }
}
