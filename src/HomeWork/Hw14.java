package HomeWork;

public class Hw14 {
	
	// Without parameters and with Return type
	
	public float tri()
	{
		float b=5;
		float h=4;
		float y=(float) (0.5*h*b);
		return y;
	}

	public static void main(String[] args) 
	{
		Hw14 ob=new Hw14();
		System.out.println(ob.tri());
	}

}