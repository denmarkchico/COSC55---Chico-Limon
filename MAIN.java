package DISCRETE_PROJECT;
import java.util.*;
public class MAIN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        SuperClass SuperClass = new SuperClass();
        
        System.out.println("Select Program: \n 1.) Combination \n 2.) Permutation \n 3.) Stirling \n 4.) Pascal Triangle Generator \n 5.) Exit");
        
        int choiceMenu = 0;
            while(true)
            {
                try
                {   System.out.print("Enter Your Choice: ");
                    String ans1 = scan.next();
                    choiceMenu = Integer.parseInt(ans1);
                    break;
                }catch(NumberFormatException e)
                {
                    System.out.println("This is not a number!");
                }
            }
        while(choiceMenu != 5)
        {
            int permu =0;
            int combi = 0;
            if(choiceMenu == 1)
            {
                System.out.println("1.)With Repetitiion \n2.)Without Repetition");
                while(true)
                {
                    System.out.print("Enter your Choice: ");
                    String input = scan.next();
                    try
                    {
                        combi = Integer.parseInt(input);
                        break;
                    }catch(NumberFormatException e)
                    {
                        System.out.println("This is not a number! ");
                    }
                }
                while(combi>=3)
                    {
                        System.out.print("Please enter 1 or 2 only \nEnter your Choice: ");
                        combi = scan.nextInt();
                    }
                        if(combi==1)
                        {
                            SuperClass.CombinationWithRepetition();
                            Exit();
                        }
                        else if(combi==2)
                        {
                            SuperClass.CombinationWithoutRepitition(); 
                            Exit();
                        }
            }
            else if(choiceMenu == 2)
            {
                System.out.println("1.)With Repetitiion \n2.)Without Repetition");
                while(true)
                {
                    System.out.print("Enter your Choice: ");
                    String input = scan.next();
                    try
                    {
                        permu = Integer.parseInt(input);
                        break;
                    }catch(NumberFormatException e)
                    {
                        System.out.println("This is not a number! ");
                    }
                }
                while(permu>=3)
                    {
                        System.out.print("Please enter 1 or 2 only \nEnter your Choice: ");
                        permu = scan.nextInt();
                    }
                        if(permu==1)
                        {
                            SuperClass.PermutationWithRepetition();
                            Exit();
                        }
                        else if(permu==2)
                        {
                            SuperClass.PermutationWithoutRepitition(); 
                            Exit();
                        }
            }
            else if(choiceMenu==3)
            {
                SuperClass.Stirling();
                Exit();
            }
            else if (choiceMenu == 4)
            {
                SuperClass.Pascal();
                Exit();
            }
            else 
            {
                System.out.println("Please enter 1,2,3,4 or 5 only");
                main(null);
            }
        }
        System.out.println("Thankyou!");
    }
    public static void Exit()
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("Do You Want to Continue? [Y/N]: ");
        String cont = scan.next();
        
        if(!cont.matches("[a-zA-Z]"))
        {
            System.out.println("Please Enter Y/N only");
            Exit();
        }
        else if(cont.matches("[a-zA-Z]"))
        {
            if((cont.equals("y")) || (cont.equals("Y")))
            {
                main(null);
            }
            else if((cont.equals("n")) || (cont.equals("N")))
            {
                System.out.println("Thankyou! ");
                System.exit(0);
            }
            else 
            {
                System.out.println("Please Enter Y/N only");
                Exit();
            }
        }
    }
}


