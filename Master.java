public class Master
{
	public static void main(String[] params)
	{
		System.out.println("Main invoked");
		Slave.order();
		System.out.println("Main terminated");
	}

}