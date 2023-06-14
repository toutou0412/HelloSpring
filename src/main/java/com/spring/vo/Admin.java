package com.spring.vo;

/**
 * @author pengdayi
 * @ClassName: Admin
 * @Description:
 * @date 2023/5/9 上午12:29
 */
public class Admin {
    private int id;
    private String account;

    public Admin() {
        System.out.println("无参构造方法");
    }

    public Admin(int id, String account) {
        this.id = id;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", account='" + account + '\'' +
                '}';
    }
}