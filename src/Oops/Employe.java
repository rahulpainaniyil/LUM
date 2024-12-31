package Oops;

public class Employe {
	String EmployeName;
	int EmployeId;
	String Designation;
	int Salary;

	public void display()
	{
	System.out.println(EmployeName);
	System.out.println(EmployeId);
	System.out.println(Designation);
	System.out.println(Salary);
	}
	public static void main(String[] args) {
	Employe Emp= new Employe ();
	Emp.EmployeName="Rahul Gopi";
	Emp.EmployeId=100;
	Emp.Designation="Tester";
	Emp.Salary=25000;
	Emp.display();
	}

}
