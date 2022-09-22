import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorsOfNumber
{
    public static List<Integer> getFactors(int num)
    {
        int i = 0;
        List<Integer>factors = new ArrayList<>();

        for(i=2;i<(num/2)+1;i++)
        {
            if(num%i == 0)
            {
                factors.add(i);
            }
        }

        return factors;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number  = sc.nextInt();


        List<Integer> fatcorsList = FactorsOfNumber.getFactors(number);

        System.out.println("factors of "+number+" are : ");
        for(int n : fatcorsList)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
