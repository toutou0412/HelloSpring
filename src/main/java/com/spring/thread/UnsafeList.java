package com.spring.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengdayi
 * @ClassName: UnsafeList
 * @Description:线程不安全的集合
 * @date 2023/5/22 下午3:19
 */
public class UnsafeList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            new Thread( () -> {
                list.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
