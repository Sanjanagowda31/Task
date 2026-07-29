class A
{
	public void show()
	{
		System.out.println(" in th class A");
	}
}
public class AnonymusInnerClass 
{
   public static void main(String args[])
   {
	   A obj = new A() 
	   {
		  public void show()
		  {
			  System.out.println(" in the class B");
		  }
	   };
	   obj.show();
	   
   }
}
