package Assignment;

public class Fibonacci {

	public static void main(String[] args) {
		
		 int a = 5;
	     int b = 0;
	     int c = 1;

	        System.out.print("Fibonacci No.: ");
	        
	        for (int i = 1; i <= a; ++i) {
	            System.out.print(b + " ");
	            
	            int nextTerm = b + c;
	            b = c;
	            c = nextTerm;
	        }
	}
}