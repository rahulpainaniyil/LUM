package Assignment;

import java.util.Scanner;

public class Reverse {

public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();
int n = 0;
while (number != 0) 
{
int digit = number % 10;
n = n * 10 + digit;
number /= 10;
}
System.out.println("Reversed Number: " + n);
}
}