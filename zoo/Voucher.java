package zoo;

public class Voucher{
    static int idCounter = 1000;
    private int ID = 0;
    public Voucher(){  
        idCounter++;
        ID = idCounter;
        System.out.println("Voucher created");
    }
}