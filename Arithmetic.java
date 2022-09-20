import java.util.Scanner;

public class Arithmetic
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter first number ");
        short firstNum  = sc.nextShort();

        System.out.println("Enter second number");
        short secondNum = sc.nextShort();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Addition is : "+(firstNum+secondNum));
        System.out.println("Subtraction is : "+(firstNum-secondNum));
        System.out.println("multiplication is : "+(firstNum*secondNum));
        System.out.println("Division is : "+(firstNum/secondNum));
        System.out.println("Remainder after division is : "+(firstNum%secondNum));
        System.out.println("--------------------------------------------------------------");

    }
}
