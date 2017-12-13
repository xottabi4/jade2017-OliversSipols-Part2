package zoo;

import java.util.ArrayList;
import java.util.Date;

import zoo.Shops;
import zoo.Ticket;
import zoo.Visitor;

public class Zoo{
    ArrayList<Visitor> visitors = new ArrayList<Visitor>();
    Shops shops = new Shops();
    
    public Zoo(){
    }

    public ArrayList<Visitor> getVisitors(){
        return visitors;
    }

    public Shops getShops(){
        return shops;
    }

    public Visitor visitorNew(String name){
        visitors.add(new Visitor(name));
        return visitors.get(visitors.size() - 1);
    }

    public void sellTicket(Visitor visitor){
        System.out.println("Visitor " + visitor.getName() + " is buying a ticket");
        visitor.buyTicket(shops.sellTicket(visitor.useVoucher()));        
    }

    public void sellTickets(){
        for(int i = 0; i < visitors.size(); i++){
            sellTicket(visitors.get(i));
            System.out.println("-----------------------------------------");                    
        }
    }
}
