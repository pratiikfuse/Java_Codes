import java.util.Scanner;

public class DisplayArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size  = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements in array");
        int i  = 0;
        for(i=0;i<arr.length;i++)
        {
            arr[i] =  sc.nextInt();
        }

        System.out.println("Elements of array after adding 5 :");
        for(i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]+5);
        }
    }
}
