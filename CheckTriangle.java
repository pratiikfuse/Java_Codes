import java.util.Scanner;

public class CheckTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first angle");
        short firstAngle  = sc.nextShort();

        System.out.println("Enter second angle");
        short secondAngle  = sc.nextShort();

        System.out.println("Enter third angle");
        short thirdAngle  = sc.nextShort();

        if(firstAngle <= 0 || secondAngle <= 0 || thirdAngle <= 0)
        {
            System.out.println("Angle can't be zero or negative");
            System.exit(0);
        }

        if((firstAngle + secondAngle + thirdAngle) == 180)
        {
            System.out.println("It is Triangle");
        }
        else
        {
            System.out.println("it is not a Triangle");
        }


    }
}
