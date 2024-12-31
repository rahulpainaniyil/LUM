package Assignment;

public class ArrayAscendingod {

	public static void main(String[] args) {
		int array []= {10,9,12,15,14};
		
		System.out.println("Array");
        for (int n : array) 
        {
            System.out.print(n + " ");
        }
        for (int i = 0; i < array.length - 1; i++) 
        {
            for (int j = i + 1; j < array.length; j++) 
            {
                if (array[i] > array[j]) 
                {
                    
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        System.out.println("\n\nArray in ascending order:");
        for (int n : array) 
            System.out.println(n);
	}
}