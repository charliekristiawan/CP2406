/**
 * Created by jc346395 on 11/12/2016.
 */
public class TwelveInts {
    public static void main(String[] args)
    {
        int numbers[] = {6,8,4,5,3,6,15,14,18,11,2,21};
        for( int a : numbers)
        {
            System.out.print(a + " ");
        }
        System.out.println();
        for(int b = numbers.length-1; b>=0; b--)
        {
            System.out.print(numbers[b]+" ");
        }
    }
}