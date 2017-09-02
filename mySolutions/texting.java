import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class texting
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int numAbbreviations;
        int numSentances;

        HashMap<String, String> abbreviations = new HashMap<String, String>();
        numAbbreviations = sc.nextInt();
        
        for(int i=0; i<numAbbreviations; i++)
        {
            String abbreviation = sc.next();
            String definition = sc.nextLine();

            abbreviations.put(abbreviation, definition);
        }

        numSentances = Integer.parseInt(sc.nextLine());

        for(int i=0; i<numSentances; i++)
        {
            String line = sc.nextLine();
            String[] words = line.split(" ");
            String outputLine = "";

            for(String word : words)
            {
                if(abbreviations.containsKey(word))
                {
                    word = abbreviations.get(word);
                    word = word.trim();
                }

                outputLine += (word + " ");
            }
            outputLine = outputLine.trim();
            System.out.println(outputLine);
        }
        
        sc.close();
    }
}