/**
 * Created by jc346395 on 27/12/2016.
 */
public class UseBook {
    public static void main(String[] args)
    {
        Book book1 = new Fiction("Frozen");
        Book book2 = new NonFiction("Potter");
        System.out.println(book1.getBookPrice());
        System.out.println(book2.getBookTitle());
    }
}