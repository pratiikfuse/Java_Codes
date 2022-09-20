import java.util.Scanner;

public class DecimalToBinary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number");
        int decimalNumber  = sc.nextInt();

        boolean negativeFlag = false;

        if(decimalNumber<0)
        {
            negativeFlag = true;
            decimalNumber  = -decimalNumber;
        }
        int temp = decimalNumber;
        StringBuilder binaryString  = new StringBuilder();
        int count  = 0;

        while(temp!=0)
        {
            binaryString.append(temp%2);
            count++;
            if(count % 4 == 0)
            {
                binaryString.append(" ");
            }
            temp  = temp/2;
        }

        while(count%8 != 0)
        {
            if(count%4 == 0)
            {
                binaryString.append(" ");
            }
            binaryString.append(0);
            count++;
        }

        if(negativeFlag == true)
        {
            System.out.println("binary representation of -"+decimalNumber+" is -"+binaryString.reverse() );
        }
        else
        {
            System.out.println("Binary representation of "+decimalNumber+" is "+binaryString.reverse());
            System.out.println("given number occupies : "+(count/8)+" byte");
        }
    }
}
