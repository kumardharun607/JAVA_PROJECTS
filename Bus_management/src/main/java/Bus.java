import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bus {
	@Id
	private int id;
	private String busNumber;
	private String FromLocation;
	private String ToLocation;
	private int Capacity;
	private double TicketPrice;
	
	Bus()
	{}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", busNumber=" + busNumber + ", FromLocation=" + FromLocation + ", ToLocation="
				+ ToLocation + ", Capacity=" + Capacity + ", TicketPrice=" + TicketPrice + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getFromLocation() {
		return FromLocation;
	}

	public void setFromLocation(String fromLocation) {
		FromLocation = fromLocation;
	}

	public String getToLocation() {
		return ToLocation;
	}

	public void setToLocation(String toLocation) {
		ToLocation = toLocation;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public double getTicketPrice() {
		return TicketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		TicketPrice = ticketPrice;
	}
	
	

}
