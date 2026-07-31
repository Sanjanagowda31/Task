
public class Animal 
{
  void sound()
  {
	  System.out.println("Animal Makes a sound");
  }
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog barks");
	}
}
class cat extends Animal
{
	void sound()
	{
		System.out.println("cat meows");
	}
}
class Main
{
	public static void main(String args[])
	{
		Animal obj = new Animal();
		obj.sound();
		Dog obj1 = new Dog();
		obj1.sound();
		cat obj3 = new cat();
        obj3.sound();
	}
}
