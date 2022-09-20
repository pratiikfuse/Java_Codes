//Write a java program to swap given two numbers

import java.util.Scanner;

public class Swap
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int numOne = sc.nextShort();

        System.out.println("Enter second number : ");
        int numTwo = sc.nextShort();


        System.out.println("Value of numOne : "+numOne+" value of numTwo : "+numTwo);

        int temp = 0;
        temp = numOne;
        numOne = numTwo;
        numTwo = temp;


       /*
        numOne = numOne + numTwo;
        numTwo = numOne - numTwo;
        numOne = numOne - numTwo;

        */


        System.out.println("Value of numOne : "+numOne+" value of numTwo : "+numTwo);

        sc.close();

    }
}
