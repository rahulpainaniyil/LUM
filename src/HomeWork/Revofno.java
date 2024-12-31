package HomeWork;
import java.util.Scanner;
public class Revofno {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String numberStr = Integer.toString(number);
        int[] digits = new int[numberStr.length()];  
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        System.out.print("Reversed Number: ");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
	}
}