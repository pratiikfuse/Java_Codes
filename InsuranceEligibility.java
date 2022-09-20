/*
Write a Java program for Company Insurance Policy. A company insure its driver under the following conditions
a)	If driver is married
b)	If driver is unmarried male and age above 30
c)	If driver is unmarried female and age above 25

 */
import java.util.Scanner;
public class InsuranceEligibility
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marital status from below options ");
        System.out.println("•married");
        System.out.println("•unmarried");
        String maritalStatus = sc.nextLine().toLowerCase();


        if(maritalStatus.equals("married"))
        {
            System.out.println("You are eligible for insurance");
        }
        else if(maritalStatus.equals("unmarried"))
        {
            System.out.println("Enter your gender from below options ");
            System.out.println("•male");
            System.out.println("•female");
            String gender  = sc.nextLine().toLowerCase();
            System.out.println("Enter your age");
            byte age = sc.nextByte();


            if(gender.equals("male") && age > 30 || gender.equals("female") && age > 25)
            {
                System.out.println("You are eligible for insurance");
            }
            else
            {
                System.out.println("You are not eligible for insurance");
            }
        }
        else
        {
            System.out.println("Please enter correct marital status ");
        }
    }
}
