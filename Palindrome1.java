import java.io.*;
import java.util.*;
class Palindrome1 {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rint = 0, remainder, oint;

        oint = num;
        while( num != 0 )
        {
            remainder = num % 10;
            rint = rint * 10 + remainder;
            num  /= 10;
        }
        if (oint==rint)
            System.out.println(oint + " is a palindrome.");
        else
            System.out.println(oint + " is not a palindrome.");
    }
}
