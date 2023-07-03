import java.util.*;
class NumMethods 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("I'm from NumMethods...........");
		Thread.sleep(1000);
		StrongNum();
	}
	public static void StrongNum() 
	{
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int fact=1;
		int temp=num,digit;
		int str_num=0;
		for(int i=num;i!=0;i/=10)
		{
			fact=1;
			digit=i%10;
			for (int j=1;j<=digit ;j++ )
			{
				fact*=j;
			}
			str_num+=fact;
		}
		if (num==str_num)
			System.out.println("the given "+num+" is Strong number");
		else
			System.out.println("the given "+num+" is  Not a Strong number");
	}
}
