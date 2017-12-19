package zoo;

import java.util.LinkedList;
import java.util.List;

public class Zoo{

    private List<Visitor> visitors = new LinkedList<>();
    private Shop shop;

    public Zoo() {
        shop = new Shop(new PriceService());
    }

    public List<Visitor> getVisitors() {
        return visitors;
    }

    public Shop getShop(){
        return shop;
    }

    public Visitor visitorNew(String name){
        visitors.add(new Visitor(name));
        return visitors.get(visitors.size() - 1);
    }

    public void sellTicketUsingVoucher(Visitor visitor, final String zone) {
        System.out.println("Visitor " + visitor.getName() + " is buying a ticket");
        visitor.buyTicket(shop.sellTicket(visitor.useVoucher(), zone));
    }
    public void sellTicket(Visitor visitor, final String zone) {
        System.out.println("Visitor " + visitor.getName() + " is buying a ticket");
        visitor.buyTicket(shop.sellTicket(zone));
    }

    public void sellTickets(){
        for(int i = 0; i < visitors.size(); i++){
            sellTicketUsingVoucher(visitors.get(i), "general");
            System.out.println("-----------------------------------------");                    
        }
    }
}
