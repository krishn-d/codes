public class ReportStatus
{
	public static void main(String[] params)
	{
		System.out.println("Main invoked");
		double inputPercentage=45;
		System.out.println("Percentage= "+inputPercentage);
		report(inputPercentage);
		String output=ReportStatus.report(inputPercentage);
		System.out.println("Report status: "+output);
		System.out.println("Main end");
	}
	public static String report(double percentage)
	{
		if(percentage<35 && percentage>0)
		{
			return "Fail";
		}
		if(percentage<60 && percentage>=35)
		{
			return "Second class";
		}
		if(percentage<85 && percentage>=60)
		{
			return "First class";
		}
		if(percentage<100 && percentage>=85)
		{
			return "Distinction";
		}
		return "Pass";
	}
}