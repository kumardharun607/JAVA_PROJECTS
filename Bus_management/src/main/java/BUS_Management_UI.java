import java.util.*;
public class BUS_UI {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Bus_management_System bm=new Bus_management_System();
		boolean flag=true;
		do {
			System.out.println("\t\t\t.........****WELCOME TO OUR BUS MANAGEMENT SYSTEM****.........");
			System.out.println();
			System.out.println();
			System.out.println("\t\t\t1)To Insert Bus Details "
					+ "\n\t\t\t2)Update Bus Number By  ID "
					+ "\n\t\t\t3)Update Bus Capacity By  ID "
					+ "\n\t\t\t4)Update Bus From and To Location By  ID "
					+ "\n\t\t\t5)Update Bus Ticket Price By  ID "
					+ "\n\t\t\t6)Delete Records by ID "
					+ "\n\t\t\t7)Display Bus Details By  ID "
					+ "\n\t\t\t8)Display All The Bus Details "
					+ "\n\t\t\t9)Display Bus Details With greater Than given Capacity "
					+ "\n\t\t\t10)Display Bus Details With Less Than given Capacity "
					+ "\n\t\t\t11)Display Bus Details With greater Than given Bus Ticket Price "
					+ "\n\t\t\t12)Display Bus Details With Less Than given Bus Ticket Price "
					+ "\n\t\t\t13)Display Bus Details With greater Than given Capacity and less Than given Bus Ticket Price "
					+ "\n\t\t\t14)Display Bus Details Running From a Specific From Location "
					+ "\n\t\t\t15)Display Bus Details Running From a Specific To Location "
					+ "\n\t\t\t16)Display Bus Details Running Between a Specific From Location and To Location "
					+ "\n\t\t\t17)Display Bus Details Sorted by Bus Number "
					+ "\n\t\t\t18)Display Bus Details Sorted by Bus Capacity "
					+ "\n\t\t\t19)Display Bus Details Sorted by Bus Ticket Price "
					+ "\n\t\t\t20)Search by Bus details based From location and To Location "
					+ "\n\t\t\t21)Search by Bus details based on Bus Number "
					+ "\n\t\t\t22)EXIT ");
			
			System.out.print("Enter Your Option : ");
			int opt=sc.nextInt();
			switch(opt)
			{
			case 1:{
				bm.insert_bus();
				break;
			}
			case 2:{
				bm.update_bus_number_by_id();
				break;
			}
			case 3:{
				bm.update_bus_capacity_by_id();
				break;
			}
			case 4:{
				bm.update_bus_From_to_by_id();
				break;
			}
			case 5:{
				bm.update_bus_tprice_by_id();
				break;
			}
			case 6:{
			
				bm.delete_bus_record_by_id();
				break;
			}
			case 7:{
				bm.display_all_bus_records_by_id();
				break;
			}
			case 8:{
				bm.display_all_bus_records();
				break;
			}
			case 9:{
				bm.display_bus_record_by_greatercapacity();
				break;
			}
			case 10:{
				bm.display_bus_record_by_lesscapacity();
				break;
			}
			case 11:{
				bm.display_bus_record_by_greaterTicketPrice();
				break;
			}
			case 12:{
				bm.display_bus_record_by_lessTicketPrice();
				break;
			}
			case 13:{
				bm.display_bus_record_by_greatercapacity_and_less_price();
				break;
			}
			case 14:{
				bm.display_bus_record_by_fromLocation();
				break;
			}
			case 15:{
				bm.display_bus_record_by_toLocation();
				break;
			}
			case 16:{
				bm.display_bus_record_by_fromLocation_and_toLocation();
				break;
			}
			case 17:{
				bm.display_bus_record_by_sorted_busnumber();
				break;
			}
			case 18:{
				bm.display_bus_record_by_sorted_capacity();
				break;
			}
			case 19:{
				bm.display_bus_record_by_sorted_ticketPrice();
				break;
			}
			case 20:{
				bm.display_bus_record_tosearch_by_fromLoc_and_toloc();
				break;
			}
			case 21:{
				bm.display_bus_record_tosearch_by_busnumber();
				break;
			}
			case 22:{
				flag=false;
				break;
			}
			
			default:{
				System.out.println("Invalid_Option");
			}
			}
			
		}while(flag);
	}
}
