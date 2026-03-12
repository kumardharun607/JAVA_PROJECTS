import java.util.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Bus_management_System {

	static Scanner sc=new Scanner(System.in);
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	static EntityManager em=emf.createEntityManager();
	static EntityTransaction et=em.getTransaction();
	
	public void insert_bus()
	{
		System.out.print("Enter Id:");
		int id=sc.nextInt();
		
		Bus b=em.find(Bus.class, id);
		if(b!=null)
		{
			System.out.println("Already bus is there!...");
		}
		else {
			System.out.print("Enter Bus Number:");
			String busno=sc.next();
			System.out.println("Enter From Location:");
			String fromloc=sc.next();
			System.out.println("Enter To Location:");
			String toloc=sc.next();
			System.out.println("Enter capacity:");
			int capacity=sc.nextInt();
			System.out.println("Enter Ticket price:");
			double tprice=sc.nextDouble();
			b=new Bus();
			b.setId(id);
			b.setBusNumber(busno);
			b.setFromLocation(fromloc);
			b.setToLocation(toloc);
			b.setCapacity(capacity);
			b.setTicketPrice(tprice);
			et.begin();
			em.persist(b);
			et.commit();
			System.out.println("Bus added successfully...");
			
		}
		
		
		
	}
	public void display_all_bus_records()
	{
		Query q=em.createQuery("SELECT B FROM Bus B ");
		List<Bus> l=q.getResultList();
		if(l.isEmpty())
		{
			System.out.println("There is no bus available in this management...");
		}
		else
		{
			System.out.println("Bus details....");
			for(Bus b:l)
			{
				System.out.println(b);
			}
		}
	}
	public void display_all_bus_records_by_id()
	{
		System.out.print("Enter bus ID:");
		int id=sc.nextInt();
		Bus b=em.find(Bus.class, id);
		if(b==null)
		{
			System.out.println("There is no bus for your entering ID");
		}
		else {
			System.out.println("Bus details.....");
			System.out.println(b);
			
		}
		
		}
	public void update_bus_number_by_id()
	{
		System.out.print("Enter bus ID:");
		int id=sc.nextInt();
		Bus b=em.find(Bus.class, id);
		if(b==null)
		{
			System.out.println("There is no Bus for your entering ID");
		}
		else {
			System.out.print("Enter Bus Number:");
			String busno=sc.next();
			
			
			b.setBusNumber(busno);
			
			et.begin();
			em.merge(b);
			et.commit();
			System.out.println("Bus details updated successfully!....");
			System.out.println(b);
			
		}
		
	}
	public void update_bus_capacity_by_id()
	{
		System.out.print("Enter bus ID:");
		int id=sc.nextInt();
		Bus b=em.find(Bus.class, id);
		if(b==null)
		{
			System.out.println("There is no Bus for your entering ID");
		}
		else {
			
			System.out.println("Enter capacity:");
			int capacity=sc.nextInt();
		
			
			b.setCapacity(capacity);
			
			et.begin();
			em.merge(b);
			et.commit();
			System.out.println("Bus details updated successfully!....");
			System.out.println(b);
			
		}
		
	}
	public void update_bus_From_to_by_id()
	{
		System.out.print("Enter bus ID:");
		int id=sc.nextInt();
		Bus b=em.find(Bus.class, id);
		if(b==null)
		{
			System.out.println("There is no Bus for your entering ID");
		}
		else {
			
			System.out.println("Enter From Location:");
			String fromloc=sc.next();
			System.out.println("Enter To Location:");
			String toloc=sc.next();
			
			
			b.setFromLocation(fromloc);
			b.setToLocation(toloc);
			
			et.begin();
			em.merge(b);
			et.commit();
			System.out.println("Bus details updated successfully!....");
			System.out.println(b);
			
		}
		
	}
	public void update_bus_tprice_by_id()
	{
		System.out.print("Enter bus ID:");
		int id=sc.nextInt();
		Bus b=em.find(Bus.class, id);
		if(b==null)
		{
			System.out.println("There is no Bus for your entering ID");
		}
		else {
			
			System.out.println("Enter Ticket price:");
			double tprice=sc.nextDouble();
		
			b.setTicketPrice(tprice);
			et.begin();
			em.merge(b);
			et.commit();
			System.out.println("Bus details updated successfully!....");
			System.out.println(b);
			
		}
		
	}
	public void delete_bus_record_by_id()
	{
		System.out.print("Enter bus ID:");
		int id=sc.nextInt();
		Bus b=em.find(Bus.class, id);
		if(b==null)
		{
			System.out.println("There is no Bus for your entering ID");
		}
		else {
			
			et.begin();
			em.remove(b);
			et.commit();
			System.out.println("Bus details Removed successfully!....");
			
			
		}
		
	}
	public void display_bus_record_by_greatercapacity()
	{
		
			System.out.println("Enter capacity:");
			int capacity=sc.nextInt();
			Query q=em.createQuery("SELECT B FROM Bus B WHERE B.Capacity>=?1");
			q.setParameter(1, capacity);
			List<Bus> l=q.getResultList();
			if(l.isEmpty())
			{
				System.out.println("Ther is no bus available for greater than your entering capacity");
				
			}
			else
			{
				System.out.println("Bus details......");
				for(Bus b:l)
				{
					System.out.println(b);
				}
			}
			
			
		
		
	}
	public void display_bus_record_by_fromLocation()
	{
		
			System.out.println("Enter From Location:");
			String fromloc=sc.next();
			Query q=em.createQuery("SELECT B FROM Bus B WHERE B.FromLocation=?1");
			q.setParameter(1, fromloc);
			List<Bus> l=q.getResultList();
			if(l.isEmpty())
			{
				System.out.println("Ther is no bus available for your entering Bus Location");
				
			}
			else
			{
				System.out.println("Bus details......");
				for(Bus b:l)
				{
					System.out.println(b);
				}
			}
			
			
		
		
	}
	public void display_bus_record_by_toLocation()
	{
		
			System.out.println("Enter To Location:");
			String toloc=sc.next();
			Query q=em.createQuery("SELECT B FROM Bus B WHERE B.ToLocation=?1");
			q.setParameter(1, toloc);
			List<Bus> l=q.getResultList();
			if(l.isEmpty())
			{
				System.out.println("Ther is no bus available for your entering Bus Location");
				
			}
			else
			{
				System.out.println("Bus details......");
				for(Bus b:l)
				{
					System.out.println(b);
				}
			}
			
			
		
		
	}
	public void display_bus_record_by_fromLocation_and_toLocation()
	{
		

		
		System.out.println("Enter From Location:");
		String fromloc=sc.next();
			System.out.println("Enter To Location:");
			String toloc=sc.next();
			Query q=em.createQuery("SELECT B FROM Bus B WHERE B.ToLocation=?1 and B.FromLocation=?2");
			q.setParameter(1, toloc);
			q.setParameter(2, fromloc);
			List<Bus> l=q.getResultList();
			if(l.isEmpty())
			{
				System.out.println("Ther is no bus available for your entering Bus Location");
				
			}
			else
			{
				System.out.println("Bus details......");
				for(Bus b:l)
				{
					System.out.println(b);
				}
			}
			
			
		
		
	}
	public void display_bus_record_by_sorted_busnumber()
	{
		

		
			Query q=em.createQuery("SELECT B FROM Bus B ORDER BY B.busNumber ASC");
			
			List<Bus> l=q.getResultList();
			if(l.isEmpty())
			{
				System.out.println("Ther is no data!....");
				
			}
			else
			{
				System.out.println("Bus details......");
				for(Bus b:l)
				{
					System.out.println(b);
				}
			}
			
			
		
		
	}
	public void display_bus_record_by_sorted_capacity()
	{
		

		
			Query q=em.createQuery("SELECT B FROM Bus B ORDER BY B.Capacity ASC");
			
			List<Bus> l=q.getResultList();
			if(l.isEmpty())
			{
				System.out.println("Ther is no data!....");
				
			}
			else
			{
				System.out.println("Bus details......");
				for(Bus b:l)
				{
					System.out.println(b);
				}
			}
			
			
		
		
	}
	public void display_bus_record_by_sorted_ticketPrice()
	{
		

		
			Query q=em.createQuery("SELECT B FROM Bus B ORDER BY B.TicketPrice ASC");
			
			List<Bus> l=q.getResultList();
			if(l.isEmpty())
			{
				System.out.println("Ther is no data!....");
				
			}
			else
			{
				System.out.println("Bus details......");
				for(Bus b:l)
				{
					System.out.println(b);
				}
			}
			
			

		
	}
	public void display_bus_record_by_lesscapacity()
	{
		
			System.out.println("Enter capacity:");
			int capacity=sc.nextInt();
			Query q=em.createQuery("SELECT B FROM Bus B WHERE B.Capacity<=?1");
			q.setParameter(1, capacity);
			List<Bus> l=q.getResultList();
			if(l.isEmpty())
			{
				System.out.println("Ther is no Bus available for less than your entering capacity");
				
			}
			else
			{
				System.out.println("Bus details......");
				for(Bus b:l)
				{
					System.out.println(b);
				}
			}
			
			
		
		
	}
	public void display_bus_record_by_greaterTicketPrice()
	{
		
			System.out.println("Enter Ticket Price:");
			int Tprice=sc.nextInt();
			Query q=em.createQuery("SELECT B FROM Bus B WHERE B.TicketPrice>=?1");
			q.setParameter(1, Tprice);
			List<Bus> l=q.getResultList();
			if(l.isEmpty())
			{
				System.out.println("Ther is no bus available for greater than your entering ticket price");
				
			}
			else
			{
				System.out.println("Bus details......");
				for(Bus b:l)
				{
					System.out.println(b);
				}
			}
			
			
		
		
	}
	public void display_bus_record_by_lessTicketPrice()
	{
		
			System.out.println("Enter Ticket Price:");
			int Tprice=sc.nextInt();
			Query q=em.createQuery("SELECT B FROM Bus B WHERE B.TicketPrice<=?1");
			q.setParameter(1, Tprice);
			List<Bus> l=q.getResultList();
			if(l.isEmpty())
			{
				System.out.println("Ther is no bus available for less than your entering TICKET PRICE");
				
			}
			else
			{
				System.out.println("Bus details......");
				for(Bus b:l)
				{
					System.out.println(b);
				}
			}
			
			
		
		
	}
	public void display_bus_record_by_greatercapacity_and_less_price()
	{
		System.out.println("Enter Ticket Price:");
		int Tprice=sc.nextInt();
			System.out.println("Enter capacity:");
			int capacity=sc.nextInt();
			Query q=em.createQuery("SELECT B FROM Bus B WHERE B.Capacity>=?1 and B.TicketPrice<=?2");
			q.setParameter(1, capacity);
			q.setParameter(2, Tprice);
			List<Bus> l=q.getResultList();
			if(l.isEmpty())
			{
				System.out.println("Ther is no bus available for greater than your entering capacity and less than ticket price");
				
			}
			else
			{
				System.out.println("Bus details......");
				for(Bus b:l)
				{
					System.out.println(b);
				}
			}
			
			
		
		
	}
	public void display_bus_record_tosearch_by_busnumber()
	{
		

		System.out.print("Enter Your Bus Number:");
		String busno=sc.next();
			Query q=em.createQuery("SELECT B FROM Bus B WHERE B.busNumber LIKE ?1");
			q.setParameter(1, "%"+busno+"%");
			List<Bus> l=q.getResultList();
			if(l.isEmpty())
			{
				System.out.println("Ther is no data!....");
				
			}
			else
			{
				System.out.println("Bus details......");
				for(Bus b:l)
				{
					System.out.println(b);
				}
			}
			
			
		
		
	}
	public void display_bus_record_tosearch_by_fromLoc_and_toloc()
	{
		

		System.out.println("Enter From Location:");
		String fromloc=sc.next();
			System.out.println("Enter To Location:");
			String toloc=sc.next();
			Query q=em.createQuery("SELECT B FROM Bus B WHERE B.ToLocation LIKE ?1 and B.FromLocation LIKE ?2");
			q.setParameter(1, "%"+toloc+"%");
			q.setParameter(2, "%"+fromloc+"%");
			List<Bus> l=q.getResultList();
			if(l.isEmpty())
			{
				System.out.println("Ther is no data!....");
				
			}
			else
			{
				System.out.println("Bus details......");
				for(Bus b:l)
				{
					System.out.println(b);
				}
			}
			
			
		
		
	}
	
	
	}
	
	
	


