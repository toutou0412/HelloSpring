package com.spring.lambda;

import org.springframework.util.StringUtils;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pengdayi
 * @ClassName: ListLambda
 * @Description:
 * @date 2023/5/21 上午12:02
 */
public class ListLambda {

    public static void main(String[] args) {
        User user1 = new User("小明", 18);
        User user2 = new User("小红", 19);
        User user3 = new User("小王", 19);
        User user4 = new User("", 16);

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        list.removeIf(user -> StringUtils.isEmpty(user.getName()));

        list.forEach(user -> {
            System.out.println("name:" + user.getName() + ",年龄：" + user.getAge());
        });



    }

}

class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}