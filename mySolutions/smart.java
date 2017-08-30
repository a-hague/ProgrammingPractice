import java.util.Scanner;
import java.util.ArrayList;
import java.math.*;

public class smart
{
    public static void main(String[] args)
    {
        ArrayList<Integer> primes;
        Scanner sc = new Scanner(System.in);

        primes = sieve(10000);

        int numNumbersToCheck = sc.nextInt();
        int nextNumberToCheck;

        for(int i=0; i<numNumbersToCheck; i++)
        {
            nextNumberToCheck = sc.nextInt();
            
            int index = 0;
            while(primes.get(index) < nextNumberToCheck)
            {
                index++;
            }

            int diff;
            if(index == 0) diff = Math.abs(nextNumberToCheck - primes.get(index));
            else diff = Math.min(Math.abs(nextNumberToCheck - primes.get(index-1)), Math.abs(nextNumberToCheck - primes.get(index)));

            System.out.println(nextNumberToCheck + " " + diff);
        }

        sc.close();
    }

    static ArrayList<Integer> sieve(int highestNumber)
    {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        boolean[] numList = new boolean[highestNumber+100];
        
        for(int i=2; i<highestNumber+100; i++)
        {
            if(numList[i] == false)
            {
                primes.add(primes.size(), i);
                markUsed(numList, i);
            }
        }

        return primes;
    }

    static void markUsed(boolean[] numList, int numToMark)
    {
        for(int i=numToMark; i<numList.length-1; i+=numToMark)
        {
            numList[i] = true;
        }
    }
}