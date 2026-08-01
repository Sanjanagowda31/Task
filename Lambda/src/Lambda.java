interface A
{
	int add(int i,int j);
}
public class Lambda 
{
   public static void main (String args[])
   {
	   A obj= (i,j)-> i+j; 
	   int result=obj.add(4,4);
	   System.out.println(result);
    }
}
