//Find the table of given number using recursion

import java.util.Scanner;

public class TableRecursion
{

   public static void Table(int n,int i)
   {
       if(i<=10)
       {
           System.out.println(i*n);
           Table(n,++i);
       }

   }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number");
        int n = sc.nextInt();

        System.out.println("table of "+n+" is ");
        Table(n,1);
    }
}
