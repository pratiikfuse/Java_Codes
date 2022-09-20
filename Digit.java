/* Write a java program to find the sum of all digits in given three digits number. (e.g. I/p 512 o/p 8)
 */

import java.util.Scanner;

public class Digit
{
    public static byte getDigitSum(short num)
    {

        byte Digit   = 0;
        byte Sum = 0;

        Digit  = (byte)(num%10);
        num = (short)(num/10);
        Sum+=Digit;

        Digit  = (byte)(num%10);
        num = (short)(num/10);
        Sum+=Digit;

        Digit  = (byte)(num%10);
        Sum+=Digit;

        return Sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        short num  = sc.nextShort();


        if(num<0)
        {
            if((String.valueOf(num).length() ) != 4)
            {
                System.out.println("Enter number with only three digits");
                sc.close();
                System.exit(0);
            }
        }
        else if((String.valueOf(num)).length() != 3)
        {
            System.out.println("Enter number with only three digits");
            sc.close();
            System.exit(0);
        }

        byte result  = Digit.getDigitSum(num);


        System.out.println("Sum of Digits in number "+num+" is "+result);

        sc.close();

    }

}
