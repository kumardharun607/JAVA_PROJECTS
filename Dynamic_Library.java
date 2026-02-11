import java.sql.*;
import java.util.*;
public class Dynamic_Library {

	static Scanner sc=new Scanner(System.in);
	static int id;
	static String title,author,year,publisher,genre;
	public static void main(String[] args) {
		
		boolean flag=true;
		do {
			System.out.println("\t\t\t----------------Welcome--------------");
			
			System.out.println("\t\t\t1)INSERT BOOKS \n\t\t\t2)UPDATE BOOKS \n\t\t\t3)DELETE BOOKS \n\t\t\t4)Search \n\t\t\t5)Get book Details \n\t\t\t6)Book published after the given year \n\t\t\t7)Retrive BOOK b/w the year \n\t\t\t8)Retrive book based on name \n\t\t\t9)Sort book based on name \n\t\t\t10)sort book based on year of published \n\t\t\t11)Dynamic fetching \n\t\t\t12)EXIT");
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
			case 4->{
				search();
			}
			case 5->{
				get_book_details();
			}
			case 6->{
				book_published_after_the_given_year();
			}
			case 7->{
				retrive_book_bw_year();
			}
			case 8->{
				retrive_book_based_name();
			}
			case 9->{
				sort_by_title();
			}
			case 10->{
				sort_by_yearpublished();
			}
			case 11->{
				dynamic_fetch();
			}
			default->{                 //dynamic_fetch()
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
		int yr=sc.nextInt();
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
		pi.setInt(4,yr);
		pi.setString(5,publisher);
		pi.setString(6,genre);
		pi.executeUpdate();
		System.out.println("Insert Successfull....");
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
		int yr=sc.nextInt();
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
		pi.setInt(4,yr);
		pi.setString(5,publisher);
		pi.setString(6,genre);
		pi.executeUpdate();
		System.out.println("Update Successfull....");
		}catch(ClassNotFoundException |SQLException e )
		{
			e.printStackTrace();
		}
	}
	public static void delete() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","1@Sumathi");
		PreparedStatement pi= c.prepareStatement("DELETE FROM BOOKS WHERE ID=?");
		
		pi.setInt(1,id);
		
		
		pi.executeUpdate();
		System.out.println("Deleted Successfull....");
		}catch(ClassNotFoundException |SQLException e )
		{
			e.printStackTrace();
		}
	}
	public static void search() {
		
		
		boolean flag=true;
		do {
			System.out.println("------search------");
			System.out.println("1)Based on Author\n2)Based on Year\n3)Exit");
			int opt=sc.nextInt();
			sc.nextLine();
			switch(opt)
			{
			case 1->{
				System.out.println("Enter Author:");
				author=sc.nextLine();
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","1@Sumathi");
				PreparedStatement pi= c.prepareStatement("SELECT * FROM books WHERE AUTHOR=?");
				
				pi.setString(1,author);
				
				
				
				
				ResultSet rs=pi.executeQuery();
				String ss="GENRE";
				
				while(rs.next())
				{
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println(rs.getInt("Yearpublished"));
					System.out.println(rs.getString("PUBLISHER"));
					System.out.println(rs.getString(ss));
					System.out.println("-----------------------------------------------");
				
				}
				}catch(ClassNotFoundException |SQLException e )
				{
					e.printStackTrace();
				}
			}
			case 2->{
				System.out.println("Enter year:");
				int yr=sc.nextInt();
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","1@Sumathi");
				PreparedStatement pi= c.prepareStatement("SELECT * FROM books WHERE YEARPUBLISHED=?");
				
				pi.setInt(1,yr);
				
				
				
				
				ResultSet rs=pi.executeQuery();
				String ss="GENRE";
				
				while(rs.next())
				{
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println(rs.getString("Yearpublished"));
					System.out.println(rs.getInt("PUBLISHER"));
					System.out.println(rs.getString(ss));
					System.out.println("-----------------------------------------------");
				
				}
				}catch(ClassNotFoundException |SQLException e )
				{
					e.printStackTrace();
				}
			}
			default->{
				flag=false;
			}
			}
			
		}while(flag);
		
	}
	public static void get_book_details()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","1@Sumathi");
			PreparedStatement pi= c.prepareStatement("SELECT * FROM BOOKS");
			ResultSet rs=pi.executeQuery();
			String ss="GENRE";
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt("Yearpublished"));
				System.out.println(rs.getString("PUBLISHER"));
				System.out.println(rs.getString(ss));
				System.out.println("-----------------------------------------------");
			
			}
		}
			
			
			
			catch(ClassNotFoundException |SQLException e )
			{
				e.printStackTrace();
			}
	}
	public static void book_published_after_the_given_year()
	{
		System.out.println("Enter year:");
		
		int yr=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","1@Sumathi");
			PreparedStatement pi= c.prepareStatement("SELECT * FROM BOOKS WHERE YEARPUBLISHED>?");
			pi.setInt(1, yr);
			ResultSet rs=pi.executeQuery();
			String ss="GENRE";
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt("Yearpublished"));
				System.out.println(rs.getString("PUBLISHER"));
				System.out.println(rs.getString(ss));
				System.out.println("-----------------------------------------------");
			
			}
		}
			
			
			
			catch(ClassNotFoundException |SQLException e )
			{
				e.printStackTrace();
			}
	}
	public static void retrive_book_bw_year()
	{
		System.out.println("Enter year 1:");
		
		int yr1=sc.nextInt();
        System.out.println("Enter year 2:");
		
		int yr2=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","1@Sumathi");
			PreparedStatement pi= c.prepareStatement("SELECT * FROM BOOKS WHERE YEARPUBLISHED BETWEEN ? AND ?");
			pi.setInt(1, yr1+1);
			pi.setInt(2, yr2-1);
			ResultSet rs=pi.executeQuery();
			String ss="GENRE";
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt("Yearpublished"));
				System.out.println(rs.getString("PUBLISHER"));
				System.out.println(rs.getString(ss));
				System.out.println("-----------------------------------------------");
			
			}
		}
			
			
			
			catch(ClassNotFoundException |SQLException e )
			{
				e.printStackTrace();
			}
	}
	
	public static void sort_by_title()
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","1@Sumathi");
			PreparedStatement pi= c.prepareStatement("SELECT * FROM BOOKS ORDER BY TITLE ASC");
			
			ResultSet rs=pi.executeQuery();
			String ss="GENRE";
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt("Yearpublished"));
				System.out.println(rs.getString("PUBLISHER"));
				System.out.println(rs.getString(ss));
				System.out.println("-----------------------------------------------");
			
			}
		}
			
			
			
			catch(ClassNotFoundException |SQLException e )
			{
				e.printStackTrace();
			}
	}
	public static void sort_by_yearpublished()
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","1@Sumathi");
			PreparedStatement pi= c.prepareStatement("SELECT * FROM BOOKS ORDER BY YEARPUBLISHED DESC");
			
			ResultSet rs=pi.executeQuery();
			String ss="GENRE";
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt("Yearpublished"));
				System.out.println(rs.getString("PUBLISHER"));
				System.out.println(rs.getString(ss));
				System.out.println("-----------------------------------------------");
			
			}
		}
			
			
			
			catch(ClassNotFoundException |SQLException e )
			{
				e.printStackTrace();
			}
	}
	public static void retrive_book_based_name()
	{
		sc.nextLine();
		System.out.println("Enter title of the book");
		title=sc.nextLine();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","1@Sumathi");
			PreparedStatement pi= c.prepareStatement("SELECT * FROM BOOKS WHERE TITLE LIKE ?");
			pi.setString(1, title+'%');
			ResultSet rs=pi.executeQuery();
			String ss="GENRE";
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt("Yearpublished"));
				System.out.println(rs.getString("PUBLISHER"));
				System.out.println(rs.getString(ss));
				System.out.println("-----------------------------------------------");
			
			}
		}
			
			
			
			catch(ClassNotFoundException |SQLException e )
			{
				e.printStackTrace();
			}
	}
	public static void dynamic_fetch()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_db","root","1@Sumathi");
			PreparedStatement pi= c.prepareStatement("SELECT TITLE,AUTHOR,GENRE FROM BOOKS");
			ResultSet rs=pi.executeQuery();
			String ss="GENRE";
			
			while(rs.next())
			{
				
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				
				
				System.out.println(rs.getString(ss));
				System.out.println("-----------------------------------------------");
			
			}
		}
			
			
			
			catch(ClassNotFoundException |SQLException e )
			{
				e.printStackTrace();
			}
	}
	
		
	
}
