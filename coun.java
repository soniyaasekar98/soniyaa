import java.util.*;
class coun
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int s=sc.nextInt();
       int b=sc.nextInt();
       int a[]=new int[s];
       int sum=0;
       int i,j;
       for(i=0;i<a.length;i++)
       {
           a[i]=sc.nextInt();
       }
       for(i=0;i<b;i++)
       {
           sum=sum+a[i];
       }
           System.out.print(sum);
    }
}
