import java.util.Scanner;

public class darts {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int numCases = sc.nextInt();
		
		for(int i=0; i<numCases; i++)
		{
			int pointValues = 0;
			
			int numWedges = sc.nextInt();
			int radius1 = sc.nextInt();
			int radius2 = sc.nextInt();
			int radius3 = sc.nextInt();
			
			int numShots = sc.nextInt();
			double[][] shots = new double[numShots][2];
			double[] angles = getAngles(numWedges);
			
			for(int j=0; j<numShots; j++)
			{
				shots[j][0] = sc.nextDouble();
				shots[j][1] = sc.nextDouble();
			}
			
			for(int j=0; j<numShots; j++)
			{
				
				double angle = Math.toDegrees(Math.atan2(shots[j][1],shots[j][0]));
				
				if(angle < 0) angle = 360.0 + angle;
				
				double distance = getDistance(shots[j][0], shots[j][1]);
				if(distance > radius3)
				{
					continue;
				}
				if(distance <= radius1)
				{
					pointValues += 50;
					continue;
				}

				int shotValue = 0;
				for(int k=0; k< angles.length; k++)
				{
					if(angles[k] > angle)
					{
						shotValue = k+1;
						break;
					}
				}
				if(distance <= radius2)
				{
					shotValue *= 2;
				}
				pointValues += shotValue;
			}
			System.out.println(pointValues);
		}
		sc.close();
	}

	static double getDistance(double pointx, double pointy)
	{
		double distance = 0;
		distance = Math.sqrt(Math.pow(pointx, 2) + Math.pow(pointy, 2));
		return distance;
	}
	
	static double[] getAngles(int numWedges)
	{
		double[] angles = new double[numWedges];
		
		for(int i=0; i<numWedges; i++)
		{
			angles[i] = (360.0/numWedges) * (i+1);
		}
		return angles;
	}
}
