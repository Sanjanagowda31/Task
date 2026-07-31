
public class Car 
{
    String Brand;
    int Prize;
   
   public String getBrand()
   {
	   return Brand;
   }
   public void setBrand(String Brand)
   {
	   this.Brand=Brand;
   }
   
   public int getPrize()
   {
	   return Prize;
   }
   public void setPrize(int Prize)
   {
	   this.Prize=Prize;
   }
 public Car()
 {
	 Brand="Skoda";
	 Prize=4000000;
	 
 }
}
class Main
{
	public static void main(String args[])
	{
		Car obj = new Car();
		Car obj1=new Car();
		obj.setBrand("Nexa");
		obj.setPrize(3000000);
		System.out.println("car1 : Brand : " + obj.getBrand() + " , "  + "Prize : " + obj.getPrize());
		System.out.println("car1 : Brand : " + obj1.getBrand() + " , "  + "Prize : " + obj1.getPrize());
		
	}
}
