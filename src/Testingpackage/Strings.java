package Testingpackage;

public class Strings {

	public static void main(String[] args) {
		
	String s1="HELLO";
	System.out.println(s1.length());
	int w=s1.length();
	System.out.println("length"+w);
			
		
	String s2="Hello"; // Join two strings
	String s3="Rahul";
	System.out.println(s2.concat(s3));
	System.out.println(s2+s3);
	System.out.println(s2+1+2);
	System.out.println(1+2+s2);
		
	String s4="WELcome"; // Change to cases
	System.out.println(s4.toLowerCase());
	System.out.println(s4.toUpperCase());
	System.out.println(s4.startsWith("L"));
	System.out.println(s4.endsWith("e"));
		
	String s5="abc"; // Compare two strings
	String s6="Abc";
	System.out.println(s5.equals(s6));
	System.out.println(s5.equalsIgnoreCase(s6));
	
	String s7="    Book"; // Remove white space
	System.out.println(s7);
	System.out.println(s7.trim());
		
	String s8="Welcome"; // To Extract a particular portion from the string
	System.out.println(s8.substring(3));
	System.out.println(s8.substring(0, 4));
	
	String s9="Welcome to Luminar"; // Replace
	System.out.println(s9.contains("Welcome"));
	System.out.println(s9.replace("ex", "xy"));
	System.out.println(s9.charAt(0));
	
	String s10="Welcome to Luminar";
	String words[]=s10.split(" ");
	   for (String x:words)
	   {
		   System.out.println(x);
	   }
	   
	String s11="HELLO";
	char zy[]=s11.toCharArray();
	   for (char y:zy)
	   {
		   System.out.println(y);
	   }
	 
	}
}