class ShapeCalculator
{
	//here both  of the methods have same name and same parameter type so the compiler can't tell which method to call// 
	public double calculateArea(double side)
	{
        return side * side;
    }
    public double calculateArea(double length, double width) {
        return length * width;
    }
    public double calculateArea(double radius) 
    {
        return Math.PI * radius * radius;
    }
}
public class Main 
{
	public static void main (String args[]) 
	{
		ShapeCalculator calc = new ShapeCalculator();

        System.out.println("Square Area: " + calc.calculateArea(5));
        System.out.println("Rectangle Area: " + calc.calculateArea(4,6));
        System.out.println("Circle Area: " + calc.calculateArea(3));

	}
}

