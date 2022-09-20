//Write a Java program to calculate x to power y (without using inbuilt function). Take X and  Y from user

import java.util.Scanner;

public class CalculatePower
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base");
        short x  = sc.nextShort();
        System.out.println("Enter power");
        short y = sc.nextShort();

        short i = 0;

        int power  = 1;

        for(i = 1;i<=y;i++)
        {
            power =  power*x;
        }

        System.out.println(x+" raised to "+y+" is "+power);
    }
}
