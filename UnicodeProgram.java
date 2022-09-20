import java.util.Scanner;

public class UnicodeProgram
{
    public static int getUnicodeValue(char ch)
    {
        return ch;
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.nextLine().charAt(0);

        System.out.println("unicode value of character "+ch+" is : "+UnicodeProgram.getUnicodeValue(ch));

        sc.close();
    }

}
