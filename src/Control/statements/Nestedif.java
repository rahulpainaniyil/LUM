package Control.statements;

public class Nestedif {

	public static void main(String[] args) {
		
		int age=11;
		int weight=35;
		if (age>=18)
		{
			if(weight>50)
			{
				System.out.println("Eligible");
			}
			else
			{
				System.out.println("Ineligible(under weight)");
			}
		}
		else
			{
			System.out.println("Not Eligible");
			}
	}

}
