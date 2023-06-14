package com.spring.thread;

/**
 * @author pengdayi
 * @ClassName: TestThread
 * @Description:实现Runnable接口
 * @date 2023/5/15 下午1:54
 */
public class TestThread3 implements Runnable {

//    public static void main(String[] args) {
//        //创建Runnable接口的实现类对象
//        TestThread3 testThread3 = new TestThread3();
//        new Thread(testThread3).start();
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("我在学习多线程--------" + i);
//        }
//    }
    public static void main(String[] args) {
        new Thread(() -> System.out.println("123332432")).start();
    }

    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码---------" + i);
        }
    }
}
