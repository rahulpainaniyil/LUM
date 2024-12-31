package Oops;

class Dog 
{
	public void Barking()
	{
		System.out.println("Dog is Barking");	
	}
}

class Cat extends Dog
{
	public void Sleeping()
	{
		System.out.println("Cat is Sleeping ");	
	}
}

public class Singlelevelinheritance {

	public static void main(String[] args) {
		
		Cat a=new Cat();
		a.Barking();
		a.Sleeping();
	}

}
