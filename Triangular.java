import java.util.Scanner;
public class Triangular 
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scan.nextInt();
        int sum = 0;
        boolean tri = false;
        System.out.print("0");
        for (int i = 1; i <= a; i++) 
        {
            sum += i;
            if (i == 1) 
            {
                System.out.print(" + " + i);
            } 
            else 
            {
                System.out.print(" + " + i);
            }
            if (sum > a)
            {
                break;
            }
            if (sum == a)
            {
                tri = true;
                break;
            }
        }
        System.out.println(" = " + sum);
        if (tri)
        {
            System.out.println(a + " is a Triangular Number");
        } else
        {
            System.out.println(a + " is NOT a Triangular Number");
        }
    }
}
