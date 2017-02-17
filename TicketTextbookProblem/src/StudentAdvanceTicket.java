public class StudentAdvanceTicket extends AdvanceTicket {
	
	private int ticketNumber;
	private int days;
	double ticketPrice;
	
	public StudentAdvanceTicket (int ticketNumber, int days) {
		super(ticketNumber, days);
		this.days = days;
		// if the ticket is bought 10+ days before the event,
		// the price is 15
		if(days >= 10) {
			ticketPrice=15;
		}
		// if the ticket is bought 10- days before the event,
		// the price is 20
		if(days < 10) {
			ticketPrice=20;
		}
	}
	// gets ticket price
	public double getPrice() {
		return ticketPrice;
	}
	
	public String toString(){
		return 
	}
	
}