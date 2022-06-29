import java.util.Scanner;
public class Project5 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		final int SENTINEL = -1;
		int setting = 3;
		int prevSetting = setting;
		int numNegChange = 0;
		int numPosChange = 0;
		int noChange = 0;
		int oneCount = 0;
		int twoCount = 0;
		int threeCount = 0;
		int fourCount = 0;
		int fiveCount = 0;
		
		System.out.println("Response Dial Simulator");
		System.out.println("-----------------------");
		System.out.println("Initial setting: " + setting);
		System.out.println("Enter the next setting (1-5) or -1 to stop.");
		
		setting = keyboard.nextInt();
		keyboard.nextLine();
		
		
		
		while (setting != SENTINEL)
		{
			// Value counter
			if (setting == 1)
			{
				oneCount++;
			}
			else if (setting == 2)
			{
				twoCount++;
			}
			else if (setting == 3)
			{
				threeCount++;
			}
			else if (setting == 4)
			{
				fourCount++;
			}
			else if (setting == 5)
			{
				fiveCount++;
			}
			
			
			// Type of change
			if (setting > prevSetting)
			{
				numPosChange++;
				System.out.println("Positive change: " + prevSetting + " to " + setting);
			}
			else if (setting < prevSetting)
			{
				numNegChange++;
				System.out.println("Negative change: " + prevSetting + " to " + setting);
			}
			else if (setting == prevSetting)
			{
				noChange++;
				System.out.println("No change: " + prevSetting + " to " + setting);
			}
			
			System.out.println("Current setting: " + setting);
			
			// Set previous value and obtain new value
			prevSetting = setting;
			System.out.println("Enter the next setting (1-5) or -1 to stop.");
			setting = keyboard.nextInt();
			keyboard.nextLine();
			
		}
		
		// Summary
		System.out.println("Response Summary");
		System.out.println("----------------");
		System.out.println("1 was chosen " + oneCount + " time(s).");
		System.out.println("2 was chosen " + twoCount + " time(s).");
		System.out.println("3 was chosen " + threeCount + " time(s).");
		System.out.println("4 was chosen " + fourCount + " time(s).");
		System.out.println("5 was chosen " + fiveCount + " time(s).");
		System.out.println();
		System.out.println("Positive changes: " + numPosChange);
		System.out.println("Negative changes: " + numNegChange);
		System.out.println("No changes: " + noChange);
		
	}

}
