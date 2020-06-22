package org.akanami;

import org.akanami.service.StarterService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StaterCallerApplicationTest {
    @Autowired
    @Qualifier("demo")
    private StarterService starterService;

    @Test
    public void getStarterService() {
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(StaterCallerApplication.class);
//        StarterService bean = applicationContext.getBean(StarterService.class);

        Assert.assertNotNull(starterService);
        Assert.assertEquals("testcode", starterService.getCode());
        Assert.assertEquals("testname", starterService.getName());
    }
}