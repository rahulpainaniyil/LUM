package Oops;
interface BMW
{
	void bmwtopspeed ();
	void bmwcolour ();
	void bmwprice ();
}
interface BENZ
{
	void benztopspeed ();
	void benzcolour ();
	void benzprice ();
}
class CAR implements BMW,BENZ
{
	@Override
	public void benztopspeed() 
	{
		System.out.println("Speed  :230 p/h");
	}

	@Override
	public void benzcolour() 
	{
		System.out.println("Colour :Black");	
	}

	@Override
	public void benzprice() 
	{
		System.out.println("Price  :3000000");
	}

	@Override
	public void bmwtopspeed() 
	{
		System.out.println("Speed  :220 p/h");
	}

	@Override
	public void bmwcolour() 
	{
		System.out.println("Colour :Red");
	}

	@Override
	public void bmwprice() 
	{
		System.out.println("Price  :2000000");	
	}
		
}	
public class MultipleInheritance {

	public static void main(String[] args) {
		CAR ob=new CAR();
		System.out.println("BENZ");
		System.out.println("-----");
		ob.benzcolour();
		ob.benzprice();
		ob.benztopspeed();
		System.out.println("");
		System.out.println("BMW");
		System.out.println("-----");
		ob.bmwcolour();
		ob.bmwprice();
		ob.bmwtopspeed();	
	}
}