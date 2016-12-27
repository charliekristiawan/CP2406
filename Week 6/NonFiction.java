/**
 * Created by jc346395 on 27/12/2016.
 */
public class NonFiction extends Book {

    public NonFiction(String title)
    {
        super(title);
        setPrice();
    }

    public void setPrice()
    {
        bookPrice = 37.99;
    }
}