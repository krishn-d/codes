public class AgeDefiner
{
	public static void main(String[] params)
	{
		System.out.println("Main invoked");
		String ageInString=params[0];
		int convParams=Integer.parseInt(ageInString);
		System.out.println("Age input = "+convParams);
		ageDefinition(convParams);
		String output=AgeDefiner.ageDefinition(convParams);
		System.out.println("Age definition: "+output);
		System.out.println("Main end");
	}
	public static String ageDefinition(int age)
	{
		if(age>=0 && age<=4)
		{
			return "Children";
		}
		
		if(age>4 && age<=12)
		{
			return "Kids";
		}
		
		if(age>12 && age<=19)
		{
			return "Teens";
		}
		
		if(age>19 && age<=50)
		{
			return "Adults";
		}
		
		if(age>50 && age<=100)
		{
			return "Olds";
		}
		return "Not valid data";	
	}
}	