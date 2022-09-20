import java.util.Scanner;

public class SumRecursion
{
    public static int sum(int n)
    {
        if(n>=1){
          return  n + sum(n-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        System.out.println("Sum of all numbers up-to "+n+" is ");

        System.out.println(SumRecursion.sum(n));
    }
}
