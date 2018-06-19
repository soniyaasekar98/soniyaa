import java.io.*;
import java.util.*;
class vowel
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       //System.out.print
       char ch=sc.next( ).charAt(0);
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
       {
           System.out.print("vowels");
       }
       else if(ch>='a'&&ch<='z')
       {
           System.out.print("constant");
       }
       else
       {
           System.out.print("invalid");
       }
    }
}

