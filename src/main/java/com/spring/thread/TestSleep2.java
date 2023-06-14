package com.spring.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author pengdayi
 * @ClassName: TestSleep2
 * @Description:模拟倒计时
 * @date 2023/5/21 上午12:35
 */
public class TestSleep2 {
    public static void main(String[] args) {
//        try {
//            tenDown();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //打印当前系统时间
        Date date = new Date(System.currentTimeMillis());
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
            date = new Date(System.currentTimeMillis());
        }

    }

    public static void tenDown() throws InterruptedException {
        int num = 10;
        while (true) {
            Thread.sleep(1000);
            System.out.println(num--);
            if (num == 0) {
                break;
            }
        }
    }
}
