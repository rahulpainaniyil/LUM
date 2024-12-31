package Testingpackage;

public class Logicaloperators {

	public static void main(String[] args) {
		
	/*	A   B   A&&B   A||B   !A
		
		1   1     1     1     0
		1   0     0     1     0
		0   1     0     1     1
		0   0     0     0     1  */
		
		boolean a=true;
		boolean b=false;
		
		System.out.println(a&&b);
		
		System.out.println(a||b);
		
		System.out.println(!a);
		
		System.out.println(!b);
		
	}

}
