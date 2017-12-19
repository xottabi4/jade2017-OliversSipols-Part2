package zoo;

import java.util.LinkedList;
import java.util.List;

public class Visitor {

    private static int idCounter = 1000;
    private List<Ticket> tickets = new LinkedList<>();
    private List<Voucher> vouchers = new LinkedList<>();
    private int ID = 0;
    private String name = "";

    public Visitor(String name) {
        this.name = name;
        idCounter++;
        ID = idCounter;
        System.out.println("NEW Visitor: " + name);
    }

    public void showTickets() {
        for (Ticket ticket : tickets) {
            System.out.println("Visitor " + name + " has a ticket with ID:" + ticket.getID()
                    + "and zone: " + ticket.getZone());
        }
    }

    public String getName(){
        return name;
    }

    public void buyTicket(Ticket ticket){
        System.out.println("Visitor " + name + " bought a ticket");
        tickets.add(ticket);
    }

    public void showID(){
        System.out.println(ID);
    }

    public void receiveVoucher(Voucher voucher){
        if (voucher != null){
            vouchers.add(voucher);
            System.out.println("Visitor " + name + " with ID: " + ID + 
            " received voucher with ID: " + voucher.getID());
        }
    }

    public Voucher useVoucher() {
        for (Voucher voucher : vouchers) {
            if (voucher.isValid()) {
                System.out.println(
                        "Using Voucher with ID: " + voucher.getID() +
                                " and discount: " + voucher.getDiscount() * 100 + "%");
                return voucher;
            }
        }
        return null;
    }
}
