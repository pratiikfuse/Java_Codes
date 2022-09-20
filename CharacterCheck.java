import java.util.Scanner;
public class CharacterCheck
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter Character");
        char c = sc.nextLine().charAt(0);


        System.out.println("character is : "+((c >='1' && c<= '9')?"digit":"alphabet"));


    }
}
