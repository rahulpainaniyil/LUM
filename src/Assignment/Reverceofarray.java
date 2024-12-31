package Assignment;

import java.util.Arrays;

public class Reverceofarray {
	
	public static void main(String[] args) 
	{
	   int[] array = {100,200,300,400,500};
	    System.out.println("Original Array: " + Arrays.toString(array));
		        reverseArray(array);
		        System.out.println("Reversed Array: " + Arrays.toString(array));
	}
	public static void reverseArray(int[] array)
	{
		int left = 0;
		int right = array.length - 1;
		while (left < right)
		{
			int temp = array[left];
		    array[left] = array[right];
		    array[right] = temp;
		    left++;
		    right--;
		}
	}
}