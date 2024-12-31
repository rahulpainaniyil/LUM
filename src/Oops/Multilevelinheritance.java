package Oops;
class Dogs
{
	public void Barking()
	{
		System.out.println("Dog is Barking");	
	}
}
class Cats extends Dog
{
	public void Sleeping()
	{
		System.out.println("Cat is Sleeping ");	
	}
}
class Cat2 extends Cat
{
	public void Playing()
	{
		System.out.println("Cats is Playing ");	
	}
}

class Dog2 extends Cat2
{
	public void Running()
	{
		System.out.println("Dog2 is Running ");	
	}
}


public class Multilevelinheritance {

	public static void main(String[] args) {
		Dog2 b=new Dog2();
		b.Barking();
		b.Sleeping();
		b.Playing();
		b.Running();
		

	}

}
