package Hospital_Management_1_to_1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Persistence;
import java.util.*;

public class one_to_one_Dao {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	static EntityManager em=emf.createEntityManager();
	static EntityTransaction et=em.getTransaction();
	static Scanner sc=new Scanner(System.in);
	
	public void register_patient()
	{
		System.out.println("Enter a Patient Id:");
		int id=sc.nextInt();
		patient patients=em.find(patient.class, id);
		if(patients!=null)
		{
			System.out.println("Already Records Present");
		}
		else {
			patients=new patient();
			
		patients.setPatient_id(id);
		System.out.println("Enter a Patient name:");
		String name=sc.next();
		System.out.println("Enter a Patient Age:");

	    int age=sc.nextInt();
	    System.out.println("Enter a Patient Gender:");
		String gender=sc.next();
		System.out.println();
		System.out.println("************************************************");
		System.out.println();

		System.out.println("Let's start to Enter Medical Records:");
		System.out.println();
		System.out.println("Enter medical Record Id:");
		int mid=sc.nextInt();
		MedicalRecord MRecord=em.find(MedicalRecord.class, mid);
		if(MRecord!=null)
		{
			System.out.println("Already Record is Found");
		}
		else {
			MRecord=new MedicalRecord();
			
		MRecord.setRecord_id(mid);
		System.out.println("Enter a Patient Blood Group:");
		String blood_group=sc.next();
		System.out.println("Enter a Patient Allergies:");
		String allergies=sc.next();

		
		
		patients.setName(name);
		patients.setGender(gender);
		patients.setAge(age);
		
		
		MRecord.setAllergies(allergies);
		MRecord.setBlood_group(blood_group);
		MRecord.setPatients(patients);
		patients.setMRecord(MRecord);
		
		et.begin();
		em.persist(patients);
		em.persist(MRecord);
		et.commit();
		
		System.out.println("Data saved!........");
		}
		}
	}
	public void update_Details()
	{
		LinkedHashMap<String,Character> lh=new LinkedHashMap();
		System.out.println("Enter a Patient Id:");
		int id=sc.nextInt();
		patient patients=em.find(patient.class, id);
		if(patients==null)
		{
			System.out.println("There is No Record Found");
		}
		else {
			String s="name,age,gender,MRecord";
			String ss[]=s.split(",");
			for(String s1:ss)
			{
				lh.put(s1, null);
			}
			Set<String> set=lh.keySet();
			for(String s2:set)
			{
				System.out.println("If You Want Update Patient "+s2+" (Y/N): ");
				char c=sc.next().charAt(0);
				lh.put(s2, c);
			}
			String value="";
			for(String s3:set)
			{
				value=lh.get(s3)+"";
			
				if(s3.equalsIgnoreCase("MRecord"))

				{
					if(value.equalsIgnoreCase("Y"))
					{
						System.out.println("Enter a Medical Record Id:");
						int mid=sc.nextInt();
						MedicalRecord MRecord=em.find(MedicalRecord.class, mid);
						if(MRecord==null)
						{
							System.out.println("There is no record found");
						}
						else
						{
							String s4="Blood Group,Allergies";
							String s5[]=s4.split(",");
							LinkedHashMap<String,Character> lh1=new LinkedHashMap();
							for(String s6:s5)
							{
								lh1.put(s6, null);
							}
							Set<String> set1=lh1.keySet();
							for(String s7:set1)
							{
								System.out.println("If You Want Update Medical Record "+s7+" (Y/N):");
								char c1=sc.next().charAt(0);
								lh1.put(s7, c1);
							}
							String value1="";
							for(String s8:set1)
							{
								value1=lh1.get(s8)+"";
								if(value1.equalsIgnoreCase("Y"))
								{
									switch(s8)
									{
									case "Blood Group":{
										System.out.println("Enter a Patient Blood Group:");
										String blood_group=sc.next();
										MRecord.setBlood_group(blood_group);
										break;
									}
									case "Allergies":{
										
										System.out.println("Enter a Patient Allergies:");
										String allergies=sc.next();
										MRecord.setAllergies(allergies);
										
										break;
									}
										
									}
									System.out.println("Medical record updated");
									patients.setMRecord(MRecord);
									et.begin();
									em.merge(MRecord);
									et.commit();
									
									}
								}
							
							
							
						}
						
					}
					
				}
				else if(value.equalsIgnoreCase("Y"))
				{
					switch(s3)
					{
					case "name":{
						System.out.println("Enter a Patient name:");
						String name=sc.next();
						patients.setName(name);
						break;
						
					    
					}
					case "age":{
						System.out.println("Enter a Patient Age:");

					    int age=sc.nextInt();
					    patients.setAge(age);
					    break;
					}
					case "gender":{
						System.out.println("Enter a Patient Gender:");
						String gender=sc.next();
						patients.setGender(gender);
						break;
						
					}
					}
					
					
				}
			}
			
		}
		et.begin();
		em.merge(patients);
		et.commit();
		System.out.println("Data uptaded !.....");
		
		
		
	}
	public void fetch_based_on_patient_details()
	{
		LinkedHashMap<String,Character> lh=new LinkedHashMap();
		System.out.println("Enter a Patient Id:");
		int id=sc.nextInt();
		patient patients=em.find(patient.class, id);
		if(patients==null)
		{
			System.out.println("There is No Record Found");
		}
		else {
			String s="name,age,gender,MRecord";
			String ss[]=s.split(",");
			for(String s1:ss)
			{
				lh.put(s1, null);
			}
			Set<String> set=lh.keySet();
			for(String s2:set)
			{
				System.out.println("If You Want Fetch Patient "+s2+" (Y/N): ");
				char c=sc.next().charAt(0);
				lh.put(s2, c);
			}
			String value="";
			for(String s3:set)
			{
				value=lh.get(s3)+"";
			
				if(s3.equalsIgnoreCase("MRecord"))

				{
					if(value.equalsIgnoreCase("Y"))
					{
//						System.out.println("Enter a Medical Record Id:");
//						int mid=sc.nextInt();
//						MedicalRecord MRecord=em.find(MedicalRecord.class, mid);
//						if(MRecord==null)
//						{
//							System.out.println("There is no record found");
//						}
//						else
//						{
							String s4="Blood Group,Allergies";
							String s5[]=s4.split(",");
							LinkedHashMap<String,Character> lh1=new LinkedHashMap();
							for(String s6:s5)
							{
								lh1.put(s6, null);
							}
							Set<String> set1=lh1.keySet();
							for(String s7:set1)
							{
								System.out.println("If You Want Fetch Medical Record "+s7+" (Y/N):");
								char c1=sc.next().charAt(0);
								lh1.put(s7, c1);
							}
							String value1="";
							for(String s8:set1)
							{
								value1=lh1.get(s8)+"";
								if(value1.equalsIgnoreCase("Y"))
								{
									switch(s8)
									{
									case "Blood Group":{
										System.out.println("Blood Group:");
										System.out.println(patients.getMRecord().getBlood_group());
										break;
									}
									case "Allergies":{
										System.out.println("Allergies:");
										System.out.println(patients.getMRecord().getAllergies());
										
										break;
									}
										
									}
									
									
									}
								}
							
							
							
				//		}
						
					}
					
				}
				else if(value.equalsIgnoreCase("Y"))
				{
					switch(s3)
					{
					case "name":{
						System.out.println("Patient Name:");
					System.out.println(	patients.getName());
						
						break;
						
					    
					}
					case "age":{
						System.out.println("Patient Name:");
						System.out.println(patients.getAge());
					    break;
					}
					case "gender":{
						System.out.println("Patient Gender:");
						System.out.println(patients.getGender());
						break;
						
					}
					}
					
					
				}
			}
			
		}
		
		
	}
	public void fetch_based_on_MRecord_details()
	{
		LinkedHashMap<String,Character> lh=new LinkedHashMap();
		System.out.println("Enter a MRecord Id:");
		int id=sc.nextInt();
		MedicalRecord Mrecord=em.find(MedicalRecord.class, id);
		if(Mrecord==null)
		{
			System.out.println("There is No Record Found");
		}
		else {
			String s="name,age,gender,MRecord";
			String ss[]=s.split(",");
			for(String s1:ss)
			{
				lh.put(s1, null);
			}
			Set<String> set=lh.keySet();
			for(String s2:set)
			{
				System.out.println("If You Want Fetch Patient "+s2+" (Y/N): ");
				char c=sc.next().charAt(0);
				lh.put(s2, c);
			}
			String value="";
			for(String s3:set)
			{
				value=lh.get(s3)+"";
			
				if(s3.equalsIgnoreCase("MRecord"))

				{
					if(value.equalsIgnoreCase("Y"))
					{
//						System.out.println("Enter a Medical Record Id:");
//						int mid=sc.nextInt();
//						MedicalRecord MRecord=em.find(MedicalRecord.class, mid);
//						if(MRecord==null)
//						{
//							System.out.println("There is no record found");
//						}
//						else
//						{
							String s4="Blood Group,Allergies";
							String s5[]=s4.split(",");
							LinkedHashMap<String,Character> lh1=new LinkedHashMap();
							for(String s6:s5)
							{
								lh1.put(s6, null);
							}
							Set<String> set1=lh1.keySet();
							for(String s7:set1)
							{
								System.out.println("If You Want Fetch Medical Record "+s7+" (Y/N):");
								char c1=sc.next().charAt(0);
								lh1.put(s7, c1);
							}
							String value1="";
							for(String s8:set1)
							{
								value1=lh1.get(s8)+"";
								if(value1.equalsIgnoreCase("Y"))
								{
									switch(s8)
									{
									case "Blood Group":{
										System.out.println("Blood Group:");
										System.out.println(Mrecord.getBlood_group());
										break;
									}
									case "Allergies":{
										System.out.println("Allergies:");
										System.out.println(Mrecord.getAllergies());
										
										break;
									}
										
									}
									
									
									}
								}
							
							
							
				//		}
						
					}
					
				}
				else if(value.equalsIgnoreCase("Y"))
				{
					switch(s3)
					{
					case "name":{
						System.out.println("Patient Name:");
					System.out.println(	Mrecord.getPatients().getName());
						
						break;
						
					    
					}
					case "age":{
						System.out.println("Patient Name:");
						System.out.println(Mrecord.getPatients().getAge());
					    break;
					}
					case "gender":{
						System.out.println("Patient Gender:");
						System.out.println(Mrecord.getPatients().getGender());
						break;
						
					}
					}
					
					
				}
			}
			
		}
		
		
	}
	
	

}
