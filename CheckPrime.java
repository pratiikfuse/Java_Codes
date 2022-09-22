import java.util.Scanner;

public class CheckPrime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num  = sc.nextInt();

        int target = (int)Math.sqrt(num);

        boolean isPrime  = true;
        for(int i = 2;i<=target;i++)
        {
            if(num%i == 0)
            {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
        {
            System.out.println(num+" is Prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }

}
