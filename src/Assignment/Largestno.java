package Assignment;

public class Largestno {

	public static void main(String[] args) {
		int[] a = {12,25,55,24,28,66,};  
		int b = a[0];
		for (int i = 1; i < a.length; i++)
		{
			if (a[i] > b) 
			{
				b = a[i];
	        }
	     }
		System.out.println("The largest number is: "+b);

	}

}
