package DISCRETE_PROJECT;
import java.math.*;
import java.util.Scanner;
public class SubClass3 extends SubClass2 {
    public void PermutationWithRepetition(){
        Scanner sc = new Scanner(System.in);
        int r = 0;
        int a=0;
        System.out.println("Permutation with Repetition");
       while(true)
       {
           System.out.print("Enter n: ");
           String input = sc.next();
           try
           {
               a = Integer.parseInt(input);
               while((a>=501) || (a<=0))
               {
                   System.out.println("Invalid");
                   System.out.print("Enter n: ");
                   String input1 = sc.next();
                   try
                   {
                       a=Integer.parseInt(input1);
                   }
                   catch(NumberFormatException e)
                   {
                       System.out.println("This is not a number! ");
                   }
                   
               }
               break;
           }
           catch(NumberFormatException e)
           {
               System.out.println("This is not a number!");
           }
       }
       while(true)
       {
           System.out.print("Enter r: ");
           String input2 = sc.next();
           try
           {
                r = Integer.parseInt(input2);
               while((r>=501) || (r<=0))
               {
                   System.out.println("Invalid");
                   System.out.print("Enter r: ");
                   String input3 = sc.next();
                   try
                   {
                       r=Integer.parseInt(input3);
                   }
                   catch(NumberFormatException e)
                   {
                       System.out.println("This is not a number! ");
                   }
               }
               break;
           }
           catch(NumberFormatException e)
           {
               System.out.println("This is not a number!"); 
           }
       }
        BigInteger n = BigInteger.valueOf(a);
        if(a>r)
        {
            System.out.println("Permutation: " + pow(n,r));
        }
        else
        {
            System.out.println("Invalid!");
        }
    }
    public static BigInteger pow(BigInteger n, int r)
    {
        int ans = 1;
        BigInteger res = BigInteger.valueOf(ans);
        
        for(int i = 0;i < r; i++)
        {
            res = res.multiply(n);
        }
        return res;
    }
    
}
