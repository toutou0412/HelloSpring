package com.spring.thread;

/**
 * @author pengdayi
 * @ClassName: UnsafeBuyTicket
 * @Description:不安全的买票
 * @date 2023/5/22 上午1:11
 */
public class UnsafeBuyTicket {

    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket,"我").start();
        new Thread(buyTicket,"厉害的你").start();
        new Thread(buyTicket,"黄牛").start();

    }
}

class BuyTicket implements Runnable{
    private int ticketNums = 10;//票
    boolean flag = true;//外部停止方式

    @Override
    public void run() {
        while (flag) {
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void buy() throws InterruptedException {
        //判断是否有票
        if (ticketNums <= 0) {
            flag = false;
            return;
        }
        //模拟延时
        Thread.sleep(100);
        //买票
        System.out.println(Thread.currentThread().getName() + "拿到" + ticketNums-- + "票");
    }
}
