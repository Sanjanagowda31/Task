interface A
{
	
	int age=23;
	int marks=88;
	
	void show();
	void show1();
}
interface x extends A
{
	void run();
}
class B implements A,x
{
	public void show()
	{
		System.out.println("in the show");
	}
	public void show1()
	{
		System.out.println("in the show 1");
	}
	public void run()
	{
		System.out.println("the show is running");
	}
}
public class Interface 
{
    public static void main(String args[])
    {
    	A obj = new B ();
    	obj.show();
    	obj.show1();
    	
    	x obj1 = new B();
    	obj1.run();
    	
    	
    }
}
