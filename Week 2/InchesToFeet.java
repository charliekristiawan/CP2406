/**
 * Created by jc346395 on 22/11/2016.
 */
public class InchesToFeet {
    public static void main(String[] args)
    {
        int inches = 86;
        int feet = convertInchesToFeet(inches);
        int remainingInches = remainderAfterConverting(inches);
        System.out.println(inches + " inches is " + feet + " feet and " + remainingInches + " inches.");
    }
    public static int convertInchesToFeet(int inches)
    {
        int feetconversion = inches/12;
        return feetconversion;
    }
    public static int remainderAfterConverting(int inches)
    {
        int remainedInches = inches%12;
        return remainedInches;
    }
}