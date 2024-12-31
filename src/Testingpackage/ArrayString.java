package Testingpackage;

import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		
		int a[]=new int[6];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no.5");
		
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();  
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}
  