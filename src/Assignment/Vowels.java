package Assignment;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String x = scanner.nextLine();
        scanner.close();

        int a = 0;
        x = x.toLowerCase(); // 

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                a++;
            }
        }
        System.out.println("Number of vowels: " + a);
	}
}