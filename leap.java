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
System.out.print("leap year");
}
else if(x%100==0)
{
System.out.print("not leap year");
}
else if(x%400==0)
{
System.out.print("leap year");
}
else 
{
System.out.print("not leap year");
}
}
}|
