package Oops;
class SchoolDetails

{
	final String schoolname = "Luminar";
	static String department = "English";
}

public class StaticFinal {

	public static void main(String[] args) {
		System.out.println(SchoolDetails.department);
		System.out.println(SchoolDetails.department="Malayalam");
		System.out.println(SchoolDetails.department);
	//	System.out.println(SchoolDetails.);
		SchoolDetails ob=new SchoolDetails ();
		System.out.println(ob.schoolname);
	//	System.out.println(ob.schoolname="abc");
	}
}