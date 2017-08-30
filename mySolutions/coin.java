import java.util.Scanner;

public class coins
{
    public static void main(String[] args)
    {
        int numberOfSets;
        int numCoinsInSet;
        int[] coins;
        Scanner sc = new Scanner(System.in);
        boolean badSet;

        numberOfSets = sc.nextInt();

        for(int i=0; i<numberOfSets; i++)
        {
            badSet = false;
            numCoinsInSet = sc.nextInt();
            coins = new int[numCoinsInSet];
            for(int j=0; j<numCoinsInSet; j++)
            {
                coins[j] = sc.nextInt();
            }

            for(int j=0; j<numCoinsInSet-1; j++)
            {
                if(coins[j+1] < 2*coins[j]) badSet = true;
            }

            if(badSet) System.out.println("1");
            else System.out.println("0");
        }


        sc.close();
    }
}