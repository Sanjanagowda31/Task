
public class RunTime 
{
	public static void main(String args[])
	{
		int i=0;
		int num[]=new int[5];
		String s=null;
		try
		{
			int j=18/i;
			System.out.println(num[5]);
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot be divided by 0");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Stay in array limit");
		}
		catch(Exception e)
		{
			System.out.println("something went wrong");
		}
		System.out.println("Everything went right");
		
	}

}
