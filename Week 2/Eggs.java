/**
 * Created by jc346395 on 29/11/2016.
 */
import javax.swing.JOptionPane;
public class Eggs {
    public static void main(String[] args)
    {
        String input;
        int eggs;
        input = JOptionPane.showInputDialog(null,"How many eggs do you want to buy?", "Orders", JOptionPane.INFORMATION_MESSAGE);
        eggs = Integer.parseInt(input);
        int eggsInDozen = dozenOfEggs(eggs);
        int remainingEggs = eggsLeft(eggs);
        JOptionPane.showMessageDialog(null,"You ordered " + eggs + " eggs. That's " + eggsInDozen + " dozen at $3.25 per dozen and " + remainingEggs + " loose eggs at 45 cents each for a total of $" + (eggsInDozen*3.25+remainingEggs*0.45));
    }
    public static int dozenOfEggs(int total)
    {
        int dozen = total/12;
        return dozen;
    }
    public static int eggsLeft(int total)
    {
        int leftEggs = total%12;
        return leftEggs;
    }
}
