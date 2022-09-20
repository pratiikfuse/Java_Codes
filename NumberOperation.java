/*
Write a menu-driven program where choices are :
 1. given number is even or odd
 2. given number is positive or negative
 3. find maximum between given two numbers
 4. convert days into months and remaining days
 */

import java.util.Scanner;

public class NumberOperation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose from below which operation you want to perform");
        System.out.println(" 1. given number is even or odd\n" +
                " 2. given number is positive or negative\n" +
                " 3. find maximum between given two numbers\n" +
                " 4. convert days into months and remaining days");

        byte choice  = sc.nextByte();

        switch(choice)
        {
            case 1 :
                System.out.println("Enter number");
                System.out.println("Number is "+((sc.nextInt()%2 == 0)?"even":"odd"));
                break;

            case 2 :
                System.out.println("Enter number ");
                System.out.println("Number is "+((sc.nextInt()>=0)?"positive":"negative"));
                break;

            case 3 :
                System.out.println("Enter first number");
                short firstNumber  = sc.nextShort();
                System.out.println("Enter second number");
                short secondNumber  = sc.nextShort();
                System.out.println("Maximum number is "+((firstNumber>secondNumber)?firstNumber:secondNumber));
                break;

            case 4 :
                System.out.println("Enter number of days");
                short days  = sc.nextShort();
                System.out.println((days/30)+" Months "+days%30+" days");
                break;

            default:
                System.out.println("Choose correct option");
        }

    }
}
