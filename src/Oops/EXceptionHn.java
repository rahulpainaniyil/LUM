package Oops;

public class EXceptionHn {

	public static void main(String[] args) {
	
		int a= 10;
		int b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch (Exception e)
		{
			System.out.println("Arithmetic EXception");
		 // System.out.println(e.getMessage());
		}
		System.out.println("Complete");
	}
}