package org.akanami.jvm.train.reflec;

public class Reflector01 {
    public static void main(String[] args) throws ClassNotFoundException {
        String name = "org.akanami.jvm.train.reflec.Reflector01";
        //String name = Reflector01.class.getName();
        System.out.println(name);
        Class<?> rClass = Class.forName(name);
        //rClass.equals(rClass);
        System.out.println(rClass);

        Runtime.getRuntime();
    }
}
