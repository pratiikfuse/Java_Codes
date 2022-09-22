import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimFactors {
    public static List<Integer> getPrimeFactors(int num)
    {
        int i = 0;
        boolean isPrime = true;
        List<Integer> primFactors = new ArrayList<>();
        for(i=2;i<=num/2;i++)
        {
           isPrime = true;
            if(num%i == 0)
            {
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
                    primFactors.add(i);
                }
            }

        }
        return primFactors;
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        System.out.println("Enter number");
        int number  = sc.nextInt();

        List<Integer> ls = PrimFactors.getPrimeFactors(number);

        System.out.println("Prime factors of "+number+" are : ");
        for(int n : ls){
            System.out.print(n+" ");
        }
        System.out.println();

    }
}
