package org.akanami.jvm.train.classloader;

/**
 * 获取Bootstrap加载器 是获取不到的
 */
public class ClassLoaderTest {

    public static void main(String[] args) {

        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取其上层，扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);

        //获取其上层，获取Bootstrap加载器
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);   //null

        //对于用户自定义类来说的加载器
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        //String类加载器
        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println(stringClassLoader);  //null
    }
}
