package com.spring.lambda;

//1.定义一个函数式接口
interface ILike {
    void lambda();
}

//2.实现类
class Like implements ILike {
    @Override
    public void lambda() {
        System.out.println("I like lambda");
    }
}


/**
 * @author pengdayi
 * @ClassName: TestLambda
 * @Description:推导lambda表达式
 * @date 2023/5/20 下午9:08
 */
public class TestLambda {

    //3.静态内部类
    static class Like2 implements ILike {
        @Override
        public void lambda() {
            System.out.println("I like lambda2");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like();
        like.lambda();

        like = new Like2();
        like.lambda();

        //4.局部内部类
        class Like3 implements ILike {
            @Override
            public void lambda() {
                System.out.println("I like lambda3");
            }
        }

        like = new Like3();
        like.lambda();

        //5.匿名内部类
        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("I like lambda4");
            }
        };
        like.lambda();

        //6.用lambda简化
        like = () -> {
            System.out.println("I like lambda5");
        };
        like.lambda();
    }
}
