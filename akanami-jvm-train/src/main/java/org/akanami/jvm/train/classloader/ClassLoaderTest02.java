package org.akanami.jvm.train.classloader;

import com.sun.net.ssl.internal.ssl.Provider;
import sun.security.ec.CurveDB;

import java.net.URL;

public class ClassLoaderTest02 {
    public static void main(String[] args) {
        System.out.println("=============启动类加载器================");

        //获取BootstrapClassLoader能够加载的api的路径
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for(URL url : urls) {
            System.out.println(url.toExternalForm());
        }

        //在 jsse.jar 包里面随便找一个类 获取 BootstrapClassLoader
        ClassLoader jsseClassLoader = Provider.class.getClassLoader();
        System.out.println(jsseClassLoader);

        System.out.println("====================扩展类加载器=================");
        String extDirs = System.getProperty("java.ext.dirs");
        for(String path : extDirs.split(";")) {
            System.out.println(path);
        }

        ClassLoader curveDBClassLoader = CurveDB.class.getClassLoader();
        System.out.println(curveDBClassLoader);
    }
}
