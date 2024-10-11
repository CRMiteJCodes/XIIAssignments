import java.util.Scanner;
public class Pattern
 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Limit:");
        int l = scan.nextInt();
        System.out.println("Enter character 1:");
        char a = scan.next().charAt(0);
        System.out.println("Enter character 2:");
        char b = scan.next().charAt(0);
        if (a == b)
        {
            System.out.println("Error! characters should not be the same!");
        } else if (a == '#' || b == '#') 
        {
            System.out.println("Error! characters should not be #");
        } else 
        {
            for (int i = 1; i <= l; i++) 
            {
                for (int j = 1; j <= l; j++)
                {
                    if (i == j) 
                    {
                        System.out.print("#" + " ");
                    } else if (i < j) 
                    {
                        System.out.print(b + " ");
                    } else {
                        System.out.print(a + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
