abstract class Car
{
	public abstract void drive();
	public abstract void Park();
	public void playMusic()
	{
		System.out.println("the music is playing");
	}
}
abstract class Skoda extends Car
{
	public void drive()
	{
		System.out.println("the car is driving");
	}
}
class UpdatedSkoda extends Skoda
{
	public void Park()
	{
		System.out.println("The Car Skoda is parking");
	}
}
public class Demo 
{ 
    public static void main(String args[])
    {
    	Car obj = new UpdatedSkoda();
    	obj.drive();
    	obj.playMusic();
    	obj.Park();
    }
}
