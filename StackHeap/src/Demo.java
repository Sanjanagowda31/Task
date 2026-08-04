
public class Demo
{
	//here the variable type integer n is stored in stack, when n value is changed  you are just changing the value in 
	//that place .
	//but array is stored in heap memory where arr[0] holds the reference to the heap object.
	public void updateData(int n, int[] arr)
	{
		n+=10;
		arr[0]=999;
	}
}
class StackHeap
{
	public static void main(String args[])
	{
		int n=10;
		int[] arr= {5,998,997};
		System.out.println("Number" + ":" + n);
		System.out.println("Array" + ":" + arr[0]);
	}
}

