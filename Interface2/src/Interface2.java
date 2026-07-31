interface Computer
{
	 void code();
}
class Laptop implements Computer
{
	public void code()
	{
		System.out.println("code:compile:run");
	}
}
class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code:compile:run:faster");
	}
}
class Developer
{
	public void devApp(Computer Lap)
	{
		Lap.code();
	}
}
public class Interface2 
{
   public static void main(String args[]) 
   {
	   Computer Lap = new Laptop();
	   Computer Desk = new Desktop();
	   Lap.code();
	   Desk.code();
   }
}
