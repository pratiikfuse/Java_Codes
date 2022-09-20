import java.util.Scanner;

public class MinimumNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int numFirst = sc.nextInt();

        System.out.println("Enter second number");
        int numSecond = sc.nextInt();

        System.out.println("smaller number is : "+((numFirst<numSecond)?numFirst:numSecond));
    }
}
