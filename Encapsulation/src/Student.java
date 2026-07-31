
public class Student 
{
    private int id;
    private String name;
    private int marks;
    
    public int getId()
    {
    	return id;
    }
    public void setId(int a)
    {
    	id=a;
    }
    
    public String getName()
    {
    	return name;
    }
    public void setName(String b)
    {
    	name=b;
    }
    
    public int getMarks()
    {
    	return marks;
    }
    public void setMarks(int c)
    {
    	marks=c;
    }
}
class Main
{
	public static void main(String args[])
	{
		Student students=new Student();
	    students.setId(101);
	    students.setName("sanjana");
	    students.setMarks(87);
	    System.out.println("name : " + students.getName() + "  , " + "ID : " + students.getId()+ "  , " + "Marks : "+ students.getMarks());
		
	}
}
