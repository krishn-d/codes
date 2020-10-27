public class Age
{
	public static void main(String[] params)
	{
		System.out.println("Main invoked");
		int inputAge=14;
		System.out.println("Age input = "+inputAge);
		ageDefinition(inputAge);
		String output=Age.ageDefinition(inputAge);
		System.out.println("Age definition: "+output);
		System.out.println("Main end");
	}
	public static String ageDefinition(int age)
	{
		if(age<4 && age>0)
		{
			return "Children";
		}
		
		if(age<12 && age>4)
		{
			return "Kids";
		}
		
		if(age<19 && age>12)
		{
			return "Teens";
		}
		
		if(age<30 && age>19)
		{
			return "Adults";
		}
		
		if(age<100 && age>30)
		{
			return "Olds";
		}
		
		else
		{
			return "Not yet born or Immortal";
		}
		//return "Not valid data";	
	}
}	