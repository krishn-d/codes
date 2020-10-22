public class ArrayEx2
{	
	public static void main(String[] politicians)
	{
		System.out.println("Main invoked");		
		String[] ministersArray={"BSY",
								 "Yogi Adityanath",
								 "Jagan Mohan Reddy",
								 "Uddav Thackeray",
								 "Kejriwal"};
		chiefMinisters(ministersArray);		
		System.out.println("exit main ");
	}		
	
	public static void chiefMinisters(String[] names)
	{	
		System.out.println("cheifMinisters "+ names );		
		int size=names.length;
		System.out.println(size);
		System.out.println("Chief Minister @ index 0 "+names[0]);
		System.out.println("Chief Minister @ index 1 "+names[1]);
		System.out.println("Chief Minister @ index 4 "+names[4]);
	}
}
