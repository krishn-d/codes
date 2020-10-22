public class ArrayEx1
{		
	public static void main(String[] params)
	{
		
		System.out.println("JVM invoked main");	
        
		String country="Australia";		
	  	
		countryName("India");		
		countryName(null);			
		
		countryName(country);
		
		System.out.println("main method exit");
	}
	
	public static void countryName(String name)
	{
		System.out.println("invoked countryName" + name);
	}	
}