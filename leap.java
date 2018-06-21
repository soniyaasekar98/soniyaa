import java.io.*;
import java.util.*;
class leap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
if(x%4==0) && (x%100!=0)
{
System.out.print("yes");
}
else if(x%100==0)
{
System.out.print("no");
}
else if(x%400==0)
{
System.out.print("yes");
}
else 
{
System.out.print("no");
}
}
}|
