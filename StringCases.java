import java.util.*;

public class StringCases
{
    String tit;
    String tog;
    int c;
    String str;

    public StringCases(String s)
    {
        str=s;
        tit="";
        tog="";
        c=0;
    }

    public void title()
    {
        StringTokenizer st=new StringTokenizer(str," ");
        String wd="";
        while(st.hasMoreTokens())
        {
            wd=st.nextToken();
            int l=wd.length();
            tit+=Character.toUpperCase(wd.charAt(0))+wd.substring(1)+" ";
        }
    }

    public void tog()
    {
        StringTokenizer st=new StringTokenizer(str," ");
        String wd="";
        while(st.hasMoreTokens())
        {
            wd=st.nextToken();
            for(int i=0; i<wd.length(); i++)
            {
                char ch=wd.charAt(i);
                if(Character.isUpperCase(ch))
                    tog+=Character.toLowerCase(ch);
                else
                    tog+=Character.toUpperCase(ch);
            }
            tog=tog+" ";
        }
    }

    public void count()
    {
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
                c++;
        }
    }

    public void print()
    {
        System.out.println("Original Sentence: "+str);
        System.out.println("Title: "+tit);
        System.out.println("Toggled Sentence: "+tog);
    }

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=scan.nextLine();
        StringCases sc=new StringCases(str);
        sc.title();
        sc.tog();
        sc.print();
    }
}
