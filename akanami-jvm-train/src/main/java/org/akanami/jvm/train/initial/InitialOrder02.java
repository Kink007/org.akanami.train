package org.akanami.jvm.train.initial;

public class InitialOrder02 {
    public static InitialOrder02 instance1 = new InitialOrder02();
    public static InitialOrder02 instance2 = new InitialOrder02();

    public InitialOrder02() {
        System.out.println("构造函数");
    }

    {
        System.out.println("构造块");
    }
    static {
        System.out.println("静态块");
    }

    public static void print() {
        System.out.println("打印");
    }

    public static void main(String[] args) {
        //InitialOrder02 instance = new InitialOrder02();
        InitialOrder02.print();
    }
}
