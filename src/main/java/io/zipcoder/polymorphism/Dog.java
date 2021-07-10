package io.zipcoder.polymorphism;

public class Dog extends Pet{

    public Dog(String name,Integer age,String breed){
        super(name,age,breed);
    }

    @Override
    public String speak(){
        return "Bark!";
    }
}
