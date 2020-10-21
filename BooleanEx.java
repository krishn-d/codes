public class BooleanEx
{
	public static void main(String[] params)
	{
		System.out.println("Main invoked");
		arrayOfTrueFalse();
		System.out.println("Main ended");
	}
	public static void arrayOfTrueFalse()
	{
		boolean array[]={true,false,true};
		
		int sizeOfArray=array.length;
		System.out.println("Size of an Array=" +sizeOfArray);
		
		System.out.println("Bangaluru is in Karnataka= "+array[0]);
		System.out.println("Metals are living things= "+array[1]);
		System.out.println("Delhi is capital of India= "+array[2]);
	}
}