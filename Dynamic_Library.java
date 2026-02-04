import java.sql.*;
import java.util.*;
public class Dynamic_Library {

	static Scanner sc=new Scanner(System.in);
	static int id;
	static String title,author,year,publisher,genre;
	public static void main(String[] args)throws Exception {
		
		boolean flag=true;
		do {
			System.out.println("\t\t\t----------------Welcome--------------");
			Thread.sleep(2000);
			System.out.println("\t\t\t1)INSERT BOOKS \n\t\t\t2)UPDATE BOOKS \n\t\t\t3)DELETE BOOKS \n\t\t\t4)EXIT");
			System.out.println("\t\t\tEnter your option:");
			int opt=sc.nextInt();
			switch(opt)
			{
			case 1->{
				insert();
			}
			case 2->{
				update();
				
			}
			case 3->{
				delete();
			}
			default->{
				flag=false;
			}
			}
		}while(flag);
		
	}
	public static void insert()
	{
		System.out.println("Enter id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter title of the book");
		title=sc.nextLine();
		System.out.println("Enter Author:");
		author=sc.nextLine();
		System.out.println("Enter year of published:");
		year=sc.nextLine();
		System.out.println("Enter publisher:");
		publisher=sc.nextLine();
		System.out.println("Enter your Genre");
		genre=sc.nextLine();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","1@Sumathi");
		PreparedStatement pi= c.prepareStatement("INSERT INTO BOOKS VALUES(?,?,?,?,?,?)");
		
		pi.setInt(1,id);
		pi.setString(2,title);
		pi.setString(3,author);
		pi.setString(4,year);
		pi.setString(5,publisher);
		pi.setString(6,genre);
		pi.executeUpdate();
		}catch(ClassNotFoundException |SQLException e )
		{
			e.printStackTrace();
		}
	}
	public static void update()
	{
		System.out.println("Enter id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter title of the book");
		title=sc.nextLine();
		System.out.println("Enter Author:");
		author=sc.nextLine();
		System.out.println("Enter year of published:");
		year=sc.nextLine();
		System.out.println("Enter publisher:");
		publisher=sc.nextLine();
		System.out.println("Enter your Genre");
		genre=sc.nextLine();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","1@Sumathi");
		PreparedStatement pi= c.prepareStatement("UPDATE BOOKS SET ID=?,TITLE=?,AUTHOR=?,YEARPUBLISHED=?,PUBLISHER=?,GENRE=? WHERE ID=?");
		pi.setInt(1,id);
		pi.setInt(7,id);
		pi.setString(2,title);
		pi.setString(3,author);
		pi.setString(4,year);
		pi.setString(5,publisher);
		pi.setString(6,genre);
		pi.executeUpdate();
		}catch(ClassNotFoundException |SQLException e )
		{
			e.printStackTrace();
		}
	}
	public static void delete() {
		sc.nextLine();
		System.out.println("Enter publisher:");
		publisher=sc.nextLine();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","1@Sumathi");
		PreparedStatement pi= c.prepareStatement("DELETE FROM BOOKS WHERE publisher=?");
		
		pi.setString(1,publisher);
		
		pi.executeUpdate();
		}catch(ClassNotFoundException |SQLException e )
		{
			e.printStackTrace();
		}
	}
}
