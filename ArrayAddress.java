import java.util.Scanner;
public class ArrayAddress
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Base Address");
        int B=scan.nextInt();
        int ch=0;
        do
        {
            System.out.println("1. Integer Array");
            System.out.println("2. Double Array");
            System.out.println("3. Exit");
            ch=scan.nextInt();
            switch(ch)
            {
                case 1:
                    int arr[]=new int[15];
                    System.out.println("Enter 15 Integer Values");
                    for(int i=0;i<arr.length;i++)
                    {
                        arr[i]=scan.nextInt();
                    }
                    int max=arr[0],min=arr[0],maA=0,miA=0;
                    for(int i=0;i<arr.length;i++)
                    {
                        if(arr[i]>max)
                        {
                            max=arr[i];
                            maA=i;
                        }
                        if(arr[i]<min)
                        {
                            min=arr[i];
                            miA=i;
                        }
                    }
                    System.out.println("Address of Maximum and Minimum Element");
                    int AM=B+4*(maA);
                    System.out.println("Address of Maximum Element "+max+": "+AM);
                    int Am=B+4*(miA);
                    System.out.println("Address of Minimum Element "+min+": "+Am);
                    break;
                case 2:
                    double ary[]=new double[15];
                    System.out.println("Enter 15 double Values");
                    for(int i=0;i<ary.length;i++)
                    {
                        ary[i]=scan.nextDouble();
                    }
                    double dmax=ary[0],dmin=ary[0];
                    int dmaA=0,dmiA=0;
                    for(int i=0;i<ary.length;i++)
                    {
                        if(ary[i]>dmax)
                        {
                            dmax=ary[i];
                            dmaA=i;
                        }
                        if(ary[i]<dmin)
                        {
                            dmin=ary[i];
                            dmiA=i;
                        }
                    }
                    System.out.println("Address of Maximum and Minimum Element");
                    int dAM=B+8*(dmaA);
                    System.out.println("Address of Maximum Element "+dmax+": "+dAM);
                    int dAm=B+8*(dmiA);
                    System.out.println("Address of Minimum Element "+dmin+": "+dAm);
                    break;
                case 3:
                    System.out.println("Exit!!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(ch!=3);
    }
}
