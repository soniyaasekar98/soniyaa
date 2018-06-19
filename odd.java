import java.io.*;
import java.util.*;
class odd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%2==0)
{
System.out.print("even");
}
else if(n<0)
{
System.out.print("invalid");
}
  else
  {
    System.out.print("odd");
  }
}
}
