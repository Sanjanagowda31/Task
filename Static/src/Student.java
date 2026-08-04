
public class Student 
{
   static String collegeName="AMC Engineering college";
   String Name;
   int RollNo;
   
   static 
   {
	   System.out.println("College details loaded");
   }
   
   Student(String a,int b)
   {
	   Name=a;
	   RollNo=b;
   }
   
   static void displayCollege()
   {
	   System.out.println("college name : "+ " " +collegeName);
   }
   
   void display()
   {
	   System.out.println("Name : " + Name +  "  ,  " + "RollNO : " + RollNo);
   }
}
class Main
{
	public static void main(String args[])
	{
		Student obj = new Student("sanjana",21);
		Student obj1= new Student("priyanka",22);
		obj.displayCollege();
		obj.display();
		obj1.display();
		
	}
}
