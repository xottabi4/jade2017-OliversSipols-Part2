package zoo;

import zoo.Ticket;
public class Main {
    public static void main( String[] args ) {
        Zoo zoo = new Zoo();
        zoo.visitorNew("Danny");
        zoo.visitorNew("Kate").receiveVoucher(zoo.getShops().createVoucher(0.1d));
        zoo.visitorNew("Diana").receiveVoucher(zoo.getShops().createVoucher(0.15d));
        zoo.visitorNew("John");        
        zoo.visitorNew("Judith").receiveVoucher(zoo.getShops().createVoucher(0.2d));
        System.out.println("-----------------------------------------------------");      
        zoo.sellTickets();
        // Kate buying another ticket - Voucher should be invalid
        zoo.sellTicket(zoo.getVisitors().get(1));
        // Checking for multiple tickets
        zoo.getVisitors().get(1).showTickets();
        // Shop bilance
        System.out.println("Shop balance: " + zoo.getShops().getMoney());
    }
}
