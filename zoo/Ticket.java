package zoo;

import java.util.Date;
public class Ticket{
    int price = 0;
    Date expirationDate = null;
    boolean ticketValid = false;

    public Ticket(Date date){
        System.out.println("New ticket created");
        expirationDate = date;
        checkTicketDate();
    }

    void checkTicketDate(){
        Date currentDate = new Date();
        System.out.println(currentDate.getTime());
        System.out.println(currentDate);
    }
}
