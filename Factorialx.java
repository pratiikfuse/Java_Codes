import java.util.Scanner;

public class Factorialx
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        byte num = sc.nextByte();

        long factorial = 1;

        byte i = 1;

        for(i = 1;i<=num;i++)
        {
            factorial*=i;
        }

        System.out.println("Factorial of "+num+" is "+factorial);
    }
}
