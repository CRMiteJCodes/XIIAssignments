import java.util.Scanner;
public class NBD
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array (N for an N x N matrix):");
        int s=scan.nextInt();
        int arr[][]=new int[s][s];
        System.out.println("Enter the Array values:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Non-Boundary elements:");
        int nB[] = new int[(s-2)*(s-2)];
        int k=0;
        for(int i=1;i<arr.length-1;i++)
        {
            for(int j=1;j<arr[i].length-1;j++)
            {
                nB[k++]=arr[i][j];
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Boundary elements (Odd first, Even next in Spiral):");
        int B[] = new int[2*(s+(s-2))];
        k=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(i==0 || i==arr.length-1 || j==0 || j==arr[i].length-1)
                {
                    B[k++]=arr[i][j];
                }
            }
        }
        int S[]=new int[B.length];
        k=0;
        for(int i=0;i<B.length;i++)
        {
            if(B[i]%2!=0)
                S[k++]=B[i];
        }
        for(int i=0;i<B.length;i++)
        {
            if(B[i]%2==0)
                S[k++]=B[i];
        }
        for(int i=0; i<S.length; i++)
        System.out.print(S[i]+" "); 
        int[][] Spiral=arr;
        k=0;
        int index=0, top=0, bottom=s-1, left=0, right=s-1;    
        for(int i=left;i<=right;i++)
            Spiral[top][i]=S[index++];
        top++;
        for(int i=top;i<=bottom;i++)
            Spiral[i][right]=S[index++];
        right--;
        if(top<=bottom)
        {
            for(int i=right;i>=left;i--)
                Spiral[bottom][i]=S[index++];
            bottom--;
        }
        if(left<=right)
        {
            for(int i=bottom;i>=top;i--)
                Spiral[i][left]=S[index++];
            left++;
        }
        System.out.println();
        System.out.println("Final array after replacing boundary elements in spiral order:");
        for(int i=0;i<Spiral.length;i++)
        {
            for(int j=0;j<Spiral[i].length;j++)
            {
                System.out.print(Spiral[i][j]+"   ");
            }
            System.out.println();
        }
    }
}

