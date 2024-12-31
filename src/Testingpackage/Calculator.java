package Testingpackage;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		float a,b,c=0;
		
		Scanner sc =new Scanner(System.in);
		
        System.out.println("Enter the first number");
		
		 a =sc.nextInt();
		
        System.out.println("Enter the second number");
		
		 b =sc.nextInt();
			
		System.out.println("enter Operation");
		 
		char op=sc.next().charAt(0);
		
		switch(op)
		{
		case '+':
			System.out.println("="+(a+b));
		    break;
		case '-':
			System.out.println("="+(a-b));
		    break;
		case '*':
			System.out.println("="+(a*b));
		    break;
		case '/':
			System.out.println("="+(a/b));
		    break;
		case '%':
			System.out.println("="+(a%b));
		    break;
		}

	}

}
