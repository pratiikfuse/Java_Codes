//Prog to print all prime numbers between given range
import java.util.Scanner;

public class PrintPrimeRange {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter first number");
        int start = sc.nextInt();
        System.out.println("Enter last number");
        int last = sc.nextInt();

        boolean isPrime  = true;

        System.out.println("prime numbers between "+start+" and "+last+" are:");

        for(int i = start;i<=last;i++)
        {
            isPrime = true;

            if(i == 0 || i == 1)
            {
                isPrime = false;
            }

            for(int j = 2;j<=Math.sqrt(i);j++)
            {
                if(i%j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(i);
            }
        }
    }
}
