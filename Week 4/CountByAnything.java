/**
 * Created by jc346395 on 6/12/2016.
 */
import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args)
    {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int userEntry = input.nextInt();
        for(number=userEntry; number<=userEntry*100; number+=userEntry)
        {
            if(number % (userEntry*10) == 0)
            {
                System.out.println(number);
            }
            else
            {
                System.out.print(number + ", ");
            }
        }
    }
}