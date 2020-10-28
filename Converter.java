public class Converter
{
	public static void main(String[] params)
	{
		System.out.println("Main invoked");
		String convParams=params[0];	
		byte convByte=Byte.parseByte(convParams);
		System.out.println("Converted byte= "+convByte);
		short convShort=Short.parseShort(convParams);
		System.out.println("Converted short= "+convShort);
		int convInt=Integer.parseInt(convParams);
		System.out.println("Converted int= "+convInt);
		long convLong=Long.parseLong(convParams);
		System.out.println("Converted long= "+convLong);
		float convFloat=Float.parseFloat(convParams);
		System.out.println("Converted float= "+convFloat);
		double convDouble=Double.parseDouble(convParams);
		System.out.println("Converted double= "+convDouble);
		boolean convBoolean=Boolean.parseBoolean(convParams);
		System.out.println("Converted Boolean= "+convBoolean);
		//char convChar=Character.ParseChar(convParams);
		//System.out.println("Converted char= "+convChar);
		System.out.println("Main end");
	}

}