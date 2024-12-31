package Assignment;

public class Palindrom {

	public static void main(String[] args) {
		int n=121;
		int p=n;
		int a;
		int sum=0;
		while(n>0)
			{
			a=n%10;
			sum=sum*10+a;
			n=n/10;
			}
		if (p==sum)
		{
			System.out.println(p+"Number is palindrom");
		}
		else 
		{
			System.out.println(p+"Number is not palindrom");
		}
	}
}