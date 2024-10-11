import java.util.Scanner;
public class Series
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int ch=0;
        do
        {
            System.out.println("1. Print Series");
            System.out.println("2. Print Summation");
            System.out.println("3. Exit");
            ch=scan.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the limit");
                    int l=scan.nextInt();
                    System.out.println("Series for the Limit "+l+" :");
                    for(int i=1;i<=l;i++)
                    {
                        int s;
                        if(i%2==0)
                        {
                            s=(int)(Math.pow(i,3))-1;
                        }
                        else
                        {
                            s=(i*i);
                        }
                        System.out.print(s+" ");
                    }
                    System.out.println();
                    break;
                case 2:
                    double S=1;
                    System.out.println("Enter a Number");
                    int x=scan.nextInt();
                    System.out.println("Enter the limit");
                    int L=scan.nextInt();
                    for(int i=1;i<=L;i++)
                    {
                        int f=1;
                        for(int j=i;j>=1;j--)
                        {
                            f*=j;
                        }
                        S+=((i*x)+f)/Math.pow(((i*2)+1),2);
                    }
                    System.out.println("Sum of the Series: "+S);
                    break;
                case 3:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(ch!=3);
    }
}
