import java.util.Scanner;
public class City
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int ch=0;
        System.out.println("Enter the size:");
        int s=scan.nextInt();
        String c[]=new String[s];
        int p[]=new int[s];
        System.out.println("Enter "+s+" Area and Pin code");
        scan.nextLine(); // consume the newline left-over
        for(int i=0;i<s;i++)
        {
            System.out.println("Enter Area:");
            c[i]=scan.nextLine();
            System.out.println("Enter "+c[i]+" Pin code:");
            p[i]=scan.nextInt();
            scan.nextLine(); // consume the newline left-over
        }
        do
        {
            ch=0;
            System.out.println("1. Find Pin using Area: ");
            System.out.println("2. Find Area using Pin");
            System.out.println("3. Display");
            System.out.println("4. Exit!!");
            ch=scan.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the area");
                    scan.nextLine(); 
                    String a=scan.nextLine();
                    int ar=-1;
                    for(int i=0;i<s;i++)
                    {
                        if(c[i].equalsIgnoreCase(a))
                        {
                            ar=i;
                            break;
                        }
                    }
                    if(ar>=0)
                        System.out.println("Pin code of "+a+": "+p[ar]);
                    else
                        System.out.println("Area not found!!!!");
                    break;
                case 2:
                    System.out.println("Enter the Pin");
                    int pi=scan.nextInt();
                    int j=-1;
                    for(int i=0;i<s;i++)
                    {
                        if(p[i]==pi)
                        {
                            j=i;
                            break;
                        }
                    }
                    if(j>=0)
                        System.out.println("Area of "+pi+": "+c[j]);
                    else
                        System.out.println("Pin not found!!!!");
                    break;
                case 3:
                    System.out.println("Area\tPin Code");
                    for(int i=0;i<s;i++)
                    {
                        System.out.println(c[i]+"\t"+p[i]);
                    }
                    break;
                case 4:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(ch!=4);
    }
}
