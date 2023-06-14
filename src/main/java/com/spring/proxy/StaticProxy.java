package com.spring.proxy;

interface Marry {
    void HappyMarry();
}

/**
 * @author pengdayi
 * @ClassName: StaticProxy
 * @Description:静态代理模式 真实对象和代理对象都要实现同一个接口
 * 代理对象要代理真实角色
 * 好处：代理对象做很多真实对象做不了的事
 * 真实对象专注做自己的事
 * @date 2023/5/20 下午8:46
 */
public class StaticProxy {

    public static void main(String[] args) {
        You you = new You();
        WeddingCompany weddingCompany = new WeddingCompany(you);
        weddingCompany.HappyMarry();
    }
}

//真实对象
class You implements Marry {
    @Override
    public void HappyMarry() {
        System.out.println("你要结婚了");
    }
}

//代理角色，帮助你结婚
class WeddingCompany implements Marry {

    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();//这就是真实对象
        after();
    }

    private void before() {
        System.out.println("结婚之前布置");
    }

    private void after() {
        System.out.println("结婚之前收钱");
    }
}

