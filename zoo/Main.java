package zoo;

import zoo.Ticket;
public class Main {
    public static void main( String[] args ) {
        Zoo zoo = new Zoo();
        zoo.visitorNew("Kate").receiveVoucher(zoo.getShops().createVoucher(0.1d));
        zoo.visitorNew("Danny");
        zoo.visitorNew("Diana").receiveVoucher(zoo.getShops().createVoucher(0.15d));
        zoo.visitorNew("John");        
        zoo.visitorNew("Judith").receiveVoucher(zoo.getShops().createVoucher(0.2d));
        zoo.visitorNew("Victor");
        System.out.println("-----------------------------------------------------");      
        zoo.sellTickets();
        System.out.println("Shop bilance: " +zoo.getShops().getMoney());
    }
}
