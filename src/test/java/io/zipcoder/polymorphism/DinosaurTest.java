package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;

public class DinosaurTest extends TestCase {

    public void testSpeak() {
        Dinosaur dinosaur =new Dinosaur(null,null,null);
        dinosaur.speak();
        Assert.assertEquals("Bark!",dinosaur.speak());

    }
}
