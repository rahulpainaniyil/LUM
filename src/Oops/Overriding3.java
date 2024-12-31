package Oops;
class Car 
   {
public void speed ()
{
System.out.println("car speed");
}

public void power ()
{
	System.out.println("car power");
}   
}
class BMW extends Car
{
	@Override
	public void speed() {
		System.out.println("BMW  speed");
		super.speed();
	}
	@Override
	public void power() {
		System.out.println("BMW  power");
		super.power();
	}	
}
public class Overriding3 {

	public static void main(String[] args) {
		BMW B=new BMW ();
		B.speed();
		B.power();
	}
}