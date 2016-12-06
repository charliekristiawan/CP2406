/**
 * Created by jc346395 on 3/12/2016.
 */
public class TestSandwichFilling {
    public static void main(String[] args)
    {
        SandwichFilling HelloSandwich = new SandwichFilling("Egg",50);
        SandwichFilling HahaSandwich = new SandwichFilling("Ham",350);
        SandwichFilling HiSandwich = new SandwichFilling("Tuna",600);
        System.out.println(HelloSandwich.getFilling());
        System.out.println(HelloSandwich.getCalories());
        System.out.println(HelloSandwich.getFilling());
        System.out.println(HelloSandwich.getCalories());
        System.out.println(HiSandwich.getFilling());
        System.out.println(HiSandwich.getCalories());

    }
}