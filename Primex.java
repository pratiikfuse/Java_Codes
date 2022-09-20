import java.util.Scanner;

public class Primex
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        short num = sc.nextShort();

        boolean flag = true;
        short i = 0;

        for(i = 1;i<num/2;i++)
        {
            if(num%i == 0)
            {
                flag = false;
                break;
            }
        }

        if(flag == false)
        {
            System.out.println("Number is not prime");
        }
        else
        {
            System.out.println("Number is prime");
        }

    }
}
