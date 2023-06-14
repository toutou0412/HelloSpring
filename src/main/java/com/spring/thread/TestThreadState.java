package com.spring.thread;

/**
 * @author pengdayi
 * @ClassName: TestThreadState
 * @Description:线程状态
 * @date 2023/5/22 上午12:02
 */
public class TestThreadState {

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
