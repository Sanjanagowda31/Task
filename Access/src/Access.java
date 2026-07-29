
class student
{
	public String name="sanjana";
	private int Idno=101;
	protected int marks=76;
	String Course="dental";
	
}
public class Access 
{
	public static void main(String args[])
	{
		student obj=new student();
		System.out.println("name = " + obj.name);
		System.out.println("IdNo = " + obj.Idno);
		System.out.println("marks = " + obj.marks);
		System.out.println("name = " + obj.Course);
		
		
	}
}
