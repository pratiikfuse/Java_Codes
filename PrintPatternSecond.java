/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
 */
import java.util.Scanner;

public class PrintPatternSecond
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows  = sc.nextInt();

        int i  = 0;
        int j = 0;

        for(i=1;i<=rows;i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
