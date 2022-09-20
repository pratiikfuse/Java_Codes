// Enter a number and find its square and cube
import java.util.Scanner;
public class SquareCube
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        short num = sc.nextShort();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Square is : "+num*num+" and cube is : "+num*num*num);
        System.out.println("--------------------------------------------------------------");
    }

}
