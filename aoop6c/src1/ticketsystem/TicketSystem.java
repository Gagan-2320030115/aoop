package ticketsystem;
import java.util.LinkedList;
import java.util.Queue;
public class TicketSystem {
	private Queue<Ticket> ticketQueue;

    public TicketSystem() {
        ticketQueue = new LinkedList<>();
    }

    // Add a new ticket to the queue
    public void addTicket(String description) {
        Ticket newTicket = new Ticket(description);
        ticketQueue.add(newTicket);
        System.out.println("Ticket added: " + newTicket);
    }

    // Process (remove) the next ticket in line
    public void processNextTicket() {
        if (!ticketQueue.isEmpty()) {
            Ticket nextTicket = ticketQueue.poll();
            System.out.println("Processing ticket: " + nextTicket);
        } else {
            System.out.println("No tickets to process.");
        }
    }

    // Display all pending tickets
    public void displayPendingTickets() {
        if (!ticketQueue.isEmpty()) {
            System.out.println("Pending Tickets:");
            for (Ticket ticket : ticketQueue) {
                System.out.println(ticket);
            }
        } else {
            System.out.println("No pending tickets.");
        }
    }
}
