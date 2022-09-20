/*
     Write a java program which will take some elements,
     store it in array and find the square and cube of every element in array

 */
import java.util.Scanner;

public class SquareCubeArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int[] arr  = new int[size];

        System.out.println("Enter elements in array");
        int i = 0;

        for(i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(i=0;i<arr.length;i++)
        {
            System.out.println("square of "+arr[i]+" is "+(arr[i]*arr[i])+" and cube is "+(arr[i]*arr[i]*arr[i]));
        }
    }
}
