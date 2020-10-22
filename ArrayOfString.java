public class ArrayOfString
{
	public static void main(String[] params)
	{
		System.out.println("Main invoked");
		
		String[] states={
						 "Karnataka","Maharastra","Andrapradesh",
		                 "Kerala","Tamilnadu","Goa",
		                 "Gujarath","Rajastan","Punjab",
		                 "Dehli","J&K","UP",
		                 "Madyapradesh","Odissa","Assam"
						};
		
		arrayOfStates(states);
	}
	
	public static void arrayOfStates(String[] place)
	{
		System.out.println("States of India: " + place);
		
		System.out.println("Size of an array= " + place.length);
		
		System.out.println("States at index 0= "+place[0]);
		System.out.println("States at index 9: "+place[9]);
		System.out.println("States at index 14: "+place[14]);
	}
}