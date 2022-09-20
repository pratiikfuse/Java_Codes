/*
Write a java Program to find Largest & Smallest Number in given Array

 */
import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements in array");

        int i = 0;

        for(i =0;i<arr.length;i++)
        {
            arr[i]  = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(i = 0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max  = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }

        System.out.println("Maximum number from array is : "+max);
        System.out.println("Minimum number from array is : "+min);
    }
}
