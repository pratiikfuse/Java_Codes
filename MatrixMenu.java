import java.util.Scanner;
public class MatrixMenu
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice  = 1;
        while(choice != 0)
        {
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("Choose operation you want to perform");
            System.out.println(" 1.Addition of two matrix \n 2.Subtraction of two matrix \n 3.Transpose given matrix \n 0.exit");
            System.out.println("-------------------------------------------------------------------------------------------------");

            choice  = sc.nextInt();

            switch(choice)
            {
                case(1)->{
                    System.out.println("Enter number of rows of first matrix");
                    int rowsOne = sc.nextInt();

                    System.out.println("Enter number of columns of first matrix");
                    int columnOne = sc.nextInt();

                    System.out.println("Enter number of rows of second matrix");
                    int rowsSecond = sc.nextInt();

                    System.out.println("Enter number of columns of second matrix");
                    int columnSecond = sc.nextInt();


                    if (rowsOne != rowsSecond && columnOne != columnSecond) {
                        System.out.println("Rows and Columns of both matrix should be same to perform addition");
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

                    System.out.println("Addition matrix");

                    for(i = 0;i<matrixOne.length;i++)
                    {
                        for(j=0;j<matrixOne[i].length;j++)
                        {
                            System.out.print((matrixOne[i][j]+matrixSecond[i][j])+" ");
                        }
                        System.out.println();
                    }

                }

                case(2)->{
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

                    System.out.println("Subtraction matrix");

                    for(i = 0;i<matrixOne.length;i++)
                    {
                        for(j=0;j<matrixOne[i].length;j++)
                        {
                            System.out.print((matrixOne[i][j]-matrixSecond[i][j])+" ");
                        }
                        System.out.println();
                    }
                }

                case(3)->{
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
                        System.out.println("Enter row at "+(i+1)+" position");
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

                case(0)->{
                    System.out.println("Thank you for using the application");
                }
                default->{
                    System.out.println("please choose correct option");
                }
            }
        }
    }
}
