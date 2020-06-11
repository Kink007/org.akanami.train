package org.akanami.jvm.train.initial;

/**
 * 1.初始化阶段就是执行类的构造器方法<clinit>()的过程
 * 2.此方法不需要定义，是javac编译器自动收集类中的所有类变量的赋值动作和静态代码块中的语句合并而来
 * <clinit>()不同于类的构造器。(关联:构造器是虚拟机视角下的<init>())
 * 3.若该类具有父类，JVM会保证子类的<clinit>()执行前，父类的<clinit>()已经执行完毕
 * 4.虚拟机必须保证一个类的<clinit>()方法在多线程下被同步加锁
 */
//public class InitialOrder {
//    public static int num = 1;
//
//    static {
//        num = 2;
//        number = 20;
//
//        //System.out.println(number); //非法的前向引用
//    }
//
//    public static int number = 10;
//
//    public static void main(String[] args) {
//        System.out.println(InitialOrder.num);
//        System.out.println(InitialOrder.number);
//    }
//}

public class InitialOrder {
    public static InitialOrder order = new InitialOrder();

    public InitialOrder() {
        System.out.println("constructor");
    }



    static {
        System.out.println("static");
    }

    public static void main(String[] args) {
        new InitialOrder().getName();
    }

    public void getName() {
        System.out.println("getName Method");
    }

    {
        System.out.println("constructor block");
    }
}
