package Testingpackage;

import java.util.Scanner;

public class TwoDarray {

	public static void main(String[] args) {
			
			int a[][]=new int[2][3];
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter the Numbers");
			
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<3;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			 
			System.out.println("The Values are");
			
			/*for (int i=0;i<2;i++)
			{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
			}*/
			
			for (int b[]:a)
			{
			for(int v:b)
			{
				System.out.print(v+" ");
			}
			System.out.println();
			}
			
	}

}
