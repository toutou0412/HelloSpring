package com.spring.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author pengdayi
 * @ClassName: TestThread2
 * @Description:练习Thread，实现多线程下载图片
 * @date 2023/5/20 下午2:33
 */
public class TestThread2 extends Thread {

    private String url;
    private String name;

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.download(url, name);
        System.out.println("下载了文件名为：" + name);
    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("https://t12.baidu.com/it/u=3060685730,1454052042&fm=58&app=83&f=JPEG?w=270&h=385", "1.jpg");
        TestThread2 t2 = new TestThread2("https://t12.baidu.com/it/u=3060685730,1454052042&fm=58&app=83&f=JPEG?w=270&h=385", "2.jpg");
        TestThread2 t3 = new TestThread2("https://t12.baidu.com/it/u=3060685730,1454052042&fm=58&app=83&f=JPEG?w=270&h=385", "3.jpg");

        t1.start();
        t2.start();
        t3.start();

    }
}

//下载器
class WebDownloader {
    //下载方法
    public void download(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，download方法出现异常");
        }
    }
}
