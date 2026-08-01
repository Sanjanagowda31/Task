
 class Vehicle 
{
   void start()
   {
	   System.out.println("The vehicle has started");
   }
}
 class Bike extends Vehicle
{
	void start()
	{
		super.start();
		System.out.println("The Bike has started");
	}
}
class Main
{
	public static void main(String args[])
	{
	   Vehicle obj = new Bike();
	   obj.start();
	}
}