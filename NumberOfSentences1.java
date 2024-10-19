import java.util.Scanner;
public class NumberOfSentences1
 {
    public static void main(String args[]) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Paragraph:");
        String P=scan.nextLine();
        int b=0;
        for (int i=0; i<P.length(); i++) 
        {
            char ch = P.charAt(i);
            if (ch == '.' || ch == '?' || ch == '!') 
            {
                b++;
            }
        }
        String S[]=new String[b];
        int x=0, y=0;
        for (int i=0; i<P.length(); i++) 
        {
            char ch = P.charAt(i);
            if (ch == '.' || ch == '?' || ch == '!') 
            {
                if (y == 0)
                {
                    S[x++] = P.substring(y, i).trim();
                    y = i + 1;//points to the space after the .?! after the sentence
                }
                else 
                {
                    S[x++] = P.substring(y + 1, i).trim();//y+1 here points to first character of next Sentence
                    y = i + 1;//points to the space after the .?! after the sentence
                }
            }
        }
        for (int i=0; i<S.length; i++) 
        {
            System.out.println("Sentence: " + (i + 1));
            System.out.println(S[i]);
        }
        S[0] = S[0] + " ";
        int c = 0;
        for (int i=0; i<S[0].length(); i++)
        {
            char ch=S[0].charAt(i);
            if (ch == ' ') 
            {
                c++;
            }
        }

        String w[]=new String[c];
        int a=0;
        String wd="";
        for (int i=0; i<S[0].length(); i++)
        {
            char ch = S[0].charAt(i);
            if (ch != ' ') 
            {
                wd += ch;
            } else
            {
                w[a++] = wd;
                wd = "";
            }
        }
        System.out.println("Word" + "\t" +"Sentence"+ "\t" + "frequency");
        String d = "";
        for (int i=0; i<w.length; i++) 
        {
            String word=w[i];
            System.out.println(word);
            int cl=0;
            for (int j=1; j<S.length; j++) 
            {
                S[j]=S[j]+" ";
                d="";
                for (int k=0; k<S[j].length(); k++) 
                {
                    char ch = S[j].charAt(k);
                    if (ch != ' ')
                    {
                        d=d+ch;
                    } 
                    else 
                    {
                        if (word.equalsIgnoreCase(d)) 
                        {
                            cl++;
                        }
                        d = "";
                    }
                }
                if (cl != 0) 
                {
                    System.out.println("\t"+(j+1)+"\t" + cl);
                    cl=0;
                }
            }
        }
    }
}
