public class PlaceFinder
{
	public static void main(String[] params)
	{
		System.out.println("Main invoked");
		String distance=params[0];
		int convDistn=Integer.parseInt(distance);
		place(convDistn);
		String placeName=PlaceFinder.place(convDistn);
		System.out.println("Place from Bengaluru is "+placeName);
		System.out.println("Exit main");		
	}
	public static String place(int distn)
	{
		if(distn==100)
		{
			return "Mandya";
		}
		if(distn==150)
		{
			return "Mysore";
		}
		if(distn==350)
		{
			return "Mangaluru";
		}
		if(distn==70)
		{
			return "Tumakuru";
		}
		if(distn==300)
		{
			return "Shivmogga";
		}
		if(distn==500)
		{
			return "Belagavi";
		}
		if(distn==400)
		{
			return "Hubballi";
		}
		if(distn==450)
		{
			return "Gadag";
		}
		if(distn==200)
		{
			return "Chitradurga";
		}
		if(distn==650)
		{
			return "Kalburgi";
		}
		if(distn==250)
		{
			return "Davangeri";
		}
		if(distn==700)
		{
			return "Bidar";
		}
		if(distn==525)
		{
			return "Vijaypur";
		}
		if(distn==175)
		{
			return "Chamarajnagar";
		}
		if(distn==550)
		{
			return "Hassan";
		}
		return "Not found";
	}
}