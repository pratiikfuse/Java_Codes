import java.util.Scanner;
public class FindAngle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first angle in degree : ");
        short firstAngle = sc.nextShort();

        System.out.println("Enter second angle in degree : ");
        short secondAngle  = sc.nextShort();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Third angle is : "+(180-(firstAngle+secondAngle))+" degree");
        System.out.println("--------------------------------------------------------------");


    }
}
