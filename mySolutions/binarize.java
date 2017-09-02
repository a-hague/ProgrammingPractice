import java.util.ArrayList;
import java.util.Scanner;

public class binarize
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int numNumbers;
        ArrayList<Integer> powersOfTwo = new ArrayList<Integer>();

        int index = 0;
        for(int i=2; i<200000; i*=2)
        {
            powersOfTwo.add(index++,i);
        }

        numNumbers = sc.nextInt();

        for(int i=0; i<numNumbers; i++)
        {
            int nextNumber = sc.nextInt();
            index = 0;
            while(powersOfTwo.get(index) < nextNumber)
            {
                index++;
            }

            System.out.println("Input value: " + nextNumber);
            System.out.println(powersOfTwo.get(index));
            System.out.println();
        }

    }
}