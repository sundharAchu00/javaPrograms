import java.util.*;
class KaprekarNumber 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int sum=0,pow=1,last=0,first=0;
		int sq=num*num;
		float digit=0;
		int sqtemp=sq,s=sq;
		while (s>0)
		{
			s/=10;
			digit++;
		}
		digit/=2;
		for (int i=1;i<=digit ;i++ )
		{
			if (i==(digit-0.5))
			{
				digit+=0.5;
			}
		pow*=10;
		}
		last=sqtemp%pow;
		first=sq/pow;
		if (num==(first+last))
			System.out.println("the given Number is karprekar number");
		else
			System.out.println("the given Number is not karprekar number");
	}
}
