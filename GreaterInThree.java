import java.util.Scanner;

public class GreaterInThree
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter first Number");
        int firstNumber  = sc.nextInt();

        System.out.println("Enter second Number");
        int secondNumber  = sc.nextInt();

        System.out.println("Enter third number");
        int thirdNumber  = sc.nextInt();

        int max  = ((firstNumber>secondNumber)?((firstNumber>thirdNumber)?firstNumber:thirdNumber):((secondNumber>thirdNumber)?secondNumber:thirdNumber));

        System.out.println("Greater number is : "+max);

    }
}
