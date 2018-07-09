import java.io.*;
import java.util.*;
class armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int onum,rem,result=0;
onum=num;
while(onum!=0)
{
rem=onum % 10;
result=Math.pow(rem,3);
onum /=10;
}
if(result==num)
{
System.out.print("true");
}
else
{
System.out.print("false");
}
}
}
