import java.util.Scanner;

public class MatrixSubtraction {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number of rows of first matrix");
            int rowsOne = sc.nextInt();

            System.out.println("Enter number of columns of first matrix");
            int columnOne = sc.nextInt();

            System.out.println("Enter number of rows of second matrix");
            int rowsSecond = sc.nextInt();

            System.out.println("Enter number of columns of second matrix");
            int columnSecond = sc.nextInt();


            if (rowsOne != rowsSecond && columnOne != columnSecond) {
                System.out.println("Rows and Columns of both matrix should be same to perform subtraction");
                System.exit(0);
            }

            int[][] matrixOne = new int[rowsOne][columnOne];
            int[][] matrixSecond = new int[rowsSecond][columnSecond];

            System.out.println("Enter elements of first matrix");
            int i = 0;
            int j = 0;

            for (i = 0; i < matrixOne.length; i++) {
                for (j = 0; j < matrixOne[i].length; j++) {
                    matrixOne[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter elements of second matrix");


            for (i = 0; i < matrixSecond.length; i++) {
                for (j = 0; j < matrixSecond[i].length; j++) {
                    matrixSecond[i][j] = sc.nextInt();
                }
            }

            System.out.println("first matrix : ");
            for (i = 0; i < matrixOne.length; i++)
            {
                for(j = 0;j<matrixOne[i].length;j++)
                {
                    System.out.print(matrixOne[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println("second matrix : ");
            for (i = 0; i < matrixSecond.length; i++)
            {
                for(j = 0;j<matrixSecond[i].length;j++)
                {
                    System.out.print(matrixSecond[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println("Substraction matrix");

            for(i = 0;i<matrixOne.length;i++)
            {
                for(j=0;j<matrixOne[i].length;j++)
                {
                    System.out.print((matrixOne[i][j]-matrixSecond[i][j])+" ");
                }
                System.out.println();
            }


    }
}
