package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;

public class PetTest extends TestCase {

    public void testAddPet() {
        Pet pet =new Pet();
        String expected ="karadi";
        Dog dog = new Dog(expected,null,"lab");
        pet.addPet(dog);
        Assert.assertEquals(expected,dog.getName());

    }

    public void testRemovePet() {

    }

    public void testSpeak() {
    }
}