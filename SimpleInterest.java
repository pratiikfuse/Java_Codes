/*
Enter the principal amount and duration of loan. Consider Rate of interest as 7.5.
and calculate the Simple interest on given amount for given period as well as find
final amount to be paid to the Bank
 */
import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal amount in Rs");
        int principalAmount  = sc.nextInt();

        System.out.println("Enter duration of loan in years");
        float years  = sc.nextFloat();

        float simpleInterest = ((principalAmount*years*7.5f)/100);

        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Simple Interest : Rs."+simpleInterest+"\n"+"final amount to be paid to bank : Rs."+(principalAmount+simpleInterest)+"\n");
        System.out.println("----------------------------------------------------------------------------");
    }
}
