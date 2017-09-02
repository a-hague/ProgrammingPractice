import java.util.ArrayList;
import java.util.Scanner;

public class tippit
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int numTips;

        numTips = sc.nextInt();

        for(int i=0; i<numTips; i++)
        {
            int nextTip = sc.nextInt();
            int tipAmount = 0;
            int totalCost = 0;

            tipAmount = (int)Math.ceil(nextTip * 0.2);

            totalCost = nextTip + tipAmount;

            while(!isPalindrome(totalCost))
            {
                totalCost++;
            }

            tipAmount = totalCost - nextTip;

            System.out.println("Input cost: " + nextTip);
            System.out.println(tipAmount + " " + totalCost);
            System.out.println();
        }

        sc.close();
    }

    static boolean isPalindrome(int totalCost)
    {
        String palindrome = Integer.toString(totalCost);
        for(int i=0; i<palindrome.length()/2; i++)
        {
            if(palindrome.charAt(i) != palindrome.charAt(palindrome.length()-1-i)) return false;
        }

        return true;
    }
}