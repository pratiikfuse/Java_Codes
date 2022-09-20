//Write a Java program to print Fibonacci series up to given n terms.

import java.util.Scanner;
public class Fibonaccix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        short num  = sc.nextShort();

        short first = 0;
        short second  = 1;
        short beforeFirst  = 0;

        short i = 0;
        System.out.println("fibonacci series up to "+num+" terms :");
        System.out.println(0);
        for(i=0;i<num;i++)
        {


            second = (short)(beforeFirst+second);
            System.out.println(second);
            beforeFirst = first;
            first  = second;

        }
    }
}
