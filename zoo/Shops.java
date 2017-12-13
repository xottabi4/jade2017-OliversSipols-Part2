package zoo;

import java.util.ArrayList;
import java.util.Date;

import zoo.Ticket;
import zoo.Voucher;
public class Shops{
    ArrayList<Ticket> soldTickets = new ArrayList<Ticket>();
    ArrayList<Voucher> vouchers = new ArrayList<Voucher>();
    double money = 0;
    public Shops(){
        System.out.println("SHOPS OPENED");
    }

    double getMoney(){
        return money;
    }

    public Ticket sellTicket(Voucher voucher){
        Ticket newTicket = new Ticket();
        if (voucher != null && voucher.isValid()){
            System.out.println(
                "Visitor has a voucher with ID: " +voucher.getID() +
                " and discount:" + voucher.getDiscount()*100 + "%");
                newTicket.updatePrice(voucher);
                voucher.used();
        }else{
            System.out.println("Visitor doesn't have valid voucher");
        }
        soldTickets.add(newTicket);
        System.out.println("Ticket SOLD for " + newTicket.getPrice());
        money += newTicket.getPrice();
        return newTicket;
    } 

    public Voucher createVoucher(double percentage){
        vouchers.add(new Voucher(percentage));
        return vouchers.get(vouchers.size()-1);   
    }

    public Voucher giveVoucher(){
        for (int i =0; i < vouchers.size(); i++){
            if (!vouchers.get(i).isGiven()){
                return vouchers.get(i).give();
            }
        }
        return null;
    }
}