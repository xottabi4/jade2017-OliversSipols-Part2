package zoo;

import java.util.Calendar;
import java.util.Date;

import zoo.Voucher;
public class Ticket{
    private static int idCounter = 10;
    private int ID = 0;
    private double price = 10.00d;
    Date expirationDate = null;
    boolean ticketValid = false;

    public Ticket(){
        idCounter++;
        ID = idCounter;
        Date currentDate = new Date();
        Calendar c = Calendar.getInstance(); 
        c.setTime(currentDate); 
        c.add(Calendar.DATE, 1);
        expirationDate = c.getTime();
        System.out.println("New ticket with expiration date " + expirationDate + " created");
        checkTicketDate();
    }

    public double getPrice(){
        return price;
    }

    public void updatePrice(Voucher voucher){
        price -= price * voucher.getDiscount();
    }
    
    public boolean isTicketValid(){
        checkTicketDate();
        return ticketValid;
    }

    private void checkTicketDate(){
        Date currentDate = new Date();
        if(currentDate.after(expirationDate)){
            ticketValid = false;
        }else{
            ticketValid = true;
        }
    }
}
