import java.util.*;
class Armstrong 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num,count=0,last=0,sum=0,product=1;

		while (num>0)
		{
			num/=10;
			count++;
		}
		num=temp;
		while (num>0)
		{
			last=(num%10);
			for (int i=1;i<=count ;i++ )
			{
				product*=last;
			}
				sum+=product;
				product=1;
				num/=10;
		}
		String res=(sum==temp)?"The Given Number Is Armstrong Number":"The Given Number Is NOT Armstrong Number";
		System.out.println(res);
	}
}
