package zoo;

public class Voucher{
    static int idCounter = 100000;
    private int ID = 0;
    boolean valid = true;
    boolean given = false;
    double discount = 0.0;

    public Voucher(double discount){  
        idCounter++;
        ID = idCounter;
        this.discount = discount;
        System.out.println("Voucher with ID: " + ID + " and discount: " + discount*100 + "% created");
    }

    public int getID(){
        return ID;
    }

    public double getDiscount(){
        return discount;
    }

    public boolean valid(){
        return valid;
    }

    public Voucher give(){
        given = true;
        return this;
    }

    public boolean given(){
        return given;
    }
}
