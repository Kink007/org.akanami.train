package akanami.java.base.enums;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ColorTest {

    @Test
    public void getIndex() {
        Color black = Color.BLACK;
        Assert.assertEquals(Integer.valueOf(0), black.getIndex());

        Color white = Color.WHITE;
        Assert.assertEquals(Integer.valueOf(1), white.getIndex());
    }

    @Test
    public void getName() {
        Color black = Color.BLACK;
        Assert.assertEquals("黑色", black.getName());

        Color white = Color.WHITE;
        Assert.assertEquals("白色", white.getName());
    }

    @Test
    public void s_getName() {
        Assert.assertEquals("黑色", Color.getName(0));
        Assert.assertEquals("白色", Color.getName(1));
    }
}