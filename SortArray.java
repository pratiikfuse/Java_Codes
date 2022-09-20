import java.util.Scanner;

public class SortArray
{
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

         i = 0;
        int j = 0;
        int temp = 0;

        for(i = 0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("array after sort");

        for(i = 0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
