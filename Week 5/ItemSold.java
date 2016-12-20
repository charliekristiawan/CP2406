/**
 * Created by jc346395 on 13/12/2016.
 */
public class ItemSold {
    private int invNumber;
    private String description;
    private double price;

    public ItemSold(int invNumber, String description, double price)
    {
        this.invNumber = invNumber;
        this.description = description;
        this.price = price;
    }

    public int getinvNumber() {
        return invNumber;
    }

    public void setNumber(int invNumber) {
        this.invNumber = invNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}