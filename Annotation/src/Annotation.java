class A
{
	public void showTheData()
	{
		System.out.println("it is available");
	}
}
class B extends A
{ 
	@Override
	public void showTheData()
	{
		System.out.println("it is not available");
	}
}
public class Annotation 
{
   public static void main(String args[]) 
   {
	   B obj = new B();
	   obj.showTheData();
   }
}
