
public class main {

	public static void main(String[] args)
	{
		String s1="java";
		String s2=new String("java");
		System.out.println("if s1==s2 : "+ (s1==s2));
		System.out.println("if s1.equals(s2) : "+ s1.equals(s2));
	}

}
//here  "==" represents whether both s1 and s2 is referring to same address but in s2 an object is created so it is
//refering to the object and s1 is referring to string pool constant therefore the result is false.

//here ".equals()" represent whether the content of both variables are same therefore the result is true.