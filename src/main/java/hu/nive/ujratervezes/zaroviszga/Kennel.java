package hu.nive.ujratervezes.zaroviszga;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();

    public List<Dog> getDogs() {
        return dogs;
    }

    public void addDog(Dog dog)
    {
        this.dogs.add(dog);
    }

    public void feedAll()
    {
        for (Dog dog : dogs)
        {
            dog.feed();
        }
    }

    public Dog findByName(String name)
    {
        Dog foundDog = null;

        for (Dog dog : dogs)
        {
            if (dog.getName().equals(name))
            {
                foundDog = dog;
            }
        }
        if (foundDog == null){
            throw new IllegalArgumentException("Dog not Found");
        }
        else {
            return foundDog;
        }
    }

    public void playWith(String name, int hours)
    {
        Dog foundDog = null;

        for (Dog dog : dogs)
        {
            if (dog.getName().equals(name))
            {
                foundDog = dog;
            }
        }
        if (foundDog == null){
            throw new IllegalArgumentException("Dog not Found");
        }
        else {
            foundDog.play(hours);
        }
    }

    public List<String> getHappyDogNames(int minHappiness)
    {
        List<String> happyDogs = new ArrayList<>();

        for (Dog dog : dogs)
        {
            if (dog.getHappiness() > minHappiness)
            {
                happyDogs.add(dog.getName());
            }
        }
        return happyDogs;
    }

}
