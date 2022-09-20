import java.util.Scanner;

public class Profit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Cost price of an item in Rs ");
        int costPrice  = sc.nextShort();

        System.out.println("Enter selling price of an item in Rs ");
        int sellingPrice  = sc.nextInt();

        if(costPrice>sellingPrice)
        {
            System.out.println("Cost price should be less than selling price");
            System.exit(0);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Your profit is Rs."+(sellingPrice-costPrice));
        System.out.println("--------------------------------------------------------------");
    }
}
