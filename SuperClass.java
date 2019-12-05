package DISCRETE_PROJECT;
import java.util.*;
import java.math.BigInteger;
class SuperClass extends SubClass5 {
    public void CombinationWithRepetition()
    {
        BigInteger b1 = new BigInteger("1");
        BigInteger b2 = new BigInteger("1");
        BigInteger b3 = new BigInteger("1");
        BigInteger b4 = new BigInteger("1");
        BigInteger sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Combination without Repetition");
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
                String input2 = sc.next();
                try
                    {
                      r = Integer.parseInt(input2);
                       while(r>=501 || r<=0)
                       {
                           System.out.println("Invalid");
                           System.out.print("Enter a: ");
                           String input3 = sc.next();
                           
                           try
                           {
                               r = Integer.parseInt(input3);
                               
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
        
        int nr = (n + (r - 1));
        int n1 = n - 1;
        
        for(int j = 2; j <= r; j++)
        {
            b2 = b2.multiply(BigInteger.valueOf(j));
        }
        for(int k = 2; k <= nr; k++)
        {
            b3 = b3.multiply(BigInteger.valueOf(k));
        }
        for(int l = 2; l <= n1; l++)
        {
            b4 = b4.multiply(BigInteger.valueOf(l));
        }
        
        sum = b3.divide((b2.multiply(b4)));
        System.out.println("Combination: " + sum);
        
    }
}
