/**
 * Created by jc346395 on 6/12/2016.
 */
public class CountByThrees {
    public static void main(String[] args)
    {
        int number;
        for(number=3; number<=300; number+=3)
        {
            if(number % 30 == 0)
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
