
public class Calculator 
{
   public void square(int n)
   {
	   System.out.println( "Square of the number is : " + n*n);
   }
}
class Main
{
	public static void main (String args[])
	{
		new Calculator().square(4);
	}
}