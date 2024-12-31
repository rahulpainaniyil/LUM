package HomeWork;
public class Nationalised
{
	public void Banks ()
	{
		System.out.println(" Bank");	
	}
}
class SBI extends Nationalised
{
	public void Savings ()
	{
		System.out.println(" Savings Ac ");	
	}
}
class Canera extends Nationalised
{
	public void Curent()
	{
		System.out.println("Curent Ac ");	
	}
}

public class Hw16 {

	public static void main(String[] args) {
		SBI b=new SBI();
		b.Banks();
		b.Savings();
		Canera k= new Canera ();
		k.Banks();
		k.Curent();
	}
}
