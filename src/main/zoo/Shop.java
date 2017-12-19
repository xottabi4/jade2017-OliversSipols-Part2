package zoo;

import java.util.LinkedList;
import java.util.List;

public class Shop {

    private PriceService priceService;

    private Shop() {
        //nothing to do here
    }

    public Shop(final PriceService priceService) {
        this.priceService = priceService;

        System.out.println("SHOPS OPENED");
    }

    private List<Ticket> soldTickets = new LinkedList<>();
    private List<Voucher> vouchers = new LinkedList<>();
    private double money = 0;

    double getMoney(){
        return money;
    }

    public Ticket sellTicket(final String zone) {
        Ticket newTicket = new Ticket(priceService.determineTicketPrice(zone), zone);
        soldTickets.add(newTicket);
        System.out.println("Ticket SOLD for " + newTicket.getPrice());
        money += newTicket.getPrice();
        return newTicket;
    }

    public Ticket sellTicket(Voucher voucher, final String zone) {
        Ticket newTicket = new Ticket(priceService.determineTicketPrice(zone), zone);
        if (voucher != null && voucher.isValid()) {
            System.out.println(
                    "Visitor has a voucher with ID: " + voucher.getID() +
                            " and discount:" + voucher.getDiscount() * 100 + "%");
            newTicket.updatePrice(voucher);
            voucher.used();
        } else {
            System.out.println("Visitor doesn't have valid voucher");
        }
        soldTickets.add(newTicket);
        System.out.println("Ticket SOLD for " + newTicket.getPrice());
        money += newTicket.getPrice();
        return newTicket;
    } 

    public Voucher createVoucher(double percentage){
        vouchers.add(new Voucher(percentage));
        return vouchers.get(vouchers.size() - 1);   
    }

    public Voucher giveVoucher(){
        for (int i = 0; i < vouchers.size(); i++){
            if (!vouchers.get(i).isGiven()){
                return vouchers.get(i).give();
            }
        }
        return null;
    }
}
