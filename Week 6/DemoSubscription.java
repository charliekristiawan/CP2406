/**
 * Created by jc346395 on 20/12/2016.
 */
public class DemoSubscription {

    public static void main(String[] args)
    {
        NewspaperSubscription man1 = new PhysicalNewspaperSubscription("Bob","G15",10);
        NewspaperSubscription man2 = new PhysicalNewspaperSubscription("Bebi","GRT",10);
        NewspaperSubscription man3 = new OnlineNewspaperSubscription("Ala","@bkedd",30);
        NewspaperSubscription man4 = new OnlineNewspaperSubscription("Adee","bsyes",30);
        System.out.println(man1.getRate());
        System.out.println(man2.getRate());
        System.out.println(man3.getRate());
        System.out.println(man4.getRate());
    }
}
