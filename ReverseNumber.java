import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        short num = sc.nextShort();
        short temp = num;

        byte digit = 0;
        short reverseNumber = 0;

        while(num != 0)
        {
            digit   = (byte)(num%10);
            reverseNumber = (short)((reverseNumber*10)+digit);
            num = (short)(num/10);
        }

        System.out.println("Reverse number of "+temp+" is "+reverseNumber);
    }
}
