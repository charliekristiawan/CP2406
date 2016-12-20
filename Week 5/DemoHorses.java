/**
 * Created by jc346395 on 13/12/2016.
 */
public class DemoHorses {
    public static void main(String[] args)
    {
        Horse horse1 = new Horse("Hendry","Brown",1999);
        System.out.println(horse1.getName());
        System.out.println(horse1.getColor());
        System.out.println(horse1.getBirthyear());
        RaceHorse horse2 = new RaceHorse("Alpret", "Blue", 1997, 5);
        System.out.println(horse2.getName());
        System.out.println(horse2.getColor());
        System.out.println(horse2.getBirthyear());
        System.out.println(horse2.getNumberOfRaces());
    }
}