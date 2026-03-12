package mini_project;
import java.util.*;
public class patient {
	static Scanner sc=new Scanner(System.in);
	private int id;
	private String name;
	private int age;
	private String bloodgroup;
	private boolean admitted;
	private String treatment;
	private int healthscore;

	public patient(int id, String name, int age, String bloodgroup) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.bloodgroup = bloodgroup;
	}
	
	public void admitPatient()
	{
		if(admitted==false)
		{
			admitted=true;
			System.out.println("Patient admitted ");
		}
		else {
			System.out.println("Patient already admitted");
		}
	}
	public void assignTreatment(String treatment)
	{
		if(this.treatment==null && !(treatment.trim().isEmpty()) && admitted)
		{
			this.treatment=treatment;
			System.out.println(name+" Assigned treatment "+treatment);
		}
		else {
			System.out.println("You already taken treatment (or) Entering invalid treatment (or) Your not admitted");
		}
	}
	public void updateHealthscore(int score)
	{
		if(score<0 || score>100)
		{
			System.out.println("invalid score");
		}
		else {
			this.healthscore=score;
			System.out.println("Your health score is updated ");
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTreatment() {
		if(treatment==null)
		{
			sc.nextLine();
			System.out.println("Enter your treatment first:");
			String treatment=sc.nextLine();
			assignTreatment(treatment);
			
		}
		return treatment;
	}

	public int getHealthscore() {
		if(healthscore<=0 || healthscore>100)
		{
			System.out.println("Invalid health score please update your health score");
			System.out.println("Enter your health score:");
			int score =sc.nextInt();
			updateHealthscore(score);
			
		}
		return healthscore;
	}
	public static boolean nameverification(String name)
	{
		return name!=null && !(name.trim().isEmpty());
		
	}
	public static boolean ageverification(int age)
	{
		return !(age<0 && age>100);
		
	}
	public static boolean bloodgrpverification(String bloodgrp)
	{
		ArrayList<String> al=new ArrayList();
		al.add("A+");
		al.add("B+");
		al.add("AB+");
		al.add("A-");
		al.add("B-");
		al.add("AB-");
		al.add("O+");
		al.add("O-");
		
		return al.contains(bloodgrp);
		
	}
	public void CheckHealthStatus()
	{
		if(healthscore<0 || healthscore>100)
		{
			System.out.println("Please Update your score");
			System.out.println("Enter your Health Score:");
			int score=sc.nextInt();
			updateHealthscore(score);
		}
		else {
			if(healthscore<40)
			{
				System.out.println("Critical stage");
			}
			else if(healthscore>=40)
			{
				System.out.println("Stable stage");
			}
		}
		
	}
	
	
	

}
