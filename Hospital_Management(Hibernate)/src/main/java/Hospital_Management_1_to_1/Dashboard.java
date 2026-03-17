package Hospital_Management_1_to_1;
import java.util.*; 
public class Dashboard {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		one_to_one_Dao d=new one_to_one_Dao();
		
		boolean flag1=true;
		do {
			System.out.println("------------------------WELLCOME--------------------");
			System.out.println();
			System.out.println("1)Register Patient: \n2)Update Patient Details: \n3)To Fetch Based on Patient \n4)To Fetch based on Medical Record \n5)Exit: ");
			System.out.println();
			System.out.println("Enter your Option:");
			int opt1=sc.nextInt();
			switch (opt1) {
			case 1:
				d.register_patient();
				break;
				
			case 2:
				d.update_Details();
				break;
				
			case 3:
				d.fetch_based_on_patient_details();
				break;
			case 4:
				d.fetch_based_on_MRecord_details();
				break;
			case 5:
				flag1=false;
				break;

			default:
				System.out.println("Invalid Option...");
				break;
			}
			
			
		} while (flag1);
		

	}

}
