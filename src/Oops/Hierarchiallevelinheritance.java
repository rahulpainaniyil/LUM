package Oops;
class Jungle
{
	public void Lion()
	{
		System.out.println(" Lion is sleeping");	
	}
}
class Nest extends Jungle
{
	public void Bird ()
	{
		System.out.println("Bird is fling ");	
	}
}
class Tree extends Jungle
{
	public void Root()
	{
		System.out.println("Tree is one Root ");	
	}
}
public class Hierarchiallevelinheritance {
	public static void main(String[] args) {
		Nest n=new Nest();
		n.Lion();
		n.Bird();
	Tree t=new Tree();
	t.Lion();
	t.Root();
	}
}