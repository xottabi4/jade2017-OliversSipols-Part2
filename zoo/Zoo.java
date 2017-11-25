package zoo;

import java.util.ArrayList;
import java.util.Date;
import zoo.Ticket;
import zoo.Visitor;

public class Zoo{
    ArrayList<Visitor> visitors = new ArrayList<Visitor>();
    Shops shops = null;
    int money = 0;
    int amountOfVisitors = 0;
    
    public Zoo(int amountOfVisitors, int amountOfVouchers){
        this.amountOfVisitors = amountOfVisitors;
        shops = new Shops(amountOfVouchers);
    }

    public void run(){
        for(int i = 0; i < amountOfVisitors; i++){
            visitors.add(new Visitor());
            visitors.get(i).showID();            
            if (i % 2 == 0){
                visitors.get(i).receiveVoucher(shops.giveVoucher());
            }
            visitors.get(i).showID();
            visitors.get(i).buyTicket(shops.sellTicket(visitors.get(i).useVoucher()));
        }
    }
}