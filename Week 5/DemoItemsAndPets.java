/**
 * Created by jc346395 on 13/12/2016.
 */
public class DemoItemsAndPets {
    public static void main(String[] args)
    {
        ItemSold item1 = new ItemSold(70, "It's cheerful and active", 350);
        System.out.println(item1.getinvNumber());
        System.out.println(item1.getDescription());
        System.out.println(item1.getPrice());
        PetSold pet1 = new PetSold(item1.getinvNumber(),item1.getDescription(),item1.getPrice(),true,true,false);
        System.out.println(pet1.getinvNumber());
        System.out.println(pet1.getDescription());
        System.out.println(pet1.getPrice());
        System.out.println(pet1.isVaccinated());
        System.out.println(pet1.isNeutered());
        System.out.println(pet1.isHousebroken());
        pet1.setHousebroken(true);
        System.out.println(pet1.isHousebroken());

    }
}