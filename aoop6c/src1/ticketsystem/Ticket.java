package ticketsystem;

public class Ticket {
	private static int counter = 0;
    private int ticketId;
    private String description;

    public Ticket(String description) {
        this.ticketId = ++counter;
        this.description = description;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId + ", Description: " + description;
    }
}
