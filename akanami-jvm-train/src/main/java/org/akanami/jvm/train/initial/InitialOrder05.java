package org.akanami.jvm.train.initial;

public class InitialOrder05 {

    static {
        System.out.println("static constructor");
    }

    {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("main");
    }
}
