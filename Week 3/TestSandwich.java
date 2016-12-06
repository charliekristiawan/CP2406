/**
 * Created by jc346395 on 3/12/2016.
 */
public class TestSandwich {
    public static void main(String[] args)
    {
        Sandwich Lielie = new Sandwich("Rye",70 , "Egg", 50);
        Sandwich Charliez = new Sandwich("Cocoa",200,"Ham",350);
        Sandwich Expert = new Sandwich("Powder",300, "Tuna", 600);
        System.out.println(Lielie.getBread().getBread());
        System.out.println(Lielie.getFilling().getFilling());
        System.out.println(Lielie.getTotalCalories());
        System.out.println(Charliez.getBread().getBread());
        System.out.println(Charliez.getFilling().getFilling());
        System.out.println(Charliez.getTotalCalories());
        System.out.println(Expert.getBread().getBread());
        System.out.println(Expert.getFilling().getFilling());
        System.out.println(Expert.getTotalCalories());

    }
}