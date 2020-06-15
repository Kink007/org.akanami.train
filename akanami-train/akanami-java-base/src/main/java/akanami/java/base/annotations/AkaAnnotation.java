package akanami.java.base.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)   //默认就是class   SOURCE 表示保存在.java文件中 编译后丢弃 .class文件不存在
                                    //                CLASS  表示保存在.class文件中  JVM不加载
                                    //                RUNTIME 表示JVM会加载至内存
public @interface AkaAnnotation {
    String name();
}
