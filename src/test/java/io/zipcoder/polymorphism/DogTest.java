package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;

public class DogTest extends TestCase {

    public void testSpeak() {
        Dog dog =new Dog(null,null,null);
        dog.speak();
        Assert.assertEquals("Bark!",dog.speak());

    }
}
