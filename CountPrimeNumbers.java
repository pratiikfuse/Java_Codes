import java.util.Scanner;
public class CountPrimeNumbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number = sc.nextInt();

        boolean isPrime  = true;
        int countPrime = 0;

        for(int i = 2;i<=number;i++)
        {
            isPrime = true;
            for(int j = 2;j<=Math.sqrt(i);j++)
            {
                if(i%j == 0)
                {
                    isPrime  = false;
                    break;
                }
            }
            if(isPrime)
            {
                countPrime++;
            }
        }

        System.out.println("count of prime numbers up-to "+number+" is "+countPrime);

    }
}
