package Testingpackage;

public class ArrayString2 {

	public static void main(String[] args) {
		
		/*int a[]= {2,4,5,6,7};
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}*/
		
		int b[][] = {{10,20,12},{30,40,31},{50,60,51},{70,80,71}};
		
		for(int c[]:b)
		{
			for(int d:c)
			{
				System.out.print(d+" ");
			}
			System.out.println();	
		}
		

	}

}
