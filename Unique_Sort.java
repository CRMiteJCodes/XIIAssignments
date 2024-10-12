import java.util.Scanner;
public class Unique_Sort
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size:");
        int s=scan.nextInt();
        System.out.println("Enter "+s+" array values:");
        int arr[]=new int[s];
        for(int i=0;i<arr.length;i++)
        arr[i]=scan.nextInt();
        System.out.println("Original Values:");
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
        System.out.println("Sorted Values Are:");
        for(int i=1;i<arr.length;i++)
        {
            int k=arr[i],j=i-1;
            while(j>=0&&k<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=k;
        }
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
        System.out.println();
        int u[]=new int[s],ui=0;
        for(int i=0;i<arr.length;i++)
        {
            int n=arr[i],c=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(n==arr[j])
                {
                    c++;
                }
            }
            if(c<2)
            {
                u[ui]=arr[i];
                ui++;
            }
        }
        if(ui>0)
        {
            System.out.println("Unique Values Are:");
            for(int i=0;i<ui;i++)
            System.out.println(u[i]);
        }
    }
}
