//Kryptos
import java.util.Scanner;
class Encryption
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Key:");
        String key=scan.nextLine().toLowerCase();
        System.out.println("Enter A Sentence for Encrypting:");
        String s1=scan.nextLine();
        String s=s1.toLowerCase();
        String a="abcdefghijklmnopqrstuvwxyz";
        String data=" "+key;
        for(int i=0;i<26;i++)
        {
            char c=a.charAt(i);
            boolean exist=false;
            for(int j=0;j<key.length();j++)
            {
                if(c==key.charAt(j))
                {
                    exist=true;
                    break;
                }
            }
            if(exist==false)
            data+=c;
        }
        a=" "+a;
        String encr="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int index=0;
            for(int j=0;j<a.length();j++)
            {
                if(ch==a.charAt(j))
                {
                    index=j;
                    break;
                }
            }
            encr+=data.charAt(index);
        }
        System.out.println("Data="+data.toUpperCase());
        System.out.println("Original Sentence: "+s1);
        System.out.println("Encrypted Sentence: "+encr.toUpperCase());
    }
}
