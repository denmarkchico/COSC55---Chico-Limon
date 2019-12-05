package DISCRETE_PROJECT;
import java.math.BigInteger;
import java.util.Scanner;
public class SubClass4 extends SubClass3{
    public static void Stirling()
    {
        long N =0 , R=0;
        Scanner sc = new Scanner(System.in);
	System.out.println("STIRLING NUMBER");
	while(true)
        {
            System.out.print("Enter N value: ");
            String input = sc.next();
            try
            {
                N = Long.parseLong(input);
                while((N>=501) || (N<=0))
                {
                    System.out.println("Invalid! ");
                    System.out.print("Enter N value: ");
                    String input1 = sc.next();
                    try
                    {
                        N = Long.parseLong(input1);
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
       while(true)
       {
           System.out.print("Enter R value: ");
           String input2 = sc.next();
           try
           {
               R = Long.parseLong(input2);
               while((R>=501)||(R<=0))
               {
                   System.out.println("Invalid!");
                   System.out.print("Enter R value: ");
                   String input3 = sc.next();
                   try
                   {
                       R = Long.parseLong(input3);
                   }
                   catch(NumberFormatException se)
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
        
        System.out.println("FINAL ANSWER: " + stirling(N, R));
        
    }
    public static BigInteger stirling(long n1,long r1){
        long j = r1;
        long rfact = r1;
        BigInteger fact = new BigInteger("1");
        BigInteger total = new BigInteger("0");
        BigInteger answer = new BigInteger("0");
        
        for(int i = 0;i<r1;i++){
            total=total.add(stirling1(n1,r1,i,j));
            j--;
        }
        System.out.println("\nSum of all processed numbers: "+total);
        
        //For R!
        for(int i = 1;i<=rfact;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println("R! = "+fact);
        answer=total.divide(fact);
        
        System.out.println("\nSum of all numbers / R!\n");
        
        return answer;
    }
    public static BigInteger stirling1(long n1, long r1,long subs,long Temp1){
        
        long num = n1;
        
        //Substitute
        long T = subs; 
	//Combination Substitutes
	long N = r1;
	long R = 0;
	
	//Power Substitute
	long r = r1;
	long J = 0;
	long sub1 = r - subs;
		
	//Power Formula
        int power = 1;
	int multi = -1;
	
	//For Combination Formulas
	BigInteger nfact = new BigInteger("1");
	BigInteger rfact = new BigInteger("1");
	BigInteger nlessr = new BigInteger("1");
	BigInteger finalcomb;
	long C = N - subs;
	BigInteger result1;
        
        //forPowerMultiplierFormulas2
        BigInteger powresult = new BigInteger("1");
        
        //CompiledFormulas
        BigInteger sum1 = new BigInteger("0");
	BigInteger totalsum = new BigInteger("0");
        System.out.println(" ");
        //for(-1)^J
        for(;T<=r1;T++){
            power *= multi;
        }
        System.out.println("(-1)^i = "+ power);
        
        //Combination formula
        // n!
        for(long i = 1;i<=N;i++){
            nfact = nfact.multiply(BigInteger.valueOf(i));
        }
        // r!
        for(long i = 1;i<=subs;i++){
            rfact = rfact.multiply(BigInteger.valueOf(i));
        }
        //(n-r)!
        for(long i=1 ; i<=C ; i++ ){
            nlessr = nlessr.multiply(BigInteger.valueOf(i));
        }
        
        //r!(n-r)!
        result1 = rfact.multiply(nlessr);
        
        //n!/r!(n-r)!
        finalcomb = nfact.divide(result1);
        
        //For (R-i)^N
        while(n1 != 0){
            powresult = powresult.multiply(BigInteger.valueOf(sub1));
            n1--;
        }
        
        //multiplying (-1)^i * (J Choose i) * (J - i)^n
        sum1 = finalcomb.multiply(BigInteger.valueOf(power));
        totalsum = sum1.multiply(powresult);
        
        //CHECK
        System.out.println(N+"C"+subs+" = "+finalcomb);
	System.out.println(r+" - "+subs+" = "+ sub1 );
	System.out.println("("+ sub1 +")^" +num+" = "+powresult);
        
	return totalsum;
    }
    
}

