package mini_project;

import java.util.*;
public class UI {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		boolean flag1=true;
		do {
			System.out.println("1)Patient registration \n2)Logout");
			System.out.println("Enter your option:");
			int opt1=sc.nextInt();
			switch (opt1) {
			case 1: {
				System.out.println("Enter a Id:");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter a name:");
				String name=sc.nextLine();
				while(!(patient.nameverification(name)))
				{
					System.out.println("Please Enter a valid name");
					System.out.println("Enter a name:");
					name=sc.nextLine();
				}
				sc.nextLine();
				System.out.println("Enter a age:");
				int age=sc.nextInt();
				while(!(patient.ageverification(age)))
				{
					System.out.println("Please Enter a valid age");
					System.out.println("Enter a age:");
					age=sc.nextInt();
				}
				sc.nextLine();
				System.out.println("Enter a Blood Group:");
				String bloodgrp=sc.nextLine();
				while(!(patient.bloodgrpverification(bloodgrp)))
				{
					System.out.println("Please Enter a valid blood group");
					System.out.println("Enter a Blood Group:");
					bloodgrp=sc.nextLine();
				}
				System.out.println("-----Registration scucessfull-----");
				patient p=new patient(id,name,age,bloodgrp);
				sc.nextLine();
				boolean flag2=true;
				do {
					System.out.println("1)Admit Patient \n2)AssignTreatment \n"
							+ "3)Update HealthScore \n"
							+ "4)Get Patient ID \n"
							+ "5)Get Patient Name \n"
							+ "6)Get Patient Treatment \n"
							+ "7)Get Patient Health Score \n"
							+ "8)Check Health Status \n"
							+ "9)Exit");
					System.out.println("Enter your option:");
					
					int opt2=sc.nextInt();
				
				switch (opt2) {
				case 1: {
					
					p.admitPatient();
					break;
				}
				case 2:{
					sc.nextLine();
					System.out.println("Enter your treatment:");
					String Treament=sc.nextLine();
					p.assignTreatment(Treament);
					break;
				}
				case 3:{
					sc.nextLine();
					System.out.println("Enter your score:");
					int score=sc.nextInt();
					p.updateHealthscore(score);
					break;
				}
				case 4:{
					System.out.println("Your patient id:"+p.getId());
					break;
				}
				case 5:{
					System.out.println("Your patient Name:"+p.getName());
					break;
				}
				case 6:{
					System.out.println("Your patient Treatment:"+p.getTreatment());
					break;
				}
				case 7:{
					
					System.out.println("Your patient HealthScore:"+p.getHealthscore());
					break;
				}
				case 8:{
					p.CheckHealthStatus();
					
					
					break;
				}
				default:
					flag2=false;
				}
				
				
			}while(flag2);
				break;
			}
				
			default:{
				flag1=false;
				System.out.println("Thank you!.....");
			}
			}
		} while (flag1);
	}

}
