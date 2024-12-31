package HomeWork;

public class Hw11 {

	public static void main(String[] args) {
		String s ="jmeter";
		String s1 ="performence testing tool";
		System.out.println(s.concat(s1));
		String s2 ="java language is platform independent";
		String s3 ="language";
		if (s2.contains(s3))
			   System.out.println("pass");
		else
			 System.out.println("Fail");
		String s4 ="selenium webdriver is used for webapplication tesing";
		String s6 ="webapplication";
		String s5[]=s4.split(" ");
		   for(String y:s5)
		   {
			System.out.println(y);
		    if(y.contains(s6))
				break;
		   }
	}
}