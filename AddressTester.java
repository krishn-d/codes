public class AddressTester
{
	public static void main(String[] params)
	{
		System.out.println("Main invoked");
		
		short homeNo= Address.homeNo;
		System.out.println("House number: "+homeNo);
		
		byte streetNo= Address.streetNo;
		System.out.println("Street number: "+streetNo +" Cross");
		
		String landmark= Address.landmark;
		System.out.println("Landmark: "+landmark);
		
		String city= Address.city;
		System.out.println("City: "+city);
		
		int pinCode= Address.pinCode;
		System.out.println("Pin Code: "+pinCode);
		
		System.out.println("Exit :: Main");
	}

}