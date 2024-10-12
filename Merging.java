import java.util.Scanner;
public class Merging
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Size for Array 1:");
        int n1=scan.nextInt();
        int A[]=new int[n1];
        System.out.println("Enter the Elements of Array 1");
        for(int i=0;i<n1;i++)
        A[i]=scan.nextInt();
        System.out.println("Enter the Size for Array 2:");
        int n2=scan.nextInt();
        int B[]=new int[n2];
        System.out.println("Enter the Elements of Array 2");
        for(int i=0;i<n2;i++)
        B[i]=scan.nextInt();
        int C[]=new int[n1+n2];
        int t=0;
        for(int i=0;i<n1;i++)
        C[t++]=A[i];
        for(int i=0;i<n2;i++)
        C[t++]=B[i];
        System.out.println("Merged Array:");
        for(int i=0;i<C.length;i++)
        System.out.println(C[i]);
    }
}
