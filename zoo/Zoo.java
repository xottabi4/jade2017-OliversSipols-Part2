package zoo;

import java.util.ArrayList;
import java.util.Date;

import zoo.Ticket;
import zoo.Visitor;
public class Zoo{
    ArrayList<Visitor> visitors = new ArrayList<Visitor>();
    Shops shop = new Shops();
    int money = 0;
    
    public Zoo(){
    }

    public void run(int amount){
        for(int i = 0; i < amount; i++){
            visitors.add(new Visitor());
            visitors.get(i).showID();
            visitors.get(i).buyTicket(shop.sellTicket());
        }
    }
}