import java.util.Scanner;
public class Hamming
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        if(n < 0)
        System.out.println("Error! Negative number not Hamming");
        else
        {
            int p=2;
            int num=n;
            boolean flag=true;
            System.out.print(num+"=");
            while(n>1)
            {
                while (n%p==0)
                {
                    System.out.print(p);
                    n = p;
                    if(n > 1)
                    System.out.print("*");
                    switch(p)
                    {

                        case 2:
                        case 3:
                        case 5:
                        break;
                        default:
                        flag=false;
                    }
                }
                p++;
            }
            System.out.println();
            if(flag)
            System.out.println(num+ " is a Hamming Number.");
            else
            System.out.println(num+ " is NOT a Hamming Number.");
        }
    }
}