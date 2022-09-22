import java.util.Scanner;

public class NumberReverse
{
    public static int getReverseNumber(int num)
    {
        int iRev = 0;

        while(num!=0)
        {
            iRev  = (iRev*10)+num%10;
            num = num/10;
        }

        return iRev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number = sc.nextInt();

        int result  = NumberReverse.getReverseNumber(number);
        System.out.println("Reverse number is : "+result);

    }
}
