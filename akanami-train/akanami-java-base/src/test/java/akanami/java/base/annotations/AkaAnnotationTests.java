package akanami.java.base.annotations;


import akanami.java.base.annotations.mock.ClassWithAkaAnnotation;
import org.junit.Assert;
import org.junit.Test;

public class AkaAnnotationTests {
    @Test
    public void getAkaAnnotationWithReflect() {
        Class<ClassWithAkaAnnotation> classWithAkaAnnotationClass = ClassWithAkaAnnotation.class;
        Class<AkaAnnotation> akaAnnotationClass = AkaAnnotation.class;
        AkaAnnotation annotation = classWithAkaAnnotationClass.getAnnotation(akaAnnotationClass);
        String name = annotation.name();

        Assert.assertEquals("hello", name);
    }
}
