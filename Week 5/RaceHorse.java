/**
 * Created by jc346395 on 13/12/2016.
 */
public class RaceHorse extends Horse {
    private int numberOfRaces;

    public RaceHorse(String name, String color, int birthyear, int numberOfRaces)
    {
        super(name, color, birthyear);
        this.numberOfRaces = numberOfRaces;
    }

    public int getNumberOfRaces() {
        return numberOfRaces;
    }

    public void setNumberOfRaces(int numberOfRaces) {
        this.numberOfRaces = numberOfRaces;
    }
}