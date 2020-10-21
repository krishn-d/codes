public class Grade
{
	public static void main(String[] params)
	{
		System.out.println("Main invoked");
		arrayOfGrades();
		System.out.println("Main ended");
	}
	public static void arrayOfGrades()
	{
		char ashish='A';
		char bhuvan='B';
		char naman='C';
		char parv='D';
		char harsh='E';
		char abhi='F';
		char anubhav='A';
		char zakir='C';
		char gaurav='S';
		char aakash='S';
		
		char array[]={'A','B','C','D','E','F','A','C','S','S'};
		//order of array index is in order of intialization of variables 
		
		int sizeOfArray=array.length;
		System.out.println("Size of an Array=" +sizeOfArray);
		
		System.out.println("Grade of Bhuvan= "+array[1]);
		System.out.println("Grade of Anubhav= "+array[6]);
		System.out.println("Grade of Akash= "+array[9]);
	}
}