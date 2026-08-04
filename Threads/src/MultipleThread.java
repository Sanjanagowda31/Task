class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
          System.out.println("hi");		
        }
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
          System.out.println("hello");		
        }
	}
}
public class MultipleThread 
{
   public static void main(String args[])
   {
	   A obj = new A();
	   B obj1 = new B();
	   
	   obj.start();
	   obj1.start();
   }
}
