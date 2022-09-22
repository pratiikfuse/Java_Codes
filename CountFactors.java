import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountFactors
{
    public static int getCountOfFactors(int num)
    {
        int i = 0;
        int count = 0;

        for(i=2;i<(num/2)+1;i++)
        {
            if(num%i == 0)
            {
               count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number  = sc.nextInt();


         int count = CountFactors.getCountOfFactors(number);

        System.out.println("count of factors of "+number+" is : "+count);
    }
}
