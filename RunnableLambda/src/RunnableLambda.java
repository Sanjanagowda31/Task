
public class RunnableLambda 
{
    public static void main(String args[])
    {
    	Runnable obj = () ->
    	{
    		for(int i=0;i<=5;i++)
    		{
    			System.out.println("hi");
    			try
    			{
    				Thread.sleep(20);
    			}
    			catch(InterruptedException e)
    			{
    				e.printStackTrace();
    			}
    		}
    	};
    	
    	Runnable obj1 = () ->
    	{
    		for(int i=0;i<=5;i++)
    		{
    			System.out.println("hello");
    			try
    			{
    				Thread.sleep(20);
    			}
    			catch(InterruptedException e)
    			{
    				e.printStackTrace();
    			}
    		}
    	};
    	
    	Thread t1 = new Thread(obj);
    	Thread t2 = new Thread(obj1);
    	
    	t1.start();
    	t2.start();
    }
}
