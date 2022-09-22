import java.util.Scanner;

public class SumOFDigits {
    public static int getDigitSum(int num)
    {
        int sum  = 0;

        while(num!=0)
        {
            sum+= num%10;
            num = num/10;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter number");
        int number  = sc.nextInt();


        System.out.println("Digit sum is : "+SumOFDigits.getDigitSum(number));


    }
}
