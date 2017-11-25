package zoo;

import java.util.ArrayList;
import java.util.Date;

import zoo.Ticket;
import zoo.Voucher;
public class Shops{
    ArrayList<Ticket> soldTickets = new ArrayList<Ticket>();
    ArrayList<Voucher> vouchers = new ArrayList<Voucher>();
    public Shops(int ammountOfVouchers){
        System.out.println("SHOPS OPEN");
        System.out.println("Creating " + ammountOfVouchers + " vouchers");
        createVouchers(ammountOfVouchers);
    }

    public Ticket sellTicket(Voucher voucher){
        if (voucher != null && voucher.valid){
            
        }
        Ticket newTicket = new Ticket(new Date());
        soldTickets.add(newTicket);
        System.out.println("Ticket SOLD");
        return newTicket;
    } 

    public void createVouchers(int ammountOfVouchers){
        System.out.println(ammountOfVouchers);
        for(int i = 0; i < ammountOfVouchers; i++){
            switch(i % 3){
                case 0 : vouchers.add(new Voucher(0.1));
                break;                
                case 1 : vouchers.add(new Voucher(0.15));
                break;
                case 2 : vouchers.add(new Voucher(0.2));
                break;               
            }
        }
    }

    public Voucher giveVoucher(){
        for (int i =0; i < vouchers.size(); i++){
            if (!vouchers.get(i).given){
                return vouchers.get(i).give();
            }
        }
        return null;
    }
}