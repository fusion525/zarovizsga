package hu.nive.ujratervezes.zaroviszga;

public class Husky extends Dog{

    public Husky(String name) {
        super(name);
    }

    public void feed()
    {
        super.happiness += 4;
    }

    public void play(int hours)
    {
        super.happiness += hours * 3;
    }

}
