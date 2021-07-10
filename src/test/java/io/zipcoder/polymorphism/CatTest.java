package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;

public class CatTest extends TestCase {

    public void testSpeak() {
        Cat cat =new Cat(null,null,null);
        cat.speak();
        Assert.assertEquals("Meow!",cat.speak());

    }
}
