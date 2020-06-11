package org.akanami.jvm.train.initial;

/**
 * 使用 jclasslib 可以查看到
 * 静态代码块与静态变量会绑定到 clinit 方法中
 * 而且父类优先于子类加载
 * 因此这里的结果是 2
 */
public class InitialOrder03 {
    static class Father {
        public static int A = 1;

        static {
            A = 2;
        }
    }

    static class Son extends Father {
        public static int B = A;
    }

    public static void main(String[] args) {
        System.out.println(Son.B);
    }
}
