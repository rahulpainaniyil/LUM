package Testingpackage;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		
//        int a[]=new int[5];
//		
//		Scanner sc= new Scanner(System.in);
//		
//		System.out.println("Enter the no.");
//		
//		for(int i=0;i<5;i++)
//		{
//			a[i]=sc.nextInt();
//		}
//		System.out.println("The Numbers are");
//		
//		for(int c:a)
//		{
//			System.out.println(c);
//		} 
//	
	        char a[]=new char[5];
		
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter the Characters");
			
			for(int i=0;i<5;i++)
			{
				a[i]=sc.next().charAt(0);
			}
			System.out.println("The entered characters are");
			
			for(char c:a)
			{
				System.out.println(c);
			}
	
	
			  
	}

}
