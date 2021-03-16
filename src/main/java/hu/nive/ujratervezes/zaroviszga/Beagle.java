package hu.nive.ujratervezes.zaroviszga;

public class Beagle extends Dog {

    public Beagle(String name) {
        super(name);
    }

    public void feed()
    {
        super.happiness += 2;
    }

    public void play(int hours)
    {
        super.happiness += hours * 2;
    }
}
