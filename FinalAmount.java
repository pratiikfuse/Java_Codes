/*
Write a Java program accept price per item and quantity from user.
If quantity is >=10 then give 10% discount on  total amount and display final amount to be paid.

 */

import java.util.Scanner;

public class FinalAmount
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter price of one item");
        int price  = sc.nextInt();

        System.out.println("Enter quantity of items");
        int quantity = sc.nextInt();

        int totalAmount  = price*quantity;
        if(quantity>=10)
        {
            System.out.println("You got 10% discount so final amount to be paid is : Rs "+(totalAmount - ((totalAmount*10)/100)));
        }
        else if(quantity>=0 && quantity < 10)
        {
            System.out.println("final Amount to be paid is : Rs "+totalAmount);
        }
        else
        {
            System.out.println("Enter valid quantity");
        }
    }
}
