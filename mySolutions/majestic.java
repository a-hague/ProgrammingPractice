import java.util.*;

public class majestic
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int numPlayers = sc.nextInt();

        int[] stats = new int[3];

        for(int i=0; i<numPlayers; i++)
        {
            stats[0] = sc.nextInt();
            stats[1] = sc.nextInt();
            stats[2] = sc.nextInt();

            System.out.println(stats[0] + " " + stats[1] + " " + stats[2]);
            
            int numStatsAbove10 = 0;
            
            if(stats[0] >= 10) numStatsAbove10++;
            if(stats[1] >= 10) numStatsAbove10++;
            if(stats[2] >= 10) numStatsAbove10++;

            if(numStatsAbove10 == 0) System.out.println("zilch\n");
            if(numStatsAbove10 == 1) System.out.println("double\n");
            if(numStatsAbove10 == 2) System.out.println("double-double\n");
            if(numStatsAbove10 == 3) System.out.println("triple-double\n");

        }

        sc.close();
    }
}