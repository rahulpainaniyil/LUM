package Testingpackage;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Name");
		
		String name=sc.next();
		
		System.out.println("Enter the age");
		
		int age =sc.nextInt();
		 
		System.out.println("Enter the char");
		
		char c=sc.next().charAt(0);

	}

}
