package zoo;

public class Voucher{
    private static int idCounter = 100000;
    private int ID = 0;
    private boolean valid = true;
    private boolean given = false;
    private double discount = 0.0;

    public Voucher(double discount){  
        idCounter++;
        ID = idCounter;
        this.discount = discount;
        System.out.println("Voucher with ID: " + ID + " and discount: " + discount * 100 + "% created");
    }

    public void used(){
        valid = false;
    }

    public int getID(){
        return ID;
    }

    public double getDiscount(){
        return discount;
    }

    public boolean isValid(){
        return valid;
    }

    public Voucher give(){
        given = true;
        return this;
    }

    public boolean isGiven(){
        return given;
    }
}
