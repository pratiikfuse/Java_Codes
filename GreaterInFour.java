import java.util.Scanner;

public class GreaterInFour
{
    public static int getMax(int first,int second,int third,int fourth)
    {
        int max1 = (first>second)?first:second;
        int max2 = (third>first)?third:fourth;

        int maxNumber = (max1>max2)?max1:max2;

        return maxNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = sc.nextInt();
        System.out.println("Enter second number");
        int second  = sc.nextInt();
        System.out.println("Enter third number");
        int third  = sc.nextInt();
        System.out.println("Enter fourth number");
        int fourth  = sc.nextInt();

        int max  = GreaterInFour.getMax(first,second,third,fourth);


        System.out.println("Max number among "+first+","+second+","+third+","+fourth+" is : "+max);

    }
}
