import java.util.ArrayList;
import java.util.Scanner;

public class typing {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int numWords = sc.nextInt();
		
		for(int i=0; i<numWords; i++)
		{
			String word1 = sc.next();
			String word2 = sc.next();
			
			word1 = word1.trim();
			word2 = word2.trim();
			
			if(word1.length() != word2.length()) 
			{
				System.out.println("3");
				continue;
			}
			
			if(word1.equals(word2))
			{
				System.out.println(1);
				continue;
			}
			
			char[] word1chars = word1.toCharArray();
			char[] word2chars = word2.toCharArray();
			
			boolean isSimilar = true;
			
			for(int j=0; j<word1chars.length; j++)
			{
				if(word1chars[j] != word2chars[j])
				{
					if(!checkAdjacent(word1chars[j], word2chars[j]))
					{
						isSimilar = false; 
						break;
					}
				}
			}
			
			if(isSimilar) System.out.println("2");
			else System.out.println("3");
		}
		
		
	}

	static boolean checkAdjacent(char letter1, char letter2)
	{
		boolean isAdjacent = false;
		
		char[][] letters = {{'a','b','c','d','e','f','g','h','i'},{'j','k','l','m','n','o','p','q','r'},{'s','t','u','v','w','x','y','z','.'}};
		
		int letter1X = -1, letter1Y=-1, letter2X=-1, letter2Y=-1;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(letters[i][j] == letter1)
				{
					letter1X = i;
					letter1Y = j;
				}
				if(letters[i][j] == letter2)
				{
					letter2X = i;
					letter2Y = j;
				}
			}
		}
		
		if(Math.abs(letter1X-letter2X) <= 1 && Math.abs(letter1Y-letter2Y) <=1)
		{
			isAdjacent = true;
		}
		
		return isAdjacent;
	}
	
}
