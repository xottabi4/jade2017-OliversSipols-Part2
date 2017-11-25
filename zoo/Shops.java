package zoo;

import java.util.ArrayList;
import java.util.Date;

import zoo.Ticket;
public class Shops{
    ArrayList<Ticket> soldTickets = new ArrayList<Ticket>();
    public Shops(){
        System.out.println("SHOPS OPEN");
    }

    public Ticket sellTicket(){
        Ticket newTicket = new Ticket(new Date());
        soldTickets.add(newTicket);
        System.out.println("Ticket SOLD");
        return newTicket;
    } 
}