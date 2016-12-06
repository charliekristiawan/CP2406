/**
 * Created by jc346395 on 29/11/2016.
 */
public class TestBread {
    public static void main(String[] args)
    {
        Bread Chocolate = new Bread("Rye",70);
        Bread Plain = new Bread("Cocoa",200);
        Bread Croissant = new Bread("Powder",300);
        System.out.println(Chocolate.getBread());
        System.out.println(Chocolate.getCalories());
        System.out.println(Chocolate.getMOTTO());
        System.out.println(Plain.getBread());
        System.out.println(Plain.getCalories());
        System.out.println(Plain.getMOTTO());
        System.out.println(Croissant.getBread());
        System.out.println(Croissant.getCalories());
        System.out.println(Croissant.getMOTTO());
    }
}