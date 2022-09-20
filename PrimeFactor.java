//Write a Java program to print prime factors of given number ( e.g.  12 = 2 ,2 ,3)
import java.util.Scanner;

public class PrimeFactor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        short number  = sc.nextShort();

        short  i = 0;
        short  j = 0;

        boolean isPrime  = true;

        System.out.println("Prime factors of "+number+" are : ");
        for(i = 2;i<(number/2);i++)
        {
            if(number%i == 0)
            {
                isPrime = true;

                for(j=2;j<=i/2;j++)
                {
                    if(i%j == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime == true)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
