package zoo;

import java.util.ArrayList;

import zoo.Ticket;
import zoo.Voucher;

public class Visitor{
    static int idCounter = 1000;
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    ArrayList<Voucher> vouchers = new ArrayList<Voucher>();
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

    public void receiveVoucher(Voucher voucher){
        if (voucher != null){
            vouchers.add(voucher);
            System.out.println("Visitor with ID: " + ID + " received voucher with ID: " +voucher.getID());
        }
    }

    public Voucher useVoucher(){
        for(int i = 0; i < vouchers.size(); i++){
            if (vouchers.get(i).valid()){
                System.out.println(
                    "Using Voucher with ID: " +
                    vouchers.get(i).getID() +
                    " and discount: " +
                    vouchers.get(i).getDiscount() * 100 +
                    "%"
                    );
                return vouchers.get(i);
            }
        }
        return null;
    }
}
