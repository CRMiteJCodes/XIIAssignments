import java.util.Scanner;
public class Vampire_Number 
{ 
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Four Digit Vampire Numbers are:");

        for (int n = 1000; n <= 9999; n++)
        {
            int num = n;
            int d = 0;
            while (num != 0) 
            {
                d++;
                num /= 10;
            }
            if (d % 2 == 0) 
            {
                int ary[] = new int[d];
                num = n;
                for (int i = ary.length - 1; i >= 0; i--) 
                {
                    ary[i] = num % 10;
                    num = num / 10;
                }
                boolean f = false;
                for (int i = 0; i < ary.length; i++) 
                {
                    for (int j = 0; j < ary.length; j++)
                    {
                        if (i == j)
                            continue;
                        for (int k = 0; k < ary.length; k++) 
                        {
                            if (k == i || k == j) 
                            {
                                continue;
                            }
                            for (int l = 0; l < ary.length; l++) 
                            {
                                if (l == i || l == j || l == k)
                                    continue;
                                int a = ary[i] * 10 + ary[j];
                                int b = ary[k] * 10 + ary[l];
                                int res = a * b;

                                if (res == n) 
                                {
                                    f = true;
                                }
                            }
                        }
                    }
                }
                if (f) {
                    System.out.print(n + " ");
                }
            }
        }
    }
}
