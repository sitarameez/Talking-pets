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
//    @Test
//    public void testRemoveCat() {
//        CatHouse catHouse = new CatHouse();
//        Integer id = 1;
//        Cat cat =new Cat("cora",null,id);
//        catHouse.add(cat);
//        catHouse.remove(cat);
//        // catHouse.remove(id);
//        Assert.assertEquals(null,catHouse.getCatById(id));
    public void testRemovePet() {
        Pet pet =new Pet();
        Integer expected = 2;
        Dog dog = new Dog(null,null,null);
        Dinosaur dino = new Dinosaur("bumpy",1,"trico");
        Cat cat = new Cat("marble",5,"fat");
        pet.addPet(dog);
        pet.addPet(dino);
        pet.addPet(cat);
        pet.removePet(dog);
        Assert.assertEquals(expected,pet.count());
    }

    public void testSpeak() {
    }
}