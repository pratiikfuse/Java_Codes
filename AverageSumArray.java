import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AverageSumArray
{
    public static List getSumAndAverage(int[] arr)
    {
        int i = 0;
        int sum = 0;
        List ls  = new LinkedList();
        for(i = 0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }

        float avg   = sum*1f/arr.length;

        ls.add(sum);
        ls.add(avg);

        return ls;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements in array");
        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        List ls = AverageSumArray.getSumAndAverage(arr);

        var sum  =  ls.get(0);
        var avg  =  ls.get(1);

        System.out.println("sum of all elements in array : "+sum);
        System.out.println("Average of array : "+avg);
    }
}
