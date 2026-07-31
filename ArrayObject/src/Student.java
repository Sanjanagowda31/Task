
public class Student 
{
  int id;
  String name;
  double marks;
  
  public Student(int id,String name,double marks )
  {
	  this.id=id;
	  this.name=name;
	  this.marks=marks;
  }
}

class ArrayObject
{
	public static void main (String args[])
	{
		 Student[] students = {new Student(101, "Alice", 88.5),
		                       new Student(102, "Bob", 92.0),
		                       new Student(103, "Charlie", 76.5),
		                       new Student(104, "David", 85.0),
		                       new Student(105, "Eva", 95.5)};
		 
		 Student highest = students[0];
	        for (Student s : students) 
	        {
	            if (s.marks > highest.marks)
	            {
	                highest = s;
	            }
	        }
	        System.out.println("Student with highest marks: " + highest.name);
	}
}
