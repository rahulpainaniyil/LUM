package HomeWork;
interface Bacicanimel
{
	void cat();
	void sleep();
}
class Monkey
{
	public void Jump()
	{
		System.out.println("Monkey is jumping");
	}
	void Bite()
	{
		System.out.println("Monkey will bite");
	}
}
class Human extends Monkey implements Bacicanimel
{
	public void speak()
	{
		System.out.println("Human will speak");
	}
	@Override
	public void cat() 
	{
		System.out.println("Cat is walking");	
	}
	@Override
	public void sleep() 
	{
		System.out.println("Cat is sleeping");	
	}
}
public class HW18 
{
	public static void main(String[] args) {
		Human ob=new Human ();
		ob.Bite();
		ob.Jump();
		ob.cat();
		ob.sleep();
		ob.speak();
	}
}