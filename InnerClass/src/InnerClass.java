class A
{
	int age=22;
	
	public void show()
	{
		System.out.println("in A" + " " + "Age : " + age);
	}
	
	static class B
	{ 
		int age=23;
		public void show1()
		{
			System.out.println("in B" + " " + "Age : " + age);
		}
	}
}
public class InnerClass
{
     public static void main(String args[])
     {
    	 A obj = new A();
    	 obj.show();
    	 
    	 A.B obj1 = new A.B();
    	 obj1.show1();
     }
}
