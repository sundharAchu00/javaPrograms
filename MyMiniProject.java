import java.util.*;
class MyMiniProject 
{
	static Scanner sc=new Scanner(System.in);
	static boolean b=true;
	public static void main(String[] args) throws Exception
	{
		boolean log_bool=true,sign_bool=true;
		int stu_id=0,marks,student_id=0,count=1,log_count=0;
		long contact=0,cont=0;
		System.out.println("\t\tWelcome To My Mini-Project");
		Thread.sleep(2000);
		do
		{
			Thread.sleep(1500);
			System.out.println("1.Sign-up\n2.log-in\n3.forgot Password\n4.log-out");//asking the user to select
			int n=sc.nextInt();
			switch (n)
			{
			case 1:{
				if (count<=1)
				{
				System.out.println("enter your student ID:");
				stu_id=sc.nextInt();
				student_id=stu_id;
				System.out.println("enter your Contact Number:");
				contact=sc.nextLong();
				cont=contact;
				System.out.println("enter your Marks:");
				marks=sc.nextInt();
				Thread.sleep(2000);
				System.out.println("Account created Successfully.....");
				System.out.println("\t***********************");
				count++;
				//checking acc exist or not
				}
				 else if (student_id==stu_id && contact==cont)//checking stu id and contact to check acc is exist or not 
				{
					Thread.sleep(1500);
					System.out.println("Already Account Created......You Need to Sign-Up");
				}
				break;}

			case 2:{
				System.out.println("enter your student ID:");
				stu_id=sc.nextInt();
				System.out.println("enter your Contact Number:");
				contact=sc.nextLong();
				//checking acc exist or not
				if (sign_bool)
				{
				if (student_id==stu_id)
				{
					if (contact==cont)
					{
						do
						{
						System.out.println("\t\tSelect The Input");
						System.out.println("1.largest of two Numbers\n2.strongest number\n3.armstrong Number\n4.palindrome or NOT\n5.Exit");
						int input=sc.nextInt();
						Thread.sleep(1000);
						switch (input)
						{
						case 1:{
							LarTwo.main(args);
							Thread.sleep(1500);
							System.out.println();
							System.out.println();
							break;}
						case 2:{
							StrongNum.main(args);
							Thread.sleep(1500);
							System.out.println();	
							System.out.println();
							break;}
						case 3:{
							Armstrong.main(args);
							Thread.sleep(1500);
							System.out.println();
							System.out.println();
							break;}
						case 4:{
							Palindrome.main(args);
							Thread.sleep(1500);
							System.out.println();System.out.println();
							break;}
						case 5:{
							log_bool=false;
							break;}
						default:{
							Thread.sleep(1500);
							System.out.println("Selection Out Of Range.....");
							break;}
						}
						}
						while (log_bool);
					}
					else
					{
						System.out.println("Entered contact is not present...");
					}
					
				}
				else if (contact==cont)
				{
					System.out.println("Entered Student ID is not present...");
				}
				else
				{
					System.out.println("User Information is not present in the record..."+(char)2);
					log_count++;
						if (log_count>2)
						{
							b=false;
						}
				}
				}
				else
					{
						System.out.println("Account not found You Need to Sign-Up");
					sign_bool=false;
					}
				
				break;}
			case 3:{
				System.out.println("Your have been received OTP in your registered contact number");
				double a=Math.random()*9999+9999;
					int otp=(int)a;
					System.out.println("processing.....");
					Thread.sleep(1500);
					System.out.println("Your OTP is :"+otp);
					Thread.sleep(1000);
					System.out.println("Enter otp:");
					int user_otp=sc.nextInt();
					if (otp==user_otp)
					{
						Thread.sleep(500);
						System.out.println("your student id is: "+student_id +"\nyour contact number is:"+cont);
					}
					else
					{
						System.out.println("entered Otp Is wrong");
					}
				
				break;}
				case 4:{
					b=false;
					break;}
			default:{
				System.out.println("Selection Out Of Range.....");
				break;}
			
			}
		}
		while (b);
	}
}
