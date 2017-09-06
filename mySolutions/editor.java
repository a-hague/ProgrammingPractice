import java.util.Scanner;

public class editor {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int numCases = sc.nextInt();
		
		for(int i=0; i<numCases; i++)
		{
			int numLines = sc.nextInt();
			int[] lineLengths = new int[numLines];
			
			for(int j=0; j<numLines; j++)
			{
				lineLengths[j] = sc.nextInt();
			}
			
			int cursorY = sc.nextInt();
			int cursorX = sc.nextInt();
		}
		
	}
	
}
