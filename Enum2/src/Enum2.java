enum Laptop
{
	Macbook(300000),Hp(50000),Lenovo(60000);
	
	private int Price;
	private Laptop(int Price)
	{
		this.Price=Price;
	}
	
	public int getPrice()
	{
		return Price;
	}
	public void SetPrice(int Price)
	{
		this.Price=Price;
	}
}
public class Enum2 
{
   public static void main(String args[])
   {
	   for(Laptop Lap : Laptop.values())
	   {
		   System.out.println(Lap + ":" + Lap.getPrice());
	   }
   }
}
