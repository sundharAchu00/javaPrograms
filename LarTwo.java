import java.util.*;
class LarTwo 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter value a:");
		int a=sc.nextInt();
		System.out.println("enter value b:");
		int b=sc.nextInt();
		String res=(a>b)?"a is largest":"b is Largest";
		System.out.println(res);
	}
}
