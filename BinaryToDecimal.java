
import java.util.Scanner;

public class BinaryToDecimal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary representation  ");
        String binaryString = sc.nextLine();

         String stringNoSpaces = binaryString.replaceAll("\\s","");

        if(stringNoSpaces.length() == 0)
        {
            System.exit(0);
        }

        char[] binaryArray =stringNoSpaces.toCharArray();

        for(char ch : binaryArray )
        {
            if(ch != '1' && ch!= '0')
            {
                System.out.println("binary number should contain only 1's an 0's ");
                System.exit(0);
            }
        }

        int i = stringNoSpaces.length()-1;
        int j = 0;
        int decimalNumber  = 0;

        while(i>=0)
        {
           decimalNumber += Math.pow(2,j)*(Integer.parseInt(binaryArray[i]+""));

           j++;
           i--;

        }

        System.out.println("decimal number of given binary representation "+binaryString+" is "+decimalNumber);

    }
}
