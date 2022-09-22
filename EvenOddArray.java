import java.util.Scanner;

public class EvenOddArray
{
    public static int[][] getEvenOddArray(int[] arr)
    {
        int evenCount  = EvenOddArray.getEvenCount(arr);
        int oddCount = arr.length - evenCount;

        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];

        int j = 0;
        int k = 0;
        int i = 0;
        for(i = 0,j=0,k=0;i<arr.length;i++)
        {
            if(arr[i]%2 == 0)
            {
                evenArray[j] =arr[i];
                j++;
            }else{
                oddArray[k] = arr[i];
                k++;
            }
        }

        return new int[][]{evenArray,oddArray};
    }
    private static int getEvenCount(int[] arr)
    {
        int count = 0 ;

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]%2 == 0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements in array");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int[][] evenOddArray = EvenOddArray.getEvenOddArray(arr);
        System.out.println("given array : ");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        if(evenOddArray[0].length == 0)
        {
            System.out.println("there is no even number in original array");
        }else{
            System.out.println("Even element Array are : ");
            for(int i = 0;i<evenOddArray[0].length;i++)
            {
                System.out.print(evenOddArray[0][i]+" ");
            }
            System.out.println();
        }
        if(evenOddArray[1].length == 0)
        {
            System.out.println("There is no odd number in original array ");
        }
        else{
            System.out.println("Odd element Array are : ");
            for(int i = 0;i<evenOddArray[1].length;i++)
            {
                System.out.print(evenOddArray[1][i]+" ");
            }
            System.out.println();
        }
    }
}
