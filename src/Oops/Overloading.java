package Oops;

public class Overloading {
	 public void add (int a, int b)

	 {
		int c=a+b;
		System.out.println(c);
	 }
	 public void add (int a, double b)
	 {
		 double value=a+b;
		 System.out.println(value);
	 }
	public static void main(String[] args) {
		Overloading ob=new Overloading ();
		ob.add(5, 6);
		ob.add(6, 5.2);
	}
}