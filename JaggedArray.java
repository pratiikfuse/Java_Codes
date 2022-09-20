/*
 write a program to create a jagged array take all the inputs from user
 and display sum of each row element in jagged array
 */
import java.util.Scanner;

public class JaggedArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows  = sc.nextInt();

        if(rows == 0)
        {
            System.out.println("Rows can't be zero");
            System.exit(0);
        }
        int[][]  arr = new int[rows][];

        int i = 0;

        int columns  = 0;

        for(i=0;i<arr.length;i++)
        {
            System.out.println("Enter number of columns for row "+(i+1));
            arr[i] = new int[sc.nextInt()];
        }
        int j = 0;

        for(i = 0;i<arr.length;i++)
        {
            System.out.println("Enter elements for row "+(i+1));
            for(j=0;j<arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("--------------------------------------------");
        System.out.println("Jagged array is : ");
        for(i = 0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");

        int rowSum = 0;

        for(i=0;i<arr.length;i++)
        {
            rowSum = 0;
            for(j=0;j< arr[i].length;j++)
            {
                rowSum+=arr[i][j];
            }
            System.out.println("sum of elements of row "+(i+1)+" is : "+rowSum);
        }
        System.out.println("--------------------------------------------");
    }
}
