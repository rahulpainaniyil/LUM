package Oops;
interface WhatsApp
{
	void Call ();
	void Mute ();
	void Diconnect ();
}
class Audiocall implements WhatsApp
{
	@Override
	public void Call() 
	{
		System.out.println("Audio calling");
	}
	@Override
	public void Mute() 
	{
		System.out.println("Audio call mute");	
	}
	@Override
	public void Diconnect() 
	{
		System.out.println("Audio Call Diconnected");
	}
}
class Videocall implements WhatsApp
{
	@Override
	public void Call()
	{
		System.out.println("Video Calling");
	}
	@Override
	public void Mute() 
	{
		System.out.println("Video call Muted");
	}
	@Override
	public void Diconnect() 
	{
		System.out.println("Video call Diconnected");
	}
}
public class Interface {
	public static void main(String[] args) {
		Audiocall ob= new Audiocall ();
		ob.Call();
		ob.Mute();
		ob.Diconnect();
		System.out.println(" ");
		Videocall obo=new Videocall ();
		obo.Call();
		obo.Mute();
		obo.Diconnect();
		System.out.println(" ");
		
		// OR 
		
		WhatsApp a=new Audiocall  ();
		a.Call();
		a.Mute();
		a.Diconnect();
		System.out.println(" ");
		a=new Videocall  ();
		a.Call();
		a.Mute();
		a.Diconnect();
	}
}