import java.util.Scanner;
public class DudeneyMagic
{
    int n;
    int m;
    int sum;
    int Dsum;
    public DudeneyMagic()
    {
        n=0;
        m=0;
        sum=0;
        Dsum=0;
    }
    public int sumDigits(int x)
    {
        if(x>0)
        {
            int r=x%10;
            Dsum=Dsum+r;
            sumDigits(x/10);
        }
        return Dsum;
    }
    public void read()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number for Dudeney:");
        n=scan.nextInt();
        System.out.println("Enter number for Magic:");
        m=scan.nextInt();
    }
    public void checkDude()
    {
        Dsum=0;
        int sod=sumDigits(n);
        int cube=(int)Math.pow(sod,3);
        System.out.println("Original number:"+n);
        System.out.println("Cube of Sum of Digits:"+cube);
        if(cube==n)
        {
            System.out.println("The number "+n+" is a Dudeney number");
        }
        else
        {
            System.out.println("The number "+n+" is NOT a Dudeney number");
        }
    }
    public void isMagic(int mag)
    {
        if(mag<10)
        {
            System.out.println("Result of Magic check:"+mag);
            if(mag==1)
            {
                System.out.println(m+" is a Magic Number");
            }
            else
            {
                System.out.println(m+" is NOT a Magic Number");
            }
        }
        else
        {
            Dsum=0;
            sum=sumDigits(mag);
            isMagic(sum);
        }
    }
    public void display()
    {
        System.out.println("Dudeney Number:");
        checkDude();
        System.out.println("Magic Number:");
        isMagic(m);
    }
    public static void main(String args[])
    {
        DudeneyMagic dm=new DudeneyMagic();
        dm.read();
        dm.display();
    }
}
