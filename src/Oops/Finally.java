package Oops;

public class Finally {

	public static void main(String[] args) {
		System.out.println("Start");
		try
		{
			int a=10;
			System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("It,s Finally");
		}
		System.out.println("Stop");
	}
}