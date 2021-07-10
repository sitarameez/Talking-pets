package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class Pet {
    String name;
    Integer age;
    String breed;
    ArrayList<Pet> pets= new ArrayList<Pet>();

    public Pet(String name,Integer age,String breed){
        this.name=name;
        this.age=age;
        this.breed=breed;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }
    public void removePet(Pet pet){
        pets.remove(pet);
    }

    public String speak(){
        return "Brrr!";
    }
}
