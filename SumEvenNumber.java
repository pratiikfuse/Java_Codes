//Write a Java program to calculate the sum of all even numbers up to given n number.

import java.util.Scanner;

public class SumEvenNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        short number = sc.nextShort();

        short i = 0;
        short sum = 0;


        for(i = 0;i<=number;i++)
        {
            if(i%2 == 0)
            {
                sum += i;
            }
        }

        System.out.println("Sum of all even number upto "+number+" are sum "+sum);


    }
}
