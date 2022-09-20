import java.util.Scanner;

public class TransposeMatrix
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows  = sc.nextInt();
        System.out.println("Enter number of columns");
        int columns = sc.nextInt();

        int[][] matrix   = new int[rows][columns];

        int[][] transposeMatrix  = new int[columns][rows];


        int i = 0;
        int j = 0;
        for(i = 0;i<rows;i++)
        {
            System.out.println("Enter row elements");
            for(j=0;j<columns;j++)
            {
                matrix[i][j]  = sc.nextInt();
            }
        }

        for(i = 0;i<transposeMatrix.length;i++)
        {
            for(j=0;j<transposeMatrix[i].length;j++)
            {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("given matrix :");
        for(i = 0;i<rows;i++)
        {
            for(j=0;j<columns;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("transpose matrix :");
        for(i = 0;i<transposeMatrix.length;i++)
        {
            for(j=0;j<transposeMatrix[i].length;j++)
            {
                System.out.print(transposeMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
