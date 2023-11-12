package JavaSamples;

import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        System.out.println("Please enter the number");
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println("Entered number is    " +s);

        if(s%2==0)
        {
            System.out.println("Entered number is even number");
        }
        else
            System.out.println("Entered number is odd number");

    }
}
