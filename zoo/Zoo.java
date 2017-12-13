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

    public Shops getShops(){
        return shops;
    }

    public Visitor visitorNew(String name){
        visitors.add(new Visitor(name));
        return visitors.get(visitors.size()-1);
    }

    public void sellTickets(){
        for(int i = 0; i<visitors.size(); i++){
            System.out.println("Visitor " + visitors.get(i).getName() + " is buying a ticket");
            visitors.get(i).buyTicket(shops.sellTicket(visitors.get(i).useVoucher()));
            System.out.println("-----------------------------------------");                    
        }
    }
}
