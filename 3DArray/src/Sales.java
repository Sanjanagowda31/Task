import java.util.Random;
public class Sales
{
   public static void main(String args[]) 
   {
	   int sales[][][] = new int[2][4][3];
	   Random rand = new Random();
	   
	   for(int year=0;year<2;year++)
	   {
		   for(int quarter=0;quarter<4;quarter++)
		   {
			   for(int month=0;month<3;month++) 
			   {
				   sales[year][quarter][month]=rand.nextInt(900)+100;
			   }
			   
		   }
	   }
	   
	   int ty2 =0;
	   for(int quarter=0;quarter<4;quarter++)
	   {
		   for(int month=0;month<3;month++)
		   {
			   ty2=ty2+sales[1][quarter][month];
		   }
	   }
	   System.out.println("The Total sales of Year2 is" + " " + ty2);
   }
}
