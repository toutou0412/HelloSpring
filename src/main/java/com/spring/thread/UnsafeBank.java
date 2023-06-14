package com.spring.thread;

/**
 * @author pengdayi
 * @ClassName: UnsafeBank
 * @Description:不安全取钱
 * @date 2023/5/22 上午1:18
 */
public class UnsafeBank {

    public static void main(String[] args) {
//        Account account = new Account(100, "123");
//        Drawing boy = new Drawing(account, 50, "boy");
//        Drawing girl = new Drawing(account, 100, "girl");
//
//        boy.start();
//        girl.start();
//        String str = "a";
//        System.out.println();
    }
}

//账户
class Account{

    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

//银行：模拟取款
class Drawing extends Thread{

    private Account account;//账户
    private int drawingMoney;//取了多少钱
    private int balance;//余额

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    //取钱
    @Override
    public void run() {
        synchronized (account) {
            //判断有没有钱
            if (account.money - drawingMoney < 0) {
                System.out.println(Thread.currentThread().getName() + "余额不足");
                return;
            }

            //卡内余额 = 余额 - 取的钱
            account.money = account.money - drawingMoney;
            //你手里的钱
            balance = balance + drawingMoney;

            System.out.println(account.name + "余额为：" + account.money);
            System.out.println(Thread.currentThread().getName() + "手里的钱" + drawingMoney);
        }
    }
}
