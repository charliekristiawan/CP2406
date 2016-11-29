/**
 * Created by jc346395 on 22/11/2016.
 */
import javax.swing.JOptionPane;
public class InchesToFeetInteractive {
    public static void main(String[] args)
    {
        String input;
        int inches;
        input = JOptionPane.showInputDialog(null,"Enter the inches to convert", "Convert", JOptionPane.INFORMATION_MESSAGE);;
        inches = Integer.parseInt(input);
        int feet = convertInchesToFeet(inches);
        int remainingInches = remainderAfterConverting(inches);
        JOptionPane.showMessageDialog(null,inches + " inches is " + feet + " feet and " + remainingInches + " inches.");
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