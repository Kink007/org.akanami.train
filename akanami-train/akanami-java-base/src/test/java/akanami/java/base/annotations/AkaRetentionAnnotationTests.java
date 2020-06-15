package akanami.java.base.annotations;


import akanami.java.base.annotations.mock.retention.ClassAnnotationMocker;
import akanami.java.base.annotations.mock.retention.RuntimeAnnotationMocker;
import akanami.java.base.annotations.mock.retention.SourceAnnotationMocker;
import akanami.java.base.annotations.retention.AkaClassAnnotation;
import org.junit.Assert;
import org.junit.Test;

public class AkaRetentionAnnotationTests {

    @Test
    public void getDiffRetentionAnnotation() {
        Class<ClassAnnotationMocker> classMocker = ClassAnnotationMocker.class;
        Class<RuntimeAnnotationMocker> runtimeMocker = RuntimeAnnotationMocker.class;
        Class<SourceAnnotationMocker> sourceMocker = SourceAnnotationMocker.class;

    }
}
