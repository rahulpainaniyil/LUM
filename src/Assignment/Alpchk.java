package Assignment;

import java.util.Scanner;

public class Alpchk {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);

        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) 
            System.out.println(c + " is an alphabet");
        else 
            System.out.println( c+ "is not an alphabet");
	}
}