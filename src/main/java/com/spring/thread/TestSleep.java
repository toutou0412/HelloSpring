package com.spring.thread;

/**
 * @author pengdayi
 * @ClassName: TestSleep
 * @Description:
 * @date 2023/5/21 上午12:32
 */
public class TestSleep implements Runnable{
    private int ticketNums = 10;

    @Override
    public void run() {
        while (ticketNums > 0) {
            //模拟延时
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
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
