import java.util.*;
class Palindrome 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int given=num,rev=0;
		while (num>0)
		{
			rev=(rev*10)+(num%10);
			num/=10;
		}
		if (rev==given)
			System.out.println("the given number is Palindrome");
		else
			System.out.println("the given number is NOT Palindrome");
	}
}
