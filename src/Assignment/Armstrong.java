package Assignment;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int a = n;
        int s = 0;
        int b = String.valueOf(n).length();

        while (n != 0) {
            int digit = n % 10;
            s += Math.pow(digit, b);
            n /= 10;
        }

        if (s == a) {
            System.out.println(a + " is an Armstrong number.");
        } else {
            System.out.println(a + " is not an Armstrong number.");
        }

	}

}
