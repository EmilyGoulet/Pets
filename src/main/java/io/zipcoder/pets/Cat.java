package io.zipcoder.pets;

/**
 * Created by emilybutte on 9/26/16.
 */
public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "meow";
    }
}
