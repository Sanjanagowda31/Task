public class JaggedArray
{
  public static void main (String args[])
  {
	 int salaries[][] = new int[3][];
	  
	 salaries[0]=new int[2];
	 salaries[1]=new int[4];
	 salaries[2]=new int[3];
	 
	 salaries[0][0]=15000;
	 salaries[0][1]=30000;
	 
	 salaries[1][0]=25000;
	 salaries[1][1]=45000;
	 salaries[1][2]=15000;
	 salaries[1][3]=35000;
	 
	 salaries[2][0]=55000;
	 salaries[2][1]=15000;
	 salaries[2][2]=10000;
	 
	 for(int i=0;i<salaries.length;i++) 
	 {  
		 double sum=0;
		 for(int j=0;j<salaries[i].length;j++) 
		 {
			 sum=sum+salaries[i][j];
		 }
		double average=sum/salaries[i].length;
		System.out.println("Department " + (i + 1) + " Average Salary: " + average);
	 }
	 
  }
}
