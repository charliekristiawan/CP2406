/**
 * Created by jc346395 on 20/12/2016.
 */
public class BookArray {
    public static void main(String[] args)
    {
        Book book10[] = new Book[10];
        book10[0] = new Fiction("Yeye");
        book10[1] = new Fiction("Helo");
        book10[2] = new Fiction("Arra");
        book10[3] = new Fiction("Bimbim");
        book10[4] = new Fiction("Yo");
        book10[5] = new NonFiction("Cinca");
        book10[6] = new NonFiction("Anyeong");
        book10[7] = new NonFiction("Mewok");
        book10[8] = new NonFiction("Yela");
        book10[9] = new NonFiction("Siti");

        for(Book e: book10)
        {
            System.out.println(e.getBookTitle()+" Price = $" + e.getBookPrice());
        }
    }
}