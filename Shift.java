import java.util.Scanner;
public class Shift
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int r = scan.nextInt();
        System.out.println("Enter the no of columns:");
        int c = scan.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the values:");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Original Array:");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int ch = 0;
        do
        {
            System.out.println("1. Row Shift");
            System.out.println("2. Column Shift");
            System.out.println("3. Exit");
            ch = scan.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the row to shift:");
                    int row = scan.nextInt();
                    row = row - 1;
                    int ar1[] = new int[c];
                    for(int i = 0; i < c; i++)
                    {
                        ar1[i] = arr[row][i]; 
                    }
                    for(int i = row; i > 0; i--)
                    {
                        for(int j = 0; j < arr[i].length; j++)
                        {
                            arr[i][j] = arr[i-1][j];
                        }
                    }
                    for(int j = 0; j < ar1.length; j++)
                    {
                        arr[0][j] = ar1[j];
                    }
                    System.out.println("New Matrix after Row Shift:");
                    for(int i = 0; i < arr.length; i++)
                    {
                        for(int j = 0; j < arr[i].length; j++)
                        {
                            System.out.print(arr[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter the column to shift:");
                    int col = scan.nextInt();
                    col = col - 1;
                    int ar2[] = new int[r];
                    for(int i = 0; i < r; i++)
                    {
                        ar2[i] = arr[i][col];
                    }
                    for(int i = 0; i < arr.length; i++)
                    {
                        for(int j = col; j > 0; j--)
                        {
                            arr[i][j] = arr[i][j-1];
                        }
                    }
                    for(int i = 0; i < ar2.length; i++)
                    {
                        arr[i][0] = ar2[i];
                    }
                    System.out.println("New Matrix after Column Shift:");
                    for(int i = 0; i < arr.length; i++)
                    {
                        for(int j = 0; j < arr[i].length; j++)
                        {
                            System.out.print(arr[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Exit!!");
                    break;
                default:
                    System.out.println("Invalid!");
            }
        } while(ch != 3);
    }
}
