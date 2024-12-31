package Oops;
class Enc
{
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurName() {
		return SurName;
	}
	public void setSurName(String surName) {
		SurName = surName;
	}
	private String SurName;
}
public class Encapsulation {
	public static void main(String[] args) {
		Enc ob=new Enc();
		ob.setName("Rahul");
		System.out.println(ob.getName());
		ob.setSurName("Gopi");
		System.out.println(ob.getSurName());
	}
}