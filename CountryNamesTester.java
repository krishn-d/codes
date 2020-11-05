public class CountryNamesTester
{
	public static void main(String[] params)
	{
		System.out.println("Main invoked");
		
		String countryName1= CountryNames.countryName1;
		System.out.println(countryName1);
		
		String countryName2= CountryNames.countryName2;
		System.out.println(countryName2);
		
		String countryName3= CountryNames.countryName3;
		System.out.println(countryName3);
		
		String countryName4= CountryNames.countryName4;
		System.out.println(countryName4);
		
		String countryName5= CountryNames.countryName5;
		System.out.println(countryName5);
		
		changedValues();
		System.out.println("Exit :: Main");
	}
	public static void changedValues()
	{
		CountryNames.countryName1= "ISTANBUL";
		String countryName1= CountryNames.countryName1;
		System.out.println(countryName1);
		
		CountryNames.countryName2= "CHINA";
		String countryName2= CountryNames.countryName2;
		System.out.println(countryName2);
		
		CountryNames.countryName3= "JAPAN";
		String countryName3= CountryNames.countryName3;
		System.out.println(countryName3);
		
		CountryNames.countryName4= "NEPAL";
		String countryName4= CountryNames.countryName4;
		System.out.println(countryName4);
		
		CountryNames.countryName5= "NORTH KOREA";
		String countryName5= CountryNames.countryName5;
		System.out.println(countryName5);
	}

}