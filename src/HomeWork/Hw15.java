package HomeWork;

public class Hw15 {
	
	//With parameters and without Return type
	
	public void cir (int r)
	{
		float c=(float) (0.14*r*r);
		System.out.print(c);
	}
	public static void main(String[] args) 
	{
		Hw15 ob=new Hw15();
		ob.cir(5);
	}
}	 