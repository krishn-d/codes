public class FinalVariable
{
	public static void main(String[] params)
	{
		final String aadharNumber="0000 XXXX XXXX 1234";
		System.out.println("Aadhar Number: "+aadharNumber);
		mobilenumber();
	}
	public static void mobilenumber()
	{
		final String mobileNumber;
		mobileNumber = "9876543210";
		System.out.println("Mobile Number: +91-"+mobileNumber);
	}
}