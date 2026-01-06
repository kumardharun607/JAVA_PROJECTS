import java.util.*;
class Bankloan 
{
	static Scanner sc=new Scanner(System.in);
	static double loanamount=0;
	static int enterotp;
	public static void main(String[] args) throws Exception
	{
	
		System.out.println("Enter Your name:");
		String name=sc.nextLine();
		 
		System.out.println("Enter Your DOB (Format:DD-MM-YYYY) :");
		String dob=sc.nextLine();
		if(!(dob.charAt(0)>='0' && dob.charAt(0)<='9') || !(dob.charAt(1)>='0' && dob.charAt(1)<='9') || !(dob.charAt(2)==45) || !(dob.charAt(3)>='0' && dob.charAt(3)<='9') || !(dob.charAt(4)>='0' && dob.charAt(4)<='9') || !(dob.charAt(5)==45) || !(dob.charAt(6)>='0' && dob.charAt(6)<='9') || !(dob.charAt(7)>='0' && dob.charAt(7)<='7') || !(dob.charAt(8)>='0' && dob.charAt(8)<='9') || !(dob.charAt(9)>='0' && dob.charAt(9)<='9') )
		{ 
			System.out.println("\n*****Invalid DOB*****");
		}
		else if((dob.charAt(0)>='0' && dob.charAt(0)<='9') && (dob.charAt(1)>='0' && dob.charAt(1)<='9') && (dob.charAt(2)==45) && (dob.charAt(3)>='0' && dob.charAt(3)<='9') && (dob.charAt(4)>='0' && dob.charAt(4)<='9') && (dob.charAt(5)==45) && (dob.charAt(6)>='0' && dob.charAt(6)<='9') && (dob.charAt(7)>='0' && dob.charAt(7)<='7') && (dob.charAt(8)>='0' && dob.charAt(8)<='9') && (dob.charAt(9)>='0' && dob.charAt(9)<='9') )
		{
		System.out.println("Enter Your Age:");
		int age=sc.nextInt();
		sc.nextLine();
		
		
		String dobyearstr=""+dob.charAt(6)+dob.charAt(7)+dob.charAt(8)+dob.charAt(9);
		int dobyearint=Integer.valueOf(dobyearstr);
		int agecalculate=2025-dobyearint;
		if(age>39 || age<0 || age<18 || age!=agecalculate )
		{
			
			System.out.println("\n*****Your age not eligible for this loan*****");
			
		}
		else if(age<=39)
		{
			
		    System.out.println("Enter Your Phone_number:");
		    String phstr=sc.nextLine();
			int lenph=phstr.length();
	
		    
			
			if(lenph!=10 || !(phstr.charAt(0)>='0' && phstr.charAt(0)<='9') || !(phstr.charAt(1)>='0' && phstr.charAt(1)<='9') || !(phstr.charAt(2)>='0' && phstr.charAt(2)<='9') || !(phstr.charAt(3)>='0' && phstr.charAt(3)<='9') || !(phstr.charAt(4)>='0' && phstr.charAt(4)<='9') || !(phstr.charAt(5)>='0' && phstr.charAt(5)<='9') || !(phstr.charAt(6)>='0' && phstr.charAt(6)<='9') || !(phstr.charAt(7)>='0' && phstr.charAt(7)<='9') || !(phstr.charAt(8)>='0' && phstr.charAt(8)<='9') || !(phstr.charAt(9)>='0' && phstr.charAt(9)<='9')   )
		    {
				System.out.println("\n*****Invalid Phone number*****");
			
		    }
		    else if(lenph==10)
			{
			
		        System.out.println("Enter Your AAdhar_number:");
		        long aadno=sc.nextLong();
				sc.nextLine();
				String adno=aadno+"";
				if(adno.length()!=12 || !(adno.charAt(0)>='0' && adno.charAt(0)<='9') || !(adno.charAt(1)>='0' && adno.charAt(1)<='9') || !(adno.charAt(2)>='0' && adno.charAt(2)<='9') || !(adno.charAt(3)>='0' && adno.charAt(3)<='9') || !(adno.charAt(4)>='0' && adno.charAt(4)<='9') || !(adno.charAt(5)>='0' && adno.charAt(5)<='9') || !(adno.charAt(6)>='0' && adno.charAt(6)<='9') || !(adno.charAt(7)>='0' && adno.charAt(7)<='9') || !(adno.charAt(8)>='0' && adno.charAt(8)<='9') || !(adno.charAt(9)>='0' && adno.charAt(9)<='9') || !(adno.charAt(10)>='0' && adno.charAt(10)<='9') || !(adno.charAt(11)>='0' && adno.charAt(11)<='9')  )
		        {
					System.out.println("\n*****Invalid Aadhar number*****");
			
		        }
		        else if(adno.length()==12)
				{
					Thread.sleep(2000);
		            System.out.println("Enter Your PAN CARD_number:");
		            String pano=sc.nextLine();
					
					
					if(pano.length()!=10)
		            {
						System.out.println("\n*****Invalid PAN number*****");
			
		            }
		            else if(pano.length()==10)
					{
						if((pano.charAt(0)>='A') && (pano.charAt(0)<='Z') && (pano.charAt(1)>='A') && (pano.charAt(1)<='Z') && (pano.charAt(2)>='A') && (pano.charAt(2)<='Z') && (pano.charAt(3)>='A') && (pano.charAt(3)<='Z') && (pano.charAt(4)>='A') && (pano.charAt(4)<='Z') && (pano.charAt(5)>='0') && (pano.charAt(5)<='9') && (pano.charAt(6)>='0') && (pano.charAt(6)<='9') && (pano.charAt(7)>='0') && (pano.charAt(7)<='9') && (pano.charAt(8)>='0') && (pano.charAt(8)<='9') && (pano.charAt(9)>='A') && (pano.charAt(9)<='Z'))
						{
							Thread.sleep(2000);
		                    System.out.println("\n1.India \n2.Other \nSelect Your Country:");
		                    int country=sc.nextInt();
						    if(country!=1)
		                    {
								System.out.println("\n*****Your not eligible*****");
			
		                    }
		                    else if(country==1)
						    {
								System.out.println("\n\t\t\t*****Enter Your Bank Account number*****");
								long acc=sc.nextLong();
								sc.nextLine();
								
								String accno=acc+"";
								if(!(accno.length()>=11 && accno.length()<=16) )
								{
									System.out.println("\n*****Invalid Account Number*****");
								}
								else if ((accno.length()>=11 && accno.length()<=16))
								{
									System.out.println("\n\t\t\t*****Enter Your Bank Branch Name*****");
									String branch=sc.nextLine();
									System.out.println("\n\t\t\t*****Enter Your Address (PINCODE*) *****");
									System.out.print("House no/: ");
                                    String line1 = sc.nextLine();

                                    System.out.print("Street Name/District name: ");
                                    String line2 = sc.nextLine();

                                    System.out.print("State:");
                                    String line3 = sc.nextLine();
									
									System.out.print("PINCODE:");
                                    String pincode = sc.nextLine();
									
									if(pincode.length()!=6 || !(pincode.charAt(0)>='0' && pincode.charAt(0)<='9') || !(pincode.charAt(1)>='0' && pincode.charAt(1)<='9') || !(pincode.charAt(2)>='0' && pincode.charAt(2)<='9') || !(pincode.charAt(3)>='0' && pincode.charAt(3)<='9') || !(pincode.charAt(4)>='0' && pincode.charAt(4)<='9') || !(pincode.charAt(5)>='0' && pincode.charAt(5)<='9') )
		                            {
										System.out.println("\n**********Invalid PINCODE ****************");
									}
									else if(pincode.length()==6)
									{

                                    String address = line1 + "\n" + line2 + "\n" + line3+"\n"+pincode;

									
									Thread.sleep(2000);
		                            System.out.println("\t\t\t1.Further you want to continue \n\t\t\t2.EXIT:");
		                            int a=sc.nextInt();
							        switch(a)
		                            {
										case 1 :
								        {
											System.out.println("\n\t\t\t Select Your Type Of Income:");
											System.out.println("\n\t\t\t 1.Salaried \n\t\t\t 2.Self Employer");
											int typinc=sc.nextInt();
											System.out.println("\n--------Enter Your Monthly Income:");
											double moninc=sc.nextDouble();
											System.out.println("\n--------Enter Your CREDIT Score:");
											int credit=sc.nextInt();
											
											String waitmsg="--------------------Please Wait Your Loan Will Be Processing---------------------";
											
											for (int i = 0; i < waitmsg.length(); i++) {
												System.out.print(waitmsg.charAt(i));  // print character without new line
	                                            Thread.sleep(100);
                                            }
											if(moninc<0 || moninc<15000)
											{
												System.out.println("*****Invalid Monthly Income*****");
											}
											else if(moninc>200000)
											{
												System.out.println("*****Your Monthly Income Exceed for this loan*****");
											}
											else if(moninc==15000)
											{
												if(credit>=750)
												{  
												     loanamount=200000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=100000;
												}
												else if(credit<650)
											    {
													loanamount=50000;
												}
												
												
											}
											else if(moninc>15000 && moninc<=20000)
											{
												if(credit>=750)
												{  
												     loanamount=250000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=130000;
												}
												else if(credit<650)
											    {
													loanamount=65000;
												}
												
												
											}
											else if(moninc>20000 && moninc<=25000)
											{
												if(credit>=750)
												{  
												     loanamount=300000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=160000;
												}
												else if(credit<650)
											    {
													loanamount=80000;
												}
												
												
											}
											else if(moninc>25000 && moninc<=30000)
											{
												if(credit>=750)
												{  
												     loanamount=400000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=200000;
												}
												else if(credit<650)
											    {
													loanamount=100000;
												}
												
												
											}
											else if(moninc>30000 && moninc<=40000)
											{
												if(credit>=750)
												{  
												     loanamount=450000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=250000;
												}
												else if(credit<650)
											    {
													loanamount=125000;
												}
												
												
											}
											else if(moninc>40000 && moninc<=45000)
											{
												if(credit>=750)
												{  
												     loanamount=500000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=300000;
												}
												else if(credit<650)
											    {
													loanamount=150000;
												}
												
												
											}
											else if(moninc>45000 && moninc<=50000)
											{
												if(credit>=750)
												{  
												     loanamount=650000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=400000;
												}
												else if(credit<650)
											    {
													loanamount=175000;
												}
												
												
											}
											else if(moninc>50000 && moninc<=60000)
											{
												if(credit>=750)
												{  
												     loanamount=800000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=500000;
												}
												else if(credit<650)
											    {
													loanamount=200000;
												}
												
												
											}
											else if(moninc>60000 && moninc<=70000)
											{
												if(credit>=750)
												{  
												     loanamount=900000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=600000;
												}
												else if(credit<650)
											    {
													loanamount=250000;
												}
												
												
											}
											else if(moninc>70000 && moninc<=80000)
											{
												if(credit>=750)
												{  
												     loanamount=110000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=700000;
												}
												else if(credit<650)
											    {
													loanamount=300000;
												}
												
												
											}
											else if(moninc>80000 && moninc<=90000)
											{
												if(credit>=750)
												{  
												     loanamount=130000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=850000;
												}
												else if(credit<650)
											    {
													loanamount=350000;
												}
												
												
											}
											else if(moninc>90000 && moninc<=100000)
											{
												if(credit>=750)
												{  
												     loanamount=1500000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=1000000;
												}
												else if(credit<650)
											    {
													loanamount=400000;
												}
												
												
											}
											else if(moninc>100000 && moninc<=120000)
											{
												if(credit>=750)
												{  
												     loanamount=1700000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=1100000;
												}
												else if(credit<650)
											    {
													loanamount=450000;
												}
												
												
											}
											else if(moninc>120000 && moninc<=140000)
											{
												if(credit>=750)
												{  
												     loanamount=1900000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=1200000;
												}
												else if(credit<650)
											    {
													loanamount=500000;
												}
												
												
											}
											else if(moninc>140000 && moninc<=160000)
											{
												if(credit>=750)
												{  
												     loanamount=2100000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=1300000;
												}
												else if(credit<650)
											    {
													loanamount=550000;
												}
												
												
											}
											else if(moninc>160000 && moninc<=180000)
											{
												if(credit>=750)
												{  
												     loanamount=2300000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=1400000;
												}
												else if(credit<650)
											    {
													loanamount=575000;
												}
												
												
											}
											else if(moninc>180000 && moninc<=200000)
											{
												if(credit>=750)
												{  
												     loanamount=2500000;
												}
												else if(credit>=650 && credit<750)
											    {
													loanamount=1500000;
												}
												else if(credit<650)
											    {
													loanamount=600000;
												}
												
												
											}
											
											System.out.println("\n**********CONGRATS BASED ON YOUR DETAILS APPROVED LOAN AMOUNT IS RS."+loanamount+" "+"*************");
											int monthemi;
											int yearemi;
											
											
											
											
											System.out.println("\n----------Enter Your Total Months Of EMI You Want:");
											monthemi=sc.nextInt();
											double monthlypaid=monthemi/loanamount;
											yearemi=monthemi/12;
											if(yearemi+age>=60)
											{
												System.out.println("\n----------Sorry You must closed this loan within your age of 60---------------------");
												System.out.println("\n----------So Please reduce your EMI months------------------------");
											}
											else if(yearemi+age<60)
											{
											System.out.println("\n----Your Monthly EMI is Rs."+monthlypaid);
											System.out.println("\n----Your Yearly EMI is Rs."+loanamount/yearemi);
											System.out.println("\n\n");
											String charges="***********Charges For Applying This Loan is****************";
											 for (int i = 0; i < charges.length(); i++) {
												System.out.print(charges.charAt(i));  // print character without new line
	                                            Thread.sleep(100);
                                            }
											
											
											Thread.sleep(2000);
											System.out.println("\n----------Documentaion Fees 0.5%:");
											Thread.sleep(2000);
											System.out.println("\n----------Insurance Fees 8.5%:");
											Thread.sleep(2000);
											System.out.println("\n----------Platform Fees 0.2%:");
											
											
											double documentfees=0.5/100*loanamount;
											double insurancefees=8.5/100*loanamount;
											double  platformfees=0.2/100*loanamount;
											double totalloanamount=loanamount-documentfees-insurancefees-platformfees;
											
											
											String yourfees="----------------Your loan charges-------------------";
											for (int i = 0; i < yourfees.length(); i++) {
												System.out.print(yourfees.charAt(i));  // print character without new line
	                                            Thread.sleep(100);
                                            }
											
											Thread.sleep(2000);
											System.out.println("\n----------Documentaion Fees 0.5%:"+documentfees);
											Thread.sleep(2000);
											System.out.println("\n----------Insurance Fees 10%:"+insurancefees);
											Thread.sleep(2000);
											System.out.println("\n----------Platform Fees 0.2%:"+platformfees);
											
											Thread.sleep(2000);
											
											System.out.println("\n---------------Total Amount Credit in Your Account is"+" "+"Rs."+totalloanamount+"--------------");
											
											int sys_otp=(int)(Math.random()*9999+9999);
											System.out.println("\nMESSAGE*-------");
											
											System.out.println("\n\n\n Hello ["+name+"],\n  To continue your loan request of"+" "+ "Rs."+loanamount+" "+" please enter OTP:"+" "+ sys_otp+"."); 
											Thread.sleep(2000);
											
											
											
											
											System.out.println("------------Enter Your OTP-----------:");
											enterotp=sc.nextInt();
											
											if(sys_otp!=enterotp)
											{
												String invalidotp="-----------------Invalid OTP------------";
												
											    for (int i = 0; i < invalidotp.length(); i++) {
													System.out.print(invalidotp.charAt(i));  // print character without new line
	                                                Thread.sleep(100);
                                                }
											}
											else if(sys_otp==enterotp)
											{
											
											System.out.println("\n");
											String documentsub="********Sumbit These Documents************";
											for (int i = 0; i < documentsub.length(); i++) {
													System.out.print(documentsub.charAt(i));  // print character without new line
	                                                Thread.sleep(100);
											}
											
											Thread.sleep(2000);
											System.out.println("\n----------Aadhar Card-----------------");
											Thread.sleep(2000);
											System.out.println("\n----------Pan Card--------------------");
					
											Thread.sleep(2000);
											System.out.println("\n----------Salary Certificate----------");
											Thread.sleep(2000);
											System.out.println("\n----------Bank Passbook----------------");
											
											System.out.println("\n\n\n");
											String successfull="---------*****After Submition of These Documents Your Loan Amount Will be Credited Within Two Days*****----------";
											String greeting="******Loan approved, future unlocked!*******";
											
											for (int i = 0; i < successfull.length(); i++) {
													System.out.print(successfull.charAt(i));  // print character without new line
	                                                Thread.sleep(100);
											}
											
											
												
											System.out.println("\n\n\n\n");
											
											for (int i = 0; i < greeting.length(); i++) {
													System.out.print(greeting.charAt(i));  // print character without new line
	                                                Thread.sleep(100);
											}
											
											
											
											
											
											
											
											
											
											
											break;
											}
											}
			                            }
			                            case 2:
									    {
											String text = "*******Thank You"+" "+name+" "+"For Spending Valuable Time*******";
        
                                            for (int i = 0; i < text.length(); i++) {
												System.out.print(text.charAt(i));  // print character without new line
	                                            Thread.sleep(100);
                                            }
				                            break;
				
			                            }
			
		                           }
								   }
			
					           }  
						   }
						   else if(!(pano.charAt(0)>='A') || !(pano.charAt(0)<='Z') || !(pano.charAt(1)>='A') || !(pano.charAt(1)<='Z') || !(pano.charAt(2)>='A') || !(pano.charAt(2)<='Z') || !(pano.charAt(3)>='A') || !(pano.charAt(3)<='Z') || !(pano.charAt(4)>='A') || !(pano.charAt(4)<='Z') || !(pano.charAt(5)>='0') || !(pano.charAt(5)<='9') || !(pano.charAt(6)>='0') || !(pano.charAt(6)<='9') || !(pano.charAt(7)>='0') || !(pano.charAt(7)<='9') || !(pano.charAt(8)>='0') || !(pano.charAt(8)<='9') || !(pano.charAt(9)>='A') || !(pano.charAt(9)<='Z'))
						   {
							   System.out.println("\n*****Invalid PAN number*****");
						   }
							
					   }
				  }
			}
		}
		
		
		}
		
	}
		
}
}
