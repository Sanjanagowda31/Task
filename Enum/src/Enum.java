enum Status
{
	Running,Success,Failed,Pending
}
public class Enum 
{
   public static void main(String args[]) 
   {
	   Status s = Status.Success;
	   
	   switch(s)
	   {
	   case Running:
		   System.out.println("All good");
		   break;
		 
	   case Success:
		   System.out.println("Finished");
		   break;
		   
	   case Failed:
		   System.out.println("Reload");
		   break;
		   
	   case Pending:
		   System.out.println("waiting....");
		   break;
		
	   default:
		   System.out.println("end .....");
		   break;
	   }
	   
	   
   }
}
