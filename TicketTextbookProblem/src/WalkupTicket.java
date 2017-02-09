
public class WalkupTicket extends Ticket{
	private int ticketNumber;
	private double ticketPrice;
	
	public WalkupTicket (int ticketNumber){
		super(ticketNumber);
		ticketPrice = 50; // assigns the price of the ticket
	}
	
	// gets ticket price
	public double getPrice() {
		return ticketPrice;
	}
	
	// overriding toString method
	public String toString() {
		return "Number: " + ticketnumber + ", Price : " + getPrice();
		
	}
	
}