import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmStrongInRange
{
    public static List<Integer> getArmstrongInRange(int start,int end)
    {
        List<Integer> armstrongList = new ArrayList<>();
        int i = 0;
        int digit  = 0;
        int sum = 0;
        int temp = 0;

        for(i = start;start<=end;start++)
        {
            i = start;
            temp = i;
            sum = 0;

            while(i != 0)
            {
                digit = i%10;
                sum = sum + (int)Math.pow(digit,Integer.toString(start).length());
                i = i/10;
            }
            if(sum == temp)
            {
                armstrongList.add(sum);
            }
        }
        return armstrongList;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int start = sc.nextInt();
        System.out.println("Enter last number");
        int end  = sc.nextInt();

        List<Integer> armstrongList = ArmStrongInRange.getArmstrongInRange(start,end);

        if(armstrongList.size() == 0)
        {
            System.out.println("No armstrong is present in range "+start+"-"+end);
            System.exit(0);
        }
        System.out.println("Armstrong numbers between "+start+" and "+end+" are ");
        for(int n : armstrongList)
        {
            System.out.print(n+" ");
        }
        System.out.println();

    }
}
