package zoo;

import java.util.ArrayList;

import zoo.Ticket;

public class Visitor{
    static int idCounter = 1000;
    ArrayList<Ticket> tickets = null;
    int ID = 0;

    public Visitor(){
        idCounter++;
        ID = idCounter;
        System.out.println("NEW Visitor");
        tickets = new ArrayList<Ticket>();
    }

    public void buyTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public void showID(){
        System.out.println(ID);
    }
}