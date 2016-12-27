/**
 * Created by jc346395 on 27/12/2016.
 */
public class Fiction extends Book {

    public Fiction(String title)
    {
        super(title);
        setPrice();
    }

    public void setPrice()
    {
        bookPrice = 24.99;
    }
}