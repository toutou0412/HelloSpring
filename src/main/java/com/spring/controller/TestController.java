package com.spring.controller;

import com.spring.vo.Admin;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author pengdayi
 * @ClassName: TestController
 * @Description:
 * @date 2023/5/9 上午12:31
 */
public class TestController {
    public static void main(String[] args) {
        //读取spring配置文件,并对文件中配置的对象进行创建
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Admin admin = app.getBean("admin", Admin.class);
        System.out.println(admin);

    }
}
