//Write a Java program to find the table of given number.
import java.util.Scanner;

public class CalculateTable
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        short number  = sc.nextShort();

        System.out.println("Table of "+number+" is : ");

        byte i = 0;

        System.out.println("-------------------------------------");
        for(i = 1;i<=10;i++)
        {
            System.out.println(i*number);
        }
        System.out.println("-------------------------------------");
    }
}
