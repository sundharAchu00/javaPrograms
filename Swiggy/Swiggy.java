import java.util.*;
class Swiggy 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception 
	{
		System.out.println("\t\t\t\"Select Your Favorite Hotel.\"");
		System.out.println("1.Buhari\n2.s.s.hyderhabadi\n3.amma canteen\n4.thlapakatti\n5.A2B\n6.exit");
		int hotel=sc.nextInt();
		switch (hotel)
		{
		case 1:{
			System.out.println("\"Thank For Selectin Buhari.....\"");
			Thread.sleep(1000);
			System.out.println("Please Select Dish Form The Menu");
			System.out.println("1.Mutton Biryani\n2.Chicken Biryani\n3.Hydrabadi dum-biryani\n4.Ghee-rice\n5.Exit\n");
			int food=sc.nextInt();
			switch (food)
			{
			case 1:{
				double per_plate=300;
				System.out.println("one plate of Mutton Biryani is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();
						if (user_entered_bill==bill)
						{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();
						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
								//wrong otp
								System.out.println("you entered wrong OTP");

						}
					}
					else
							{
								//amt is wrong
								System.out.println("your entered wrong bill amount");
							}
				}
				else if(payment_mode==2) 
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}
				}
				else if (payment_mode==3)
				{//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else
				{
					//incorrect payment option 
					System.out.println("incorrect payment option ");
				}
				break;}


//chicken biryani
			case 2:{
					double per_plate=200;
				System.out.println("one plate of chicken Biryani is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{
					//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();

					if (user_entered_bill==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();

						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}
					}
					else
					{
						//entered wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else if(payment_mode==2)
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}

				}
				else if (payment_mode==3)
				{
					//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}	
				}
				else
				{
					//wrong payment
					System.out.println("wrong payment method");
				}
				break;}

				//hydrabad dum briyani

			case 3:{
					double per_plate=350;
				System.out.println("one plate of hydrabad Biryani is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{
					//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();

					if (user_entered_bill==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();

						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}
					}
					else
					{
						//entered wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else if(payment_mode==2)
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}

				}
				else if (payment_mode==3)
				{
					//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}	
				}
				else
				{
					//wrong payment
					System.out.println("wrong payment method");
				}
				break;}

				//Ghee-rice
			case 4:{
					double per_plate=150;
				System.out.println("one plate of Ghee_rice is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{
					//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();

					if (user_entered_bill==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();

						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}
					}
					else
					{
						//entered wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else if(payment_mode==2)
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}

				}
				else if (payment_mode==3)
				{
					//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}	
				}
				else
				{
					//wrong payment
					System.out.println("wrong payment method");
				}
				break;}

			case 5:{
				System.out.println("*******Come Again******\n\t\tTo Buhari");
				break;}
				default:{
					System.out.println("Please Select From Displayed Menu...."+(char)3);
					break;}
			
			}
			break;}





			//ss hyderabad hotel
		case 2:{
				System.out.println("\"Thank For Selecting S.S.Hydrabad.....\"");
			Thread.sleep(1000);
			System.out.println("Please Select Dish Form The Menu");
			System.out.println("1.Mutton dum Biryani\n2.Chicken dum Biryani\n3.grill_chicken\n4.tandoori\n5.Exit\n");
			int food=sc.nextInt();
			switch (food)
			{
			case 1:{
				double per_plate=310;
				System.out.println("one plate of Mutton dum Biryani is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();
						if (user_entered_bill==bill)
						{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();
						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
								//wrong otp
								System.out.println("you entered wrong OTP");

						}
					}
					else
							{
								//amt is wrong
								System.out.println("your entered wrong bill amount");
							}
				}
				else if(payment_mode==2) 
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}
				}
				else if (payment_mode==3)
				{//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else
				{
					//incorrect payment option 
					System.out.println("incorrect payment option ");
				}
				break;}


			//chicken dum biryani
			case 2:{
					double per_plate=210;
				System.out.println("one plate of chicken dum Biryani is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{
					//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();

					if (user_entered_bill==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();

						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}
					}
					else
					{
						//entered wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else if(payment_mode==2)
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}

				}
				else if (payment_mode==3)
				{
					//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}	
				}
				else
				{
					//wrong payment
					System.out.println("wrong payment method");
				}
				break;}

				//grill_chicken briyani

			case 3:{
					double per_plate=450;
				System.out.println("one plate of grill_chicken is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{
					//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();

					if (user_entered_bill==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();

						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}
					}
					else
					{
						//entered wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else if(payment_mode==2)
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}

				}
				else if (payment_mode==3)
				{
					//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}	
				}
				else
				{
					//wrong payment
					System.out.println("wrong payment method");
				}
				break;}

				//tandoori
			case 4:{
					double per_plate=150;
				System.out.println("one plate of tandoori is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{
					//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();

					if (user_entered_bill==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();

						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}
					}
					else
					{
						//entered wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else if(payment_mode==2)
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}

				}
				else if (payment_mode==3)
				{
					//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}	
				}
				else
				{
					//wrong payment
					System.out.println("wrong payment method");
				}
				break;}

			case 5:{
				System.out.println("*******Come Again******\n\t\tTo S.S.Hydrabad");
				break;}
			default:{
				System.out.println("Please Select from Displayed Menu...."+(char)3);
				break;}
			
			}
			break;}

			//amma Canteen

		case 3:{
				System.out.println("\"Thank For Selecting Amma Canteen.....\"");
			Thread.sleep(1000);
			System.out.println("Please Select Dish Form The Menu");
			System.out.println("1.Sambar rice\n2.Tomato rice\n3.curd rice\n4.veg-briyani\n5.Exit\n");
			int food=sc.nextInt();
			switch (food)
			{
			case 1:{//sambar rice
				double per_plate=50;
				System.out.println("one plate of Samabr rice is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();
						if (user_entered_bill==bill)
						{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();
						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
								//wrong otp
								System.out.println("you entered wrong OTP");

						}
					}
					else
							{
								//amt is wrong
								System.out.println("your entered wrong bill amount");
							}
				}
				else if(payment_mode==2) 
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}
				}
				else if (payment_mode==3)
				{//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else
				{
					//incorrect payment option 
					System.out.println("incorrect payment option ");
				}
				break;}


			//tomato rice
			case 2:{
					double per_plate=40;
				System.out.println("one plate of Tomato Rice is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{
					//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();

					if (user_entered_bill==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();

						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}
					}
					else
					{
						//entered wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else if(payment_mode==2)
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}

				}
				else if (payment_mode==3)
				{
					//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}	
				}
				else
				{
					//wrong payment
					System.out.println("wrong payment method");
				}
				break;}

				//Curd Rice

			case 3:{
					double per_plate=30;
				System.out.println("one plate of Curd rice is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{
					//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();

					if (user_entered_bill==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();

						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}
					}
					else
					{
						//entered wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else if(payment_mode==2)
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}

				}
				else if (payment_mode==3)
				{
					//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}	
				}
				else
				{
					//wrong payment
					System.out.println("wrong payment method");
				}
				break;}

				//veg-briyani
			case 4:{
					double per_plate=70;
				System.out.println("one plate of veg-briyani is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{
					//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();

					if (user_entered_bill==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();

						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}
					}
					else
					{
						//entered wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else if(payment_mode==2)
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}

				}
				else if (payment_mode==3)
				{
					//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}	
				}
				else
				{
					//wrong payment
					System.out.println("wrong payment method");
				}
				break;}

			case 5:{
				System.out.println("*******Come Again******\n\t\tTo Amma Hotel");
				break;}
			default:{
					System.out.println("Please Select From Displayed Menu...."+(char)3);
					break;}
			
			}
			break;}



			//Thalapakatti 
		case 4:{
				System.out.println("\"Thank For Selecting Thalapakatti.....\"");
			Thread.sleep(1000);
			System.out.println("Please Select Dish Form The Menu");
			System.out.println("1.Seraga samba mutton biryani\n2.Seraga samba chicken biryani\n3.Madurai Bun Parrotta\n4.Mutton Sukka\n5.Exit\n");
			int food=sc.nextInt();
			switch (food)
			{
			case 1:{//Seraga samba mutton biryani
				double per_plate=390;
				System.out.println("one plate of Samabr rice is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();
						if (user_entered_bill==bill)
						{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();
						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
								//wrong otp
								System.out.println("you entered wrong OTP");

						}
					}
					else
							{
								//amt is wrong
								System.out.println("your entered wrong bill amount");
							}
				}
				else if(payment_mode==2) 
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}
				}
				else if (payment_mode==3)
				{//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else
				{
					//incorrect payment option 
					System.out.println("incorrect payment option ");
				}
				break;}


			//Seraga samba chicken biryani
			case 2:{
					double per_plate=290;
				System.out.println("one plate of Seraga samba chicken biryani is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{
					//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();

					if (user_entered_bill==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();

						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}
					}
					else
					{
						//entered wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else if(payment_mode==2)
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}

				}
				else if (payment_mode==3)
				{
					//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}	
				}
				else
				{
					//wrong payment
					System.out.println("wrong payment method");
				}
				break;}

				//Madurai Bun Parrotta

			case 3:{
					double per_plate=70;
				System.out.println("one plate of Madurai Bun Parrotta is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{
					//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();

					if (user_entered_bill==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();

						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}
					}
					else
					{
						//entered wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else if(payment_mode==2)
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}

				}
				else if (payment_mode==3)
				{
					//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}	
				}
				else
				{
					//wrong payment
					System.out.println("wrong payment method");
				}
				break;}

				//Mutton Sukka
			case 4:{
					double per_plate=170;
				System.out.println("one plate of Mutton Sukka is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{
					//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();

					if (user_entered_bill==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();

						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}
					}
					else
					{
						//entered wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else if(payment_mode==2)
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}

				}
				else if (payment_mode==3)
				{
					//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}	
				}
				else
				{
					//wrong payment
					System.out.println("wrong payment method");
				}
				break;}

			case 5:{
				System.out.println("*******Come Again******\n\t\tTo Thalapakatti");
				break;}
			default:{
					System.out.println("Please Select From Displayed Menu...."+(char)3);
					break;}

			}
			break;}


			//A2B

		case 5:{
				System.out.println("\"Thank For Selecting A2B.....\"");
			Thread.sleep(1000);
			System.out.println("Please Select Dish Form The Menu");
			System.out.println("1.Veg-biryani\n2.jack_fruit biryani\n3.Paneer_rice\n4.Gopi_Manchurian\n5.Exit\n");
			int food=sc.nextInt();
			switch (food)
			{
			case 1:{//VEG biryani
				double per_plate=100;
				System.out.println("one plate of VEG biryani is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();
						if (user_entered_bill==bill)
						{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();
						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
								//wrong otp
								System.out.println("you entered wrong OTP");

						}
					}
					else
							{
								//amt is wrong
								System.out.println("your entered wrong bill amount");
							}
				}
				else if(payment_mode==2) 
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}
				}
				else if (payment_mode==3)
				{//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else
				{
					//incorrect payment option 
					System.out.println("incorrect payment option ");
				}
				break;}


			//jack_fruit biryani
			case 2:{
					double per_plate=160;
				System.out.println("one plate of jack_fruit biryani is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{
					//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();

					if (user_entered_bill==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();

						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}
					}
					else
					{
						//entered wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else if(payment_mode==2)
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}

				}
				else if (payment_mode==3)
				{
					//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}	
				}
				else
				{
					//wrong payment
					System.out.println("wrong payment method");
				}
				break;}

				//Paneer_rice

			case 3:{
					double per_plate=180;
				System.out.println("one plate of Paneer_rice is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{
					//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();

					if (user_entered_bill==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();

						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}
					}
					else
					{
						//entered wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else if(payment_mode==2)
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}

				}
				else if (payment_mode==3)
				{
					//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}	
				}
				else
				{
					//wrong payment
					System.out.println("wrong payment method");
				}
				break;}

				//Gopi_Manchurian
			case 4:{
					double per_plate=120;
				System.out.println("one plate Gopi_Manchurian is :"+per_plate);
				System.out.println("Please enter Quantity :");
				int qty=sc.nextInt();
				double bill=per_plate*qty;
				System.out.println("preparing........");
				Thread.sleep(2000);
				System.out.println("We Appreciate Your Patience...");
				Thread.sleep(2000);
				System.out.println("Please select Payment Mode");
				System.out.println("1.Google_Pay\n2.Phone_Pay\n3.Cash-On-Delivery");
				int payment_mode=sc.nextInt();

				if (payment_mode==1)
				{
					//payment mode gpay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill=sc.nextInt();

					if (user_entered_bill==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp=sc.nextInt();

						if (user_enter_otp==sys_otp)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}
					}
					else
					{
						//entered wrong bill amount
						System.out.println("wrong bill amount");
					}
				}
				else if(payment_mode==2)
				{
					//payment mode phone pay
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill1=sc.nextInt();

					if (user_entered_bill1==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp1=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp1);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp1=sc.nextInt();

						if (user_enter_otp1==sys_otp1)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("Your Payment Done Successfully\nyour order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");	
						}
						else
						{
							//wrong otp
							System.out.println("Wrong OTP");
						}
					}
					else
					{
						//wrongg bill
						System.out.println("wrong bill amount");
					}

				}
				else if (payment_mode==3)
				{
					//cash on delivery
					System.out.println("please enter the total bill amount : "+bill);
					int user_entered_bill2=sc.nextInt();
					
					if (user_entered_bill2==bill)
					{
						double  res=Math.random()*9999+9999;
						int sys_otp2=(int)res;
						Thread.sleep(3000);
						System.out.println("Your OTP Is :"+sys_otp2);
						Thread.sleep(1000);
						System.out.println("Enter the OTP :");
						int user_enter_otp2=sc.nextInt();

						if (user_enter_otp2==sys_otp2)
						{
							System.out.println("Processing.........");
							Thread.sleep(2000);
							System.out.println("your order will be delivered soon");
							Thread.sleep(1000);
							System.out.println("********Thank You*********");
						}
						else
						{
							//wrong otp
							System.out.println("wrong otp");
						}


					}
					else
					{
						//wrong bill amount
						System.out.println("wrong bill amount");
					}	
				}
				else
				{
					//wrong payment
					System.out.println("wrong payment method");
				}
				break;}

			case 5:{
				System.out.println("*******Come Again******\n\t\tTo A2B");
				break;}
			default:{
				System.out.println("Please Select From Displayed Menu...."+(char)3);
				break;}
			}	
			break;}
			

		
		case 6:{
			System.out.println("***************Come Again"+(char)3+(char)3+(char)3);
			break;}
		default:{
			System.out.println("Input Mismatch...........");
			break;}
		}
	}
}
