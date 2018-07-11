import java.io.*;
import java.util.*;
class Power {
public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int exponent=sc.nextInt();
        long result = 1;
        for (;exponent != 0; --exponent)
        {
            result *= base;
        }
        System.out.println("Answer = " + result);
    }
}
