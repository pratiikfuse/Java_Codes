import java.util.Scanner;

public class CheckArmstrong
{
    public static boolean isArmstrong(int num)
    {
        int temp = num;
        int digit  = 0;
        String digitString = Integer.toString(num);
        int length = digitString.length();
        int sum = 0;

        while(num!=0)
        {
            digit  = num%10;

            sum = sum + (int)Math.pow(digit,length);

            num = num/10;
        }

        if(sum == temp)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number  = sc.nextInt();

        boolean result = CheckArmstrong.isArmstrong(number);

        if(result)
        {
            System.out.println(number+" is Armstrong number");
        }
        else{
            System.out.println(number+" is not Armstrong number");
        }

    }
}
