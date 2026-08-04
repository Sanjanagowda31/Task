
public class Throw 
{ 
	public static void main(String args[])
	{
		int i=20;
		int j=0;
		
		try
		{
			j=18/i;
			if(j==0)
				throw new ArithmeticException("i dont want to print 0");
		
		}
		catch(ArithmeticException e)
		{
			j=18/1;
			System.out.println("cannot divide by 0" +e);
	    }
		catch(Exception e)
		{
			System.out.println("something went wrong"+ e);
		}
		System.out.println(j);
	}
}
