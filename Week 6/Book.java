/**
 * Created by jc346395 on 27/12/2016.
 */
public abstract class Book {
    private String bookTitle;
    protected double bookPrice;

    Book(String title)
    {
        bookTitle = title;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public abstract void setPrice();
}