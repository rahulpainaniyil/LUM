package Assignment;

public class Reversestring {

	public static void main(String[] args) {
		
		 String input = "Rahul Gopi";
	        String reversed = "";

	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed += input.charAt(i);
	        }

	        System.out.println("Original String: " + input);
	        System.out.println("Reversed String: " + reversed);
	}
}