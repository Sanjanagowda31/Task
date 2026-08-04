
public class StringMutability 
{ 
	public static void main(String args[])
	{
		long start=System.currentTimeMillis();
		   String s ="";
		   for(int i=0;i<10000;i++) 
		   {
			  s+="HELLO";
		   }
		long end=System.currentTimeMillis();
		System.out.println("String Time:"+ " " + (end-start));
		
		start=System.currentTimeMillis();
		   StringBuffer sb = new StringBuffer();
		   for(int i=0;i<10000;i++) 
		   {
			  sb.append("HELLO");
		   }
		end=System.currentTimeMillis();
		System.out.println("String Time:"+ " " + (end-start));
	}
   
}
