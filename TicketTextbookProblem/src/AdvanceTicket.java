public class AdvanceTicket extends Ticket {
	
	int ticketNumber;
	int days;
	double ticketPrice;
	
	public AdvanceTicket (int ticketNumber, int days){
		super(ticketNumber);
		this.days=days;
		// if the ticket is bought 10 or more days before the event,
		// the price is 30
		if(days>=10) {
			ticketPrice=30;
		}
		// if the ticket is bought less than 10 days before the event,
		// the price is 40
		if(days<10) {
			ticketPrice=40;
		}
	}
	
	// gets ticket price
	public double getPrice() {
		return ticketPrice;
	}
		
	public String toString(){
		return "Number: " + ticketnumber + ", Price : " + getPrice();
	}
}