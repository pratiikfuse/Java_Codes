import java.util.Scanner;
public class SecondLargestInArray
{
    public static void main(String[] args)
    {
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

        int max = Integer.MIN_VALUE;

        for(i = 0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max  = arr[i];
            }
        }

        int secondMax = Integer.MIN_VALUE;
        for (i = 0;i<arr.length;i++)
        {
            if(arr[i]>secondMax && arr[i]!=max)
            {
                secondMax = arr[i];
            }

        }

        if(secondMax == Integer.MIN_VALUE)
        {
            System.out.println("All elements are same");
            System.exit(0);
        }

        System.out.println("second max element is : "+secondMax);
    }
}
