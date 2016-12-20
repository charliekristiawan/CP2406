/**
 * Created by jc346395 on 13/12/2016.
 */
public class PetSold extends ItemSold {
    private boolean vaccinated;
    private boolean neutered;
    private boolean housebroken;

    public PetSold(int number, String description, double price, boolean vaccinated, boolean neutered, boolean housebroken)
    {
        super(number, description, price);
        this.vaccinated = vaccinated;
        this.neutered = neutered;
        this.housebroken = housebroken;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public boolean isHousebroken() {
        return housebroken;
    }

    public void setHousebroken(boolean housebroken) {
        this.housebroken = housebroken;
    }
}