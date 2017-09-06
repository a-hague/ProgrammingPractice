import java.util.Scanner;

public class energy {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int lowRate;
		int highRate;
		int numCases;
		
		lowRate = sc.nextInt();
		highRate = sc.nextInt();
		numCases = sc.nextInt();
		
		for(int i=0; i<numCases; i++)
		{
			int kwh = sc.nextInt();
			
			if(kwh <= 1000)
			{
				System.out.println(kwh + " " + kwh*lowRate);
			}
			else
			{
				int originalkwh = kwh;
				int overflow = kwh - 1000;
				kwh -= overflow;
				int total = ((kwh*lowRate)+(overflow*highRate));
				
				System.out.println(originalkwh +  " " + total);
			}
		}
	}
	
}
