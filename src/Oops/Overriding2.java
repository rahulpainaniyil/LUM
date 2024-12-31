package Oops;

class Parent 
{
	public void Phone ()
	{
		System.out.println("Nokia");
	}
}
class Child extends Parent 
{
	public void Phone ()
	{
		super.Phone();
		System.out.println("Samsung");
	}
}
public class Overriding2 {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.Phone();
	}
}  
	