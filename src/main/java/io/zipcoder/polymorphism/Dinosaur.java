package io.zipcoder.polymorphism;

public class Dinosaur extends Pet{
    public Dinosaur(String name,Integer age,String breed){
        super(name,age,breed);
    }

    @Override
    public String speak(){
        return "Rawr!";
    }

}
