
//30)	Write a Java program to input any 3 digit number and check that number is Armstrong
// or not ( e.g. 153 = 1^3 + 5^3 + 3^3 = 153 ) (some Armstrong numbers are 153,370,371,407)

import java.util.Scanner;

public class Armstrongx
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        short number   = sc.nextShort();
        short temp = number;
        byte digit  = 0;
        short result  = 0;

        while(number!=0)
        {
            digit = (byte)(number%10);
            result += (digit*digit*digit);
            number = (short)(number/10);
        }

        if(result  == temp)
        {
            System.out.println("Number is ArmStrong number");
        }
        else
        {
            System.out.println("Number is not Armstrong number");
        }
    }
}
