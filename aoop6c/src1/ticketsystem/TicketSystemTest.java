package ticketsystem;

public class TicketSystemTest {
	 public static void main(String[] args) {
	        TicketSystem ticketSystem = new TicketSystem();

	      
	        ticketSystem.addTicket("Issue with login");
	        ticketSystem.addTicket("Unable to reset password");
	        ticketSystem.addTicket("Error while processing payment");

	        
	        ticketSystem.displayPendingTickets();

	        
	        ticketSystem.processNextTicket();

	        
	        ticketSystem.displayPendingTickets();

	       ticketSystem.processNextTicket();
	        ticketSystem.processNextTicket();

	        
	        ticketSystem.processNextTicket();
	    }
}
