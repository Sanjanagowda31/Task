import java.util.Scanner;
public class Loop {

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,3,4,5,2,1,1,2};
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter target number: ");
        int target = sc.nextInt();
        int count=0;
        for(int num:arr)
        {
        	if(num==target)
        	count++;
        }
        System.out.println("The number of times the target number appear :" + count);
		
	}

}
