import java.util.Scanner;

public class WordLength
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter a sentence:");
        String s1 = scan.nextLine();
        String s = "";
        int w = 0;
        for (int i=0; i<s1.length(); i++) 
        {
            if (i == 0 || s1.charAt(i) != ' ' || s1.charAt(i - 1) != ' ') 
            {
                s+=s1.charAt(i);
            }
        }
        System.out.println("Original Sentence:");
        System.out.println(s);
        s=s+" ";
        for(int i=0; i<s.length(); i++) 
        {
            char ch=s.charAt(i);
            if(ch==' ') 
            {
                w++;
            }
        }
        String arr[]=new String[w];
        String wd = "";
        w = 0;
        for(int i=0; i<s.length(); i++) 
        {
            char ch=s.charAt(i);
            if(ch != ' ') 
            {
                wd=wd + ch;
            } 
            else 
            {
                arr[w++]=wd;
                wd="";
            }
        }
        for(int i=0; i<arr.length-1; i++) 
        {
            for (int j=0; j<arr.length-i-1; j++) 
            {
                if(arr[j].length() > arr[j+1].length()) 
                {
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted String:");
        for(int i=0; i<arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
