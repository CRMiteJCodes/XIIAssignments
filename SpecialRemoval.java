import java.util.*;
public class SpecialRemoval
{
    String sen;
    String res;
    String fres;   
    public SpecialRemoval(String s)
    {
        sen=s;
        res="";
        fres="";
    }    
    public void remove(String s,int i)
    {
        if(i<s.length())
        {
            char ch=s.charAt(i);
            if((Character.isDigit(ch)||Character.isLetter(ch))||ch==' ')
            {
                res+=ch;
            }
            remove(s,i+1);
        }
        else
        {
            res=res+"";
            System.out.println(res);
        }
    }  
    public void mid()
    {
        StringTokenizer str=new StringTokenizer(res," ");
        String wd="";
        while(str.hasMoreTokens())
        {
            wd=str.nextToken();
            int l=wd.length();
            System.out.print(wd);
            if(l>2)
            {
                if(l%2==0)
                {
                    String t=wd.substring(0,(wd.length()/2)-1)+wd.substring((wd.length()/2)+1);
                    fres+=t+" ";
                    System.out.println("\t\t"+t);
                }
                else
                {
                    String y=wd.substring(0,wd.length()/2)+wd.substring(wd.length()/2+1);
                    fres+=y+" ";
                    System.out.println("\t\t"+y);
                }
            }
            else
            {
                fres+=wd+" ";
                System.out.println("\t\t"+wd);
            }
        }
        System.out.println("Result: "+fres.trim());
    }
    public void show()
    {
        System.out.println("Sentence without Special Characters:");
        remove(sen,0);
        System.out.println("Sentence without Mid Character(s):");
        System.out.println("Old Word\tNew Word");
        mid();
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String s=scan.nextLine();
        System.out.println("Original Sentence: "+s);
        SpecialRemoval sr=new SpecialRemoval(s);
        sr.show();
    }
}
