//Write a Java program to print factors of given number.

import java.util.Scanner;
public class Factorx
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");

        short num = sc.nextShort();

        short i = 0;

        System.out.println("Factors of "+num+" are : ");
        for (i = 2; i <= (num / 2); i++)
        {
            if(num%i == 0)
            {
                System.out.println(i);
            }
        }

    }
}
