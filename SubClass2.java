package DISCRETE_PROJECT;
import java.math.BigInteger;
import java.util.*;
public class SubClass2 extends SubClass1  {
    Scanner sc = new Scanner(System.in);
    
    public void PermutationWithoutRepitition()
    {
     System.out.println("Permutation without Repetition");
        BigInteger b1 = new BigInteger("1");
        BigInteger b2 = new BigInteger("1");
        BigInteger b3 = new BigInteger("1");
        BigInteger sum;
        Scanner sc = new Scanner(System.in);
        
        int n=0,r=0;
        while(true)
            {
                System.out.print("Enter n:  ");
                String input = sc.next();
                try
                    {
                      n = Integer.parseInt(input);
                       while(n>=501 || n<=0)
                       {
                           System.out.println("Invalid");
                           System.out.print("Enter n: ");
                           String input1 = sc.next();
                           
                           try
                           {
                               n = Integer.parseInt(input1);
                               
                           }
                           catch(NumberFormatException w)
                           {
                               System.out.println("This is not a number");
                           }
                       }
                       break;
                    }
                catch (NumberFormatException ne)
                    {
                        System.out.println("This is not a number ");

                    }
               
            }
            while(true)
            {
                System.out.print("Enter r:  ");
                String input = sc.next();
                try
                    {
                      r = Integer.parseInt(input);
                       while(r>=501 || r<=0)
                       {
                           System.out.println("Invalid");
                           System.out.print("Enter r: ");
                           String input1 = sc.next();
                           
                           try
                           {
                               r = Integer.parseInt(input1);
                               
                           }
                           catch(NumberFormatException w)
                           {
                               System.out.println("This is not a number");
                           }
                       }
                       break;
                    }
                catch (NumberFormatException ne)
                    {
                        System.out.println("This is not a number ");

                    }
               
            }
        
        int nr = n - r;
        if(n<=500 && r <=500)
        {
        for(int i = 2; i <= n; i++)
        {
            b1 = b1.multiply(BigInteger.valueOf(i));
        }
        for(int j = 2; j <= r; j++)
        {
            b2 = b2.multiply(BigInteger.valueOf(j));
        }
        for(int k = 2; k <= nr; k++)
        {
            b3 = b3.multiply(BigInteger.valueOf(k));
        }
        
        sum = b1.divide(b3);
        
        System.out.println("Permutation: " + sum);
    }
        if(n>=501 || r>=501)
    {
        System.out.println("The number you entered exceeded the number limit");
    }
    }   
}
