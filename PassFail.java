import java.util.Scanner;
public class PassFail
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter percentage you got : ");

        System.out.println("You are "+((sc.nextInt()>=40)?"pass":"fail"));

    }
}
