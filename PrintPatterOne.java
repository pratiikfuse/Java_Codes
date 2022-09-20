/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28
 */
import java.util.Scanner;

public class PrintPatterOne
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();

        int i = 0;
        int j = 0;
        int count  = 1;

        for (i = 1; i <= rows; i++)
        {
            for(j=1;j<=i;j++,count++)
            {
                System.out.print(count+" ");
            }
            System.out.println();
        }

    }
}
