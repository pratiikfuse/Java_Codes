/*
8
8 7
8 7 6
8 7 6 5
8 7 6 5 4
8 7 6 5 4 3
8 7 6 5 4 3 2
8 7 6 5 4 3 2 1
 */
import java.util.Scanner;
public class PrintPatternThird
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows  = sc.nextInt();

        int i = 0;
        int j = 0;
        int  k = 0;


        for(i=1;i<=rows;i++)
        {
            for(j=rows,k=1;k<=i;j--,k++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
