package HomeWork;
class Members
{
	String name;
	int age;
	String address;
	int salary;
	public void printdetails()
	{
		System.out.println("Details of Members:\n");
		System.out.println("Name         :"+name);
		System.out.println("Age          :"+age);
		System.out.println("Address      :"+address);
		System.out.println("salary       :"+salary);
	}
}
class Worker extends Members
{
	String Spesilization;
}
class Maneger extends Members
{
	String Department;
}
public class Hw17 {

	public static void main(String[] args) {
		Worker w=new Worker();
		w.name="Rahul Gopi";
		w.age =23;
		w.address="Painaniyil";
		w.salary=30000;
		w.printdetails();
		System.out.println(w.Spesilization="Spesilization:Computer Science \n");
		
		Maneger m=new Maneger();
		m.name="Soman";
		m.age=26;
		m.address="Kanjikuzhi";
		m.salary=13000;
		m.printdetails();
		System.out.println(m.Department="Department   :Electronics");
	}
}