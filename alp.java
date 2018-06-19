import java.io.*;
import java.util.*;
class alp
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       char ch=sc.next( ).charAt(0);
       if(ch>='a'&&ch<='z')
       {
           System.out.print("yes");
       }
       else
       {
           System.out.print("no");
       }
    }
}
