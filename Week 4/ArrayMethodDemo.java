/**
 * Created by jc346395 on 6/12/2016.
 */
import java.util.Scanner;
public class ArrayMethodDemo {
    public static void displayInt(int array[])
    {
        for(int a : array)
        {
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static void displayReverse(int array[])
    {
        for(int b = array.length-1; b>=0; b--)
        {
            System.out.print(array[b]+" ");
        }
        System.out.println();
    }
    public static void displaySum(int array[])
    {
        int sum = 0;
        for(int a : array)
        {
            sum += a;
        }
        System.out.print(sum);
        System.out.println();
    }
    public static void displayLessThan(int array[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int userEntry = input.nextInt();
        for(int a: array)
        {
            if(a<userEntry)
            {
                System.out.print(a+ " ");
            }
        }
        System.out.println();
    }
    public static void displayHigherThanAverage(int array[])
    {
        int sum = 0;
        for(int a : array)
        {
            sum += a;
        }
        int avg = sum/array.length;
        for(int a : array)
        {
            if(a>avg)
            {
                System.out.print(a+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        int numbers[] = {5,2,4,7,19,3,22,2,3,13};
        displayInt(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers);
        displayHigherThanAverage(numbers);
    }

}