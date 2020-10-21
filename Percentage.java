public class Percentage
{
	public static void main(String[] params)
	{
		System.out.println("Main Invoked");
		arrayOfPercentage();
	}
	public static void arrayOfPercentage()
	{
		float chandler=89.51f;
		float monica=91.22f;
		float rachel=85.63f;
		float ross=82.44f;
		float pheobe=88.75f;
		float joey=90.89f;
	
		float array[]={chandler,monica,rachel,pheobe,ross,joey,};
		int sizeOfArray=array.length;
		System.out.println("Array size = "+sizeOfArray);
		System.out.println("Chandler's Percentage = "+array[1]"%");
		System.out.println("Joey's Percentage = "+array[5]);
		System.out.println("Pheobe's Percentage = "+array[3]);
	}
}