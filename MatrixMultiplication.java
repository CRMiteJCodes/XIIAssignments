import java.util.Scanner;
public class MatrixMultiplication
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter rows of Array A");
        int r1=scan.nextInt();
        System.out.println("Enter columns of Array A");
        int c1=scan.nextInt();
        int A[][]=new int[r1][c1];
        System.out.println("Enter Elements of Array A");
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                A[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter rows of Array B");
        int r2=scan.nextInt();
        System.out.println("Enter columns of Array B");
        int c2=scan.nextInt();
        if(c1!=r2)
        {
            System.out.println("Matrix Multiplication Not Possible");
            return;
        }
        int B[][]=new int[r2][c2];
        System.out.println("Enter Elements of Array B");
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B[i].length;j++)
            {
                B[i][j]=scan.nextInt();
            }
        }
        int C[][]=new int[r1][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        System.out.println("Matrix A * Matrix B = Matrix C");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
