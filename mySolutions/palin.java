import java.util.Scanner;
import java.util.HashMap;

public class palin
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Character> dictionary = new HashMap<Character, Character>();
        int numCases;
        int numPhonemes;
        int numPalindromes;

        numCases = sc.nextInt();

        for(int i=0; i<numCases; i++)
        {
            System.out.println("Test case #" + (i+1) +":");
            numPhonemes = sc.nextInt();
            
            for(int j=0; j<numPhonemes; j++)
            {
                char phoneme1 = sc.next().charAt(0);
                char phoneme2 = sc.next().charAt(0);

                dictionary.put(phoneme1, phoneme2);
                dictionary.put(phoneme2, phoneme1);

            }

            numPalindromes = sc.nextInt();
 
            for(int j=0; j<numPalindromes; j++)
            {
                String palindrome = sc.next();

                for(int k=0; k<palindrome.length()/2+1; k++)
                {
                    if(palindrome.charAt(k) != palindrome.charAt(palindrome.length()-k-1)) System.out.println(palindrome + " NO");
                    else System.out.println(palindrome + " YES");
                }
            }

        }
        
        sc.close();
    }
}