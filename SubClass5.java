package DISCRETE_PROJECT;
import java.math.BigInteger;
import java.util.Scanner;
public class SubClass5 extends SubClass4 {
    public static void Pascal(){
    Scanner sc = new Scanner(System.in);
    int row = 0;
        while(true)
        {
            System.out.print("Enter row value: ");
            String input = sc.next();
            try
            {
                row = Integer.parseInt(input);
                while((row>=501)||(row<=0))
                {
                    System.out.println("Invalid!");
                    System.out.println("Enter row value: ");
                    String input1 = sc.next();
                    try
                    {
                        row = Integer.parseInt(input1);
                    }
                    catch(NumberFormatException se)
                    {
                        System.out.println("This is not a number!");
                    }
                }
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("This is not a number!");
            }
        }
        
        BigInteger[] ans = pascal(row);
        
        for(BigInteger r: ans)
        {
            System.out.print(r + " ");
        }
        System.out.println(" ");
    }
    private static BigInteger[] pascal(int r1) 
    {
       BigInteger a = new BigInteger("1");
       BigInteger b = new BigInteger("1");
       BigInteger[] prev = {a,b};
       
       for (int r = 2; r <= r1; r++)
       {
           BigInteger[] next = new BigInteger[r+1];
           next[0] = a;
           for (int i = 1; i < r; i++)
           {
               next[i] = prev [ i -1 ].add(prev[i]);
           }
           next[r] = a;
           prev = next;
       }
       return prev;
    }
}

