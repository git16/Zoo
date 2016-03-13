/**
 * Created by Vlad on 3/12/2016.
 */
public class Animal {
    enum animalType {MAMMAL, BIRD, FISH, REPTILE, AMPHIBIAN, INCECT}
    animalType type;
    String species;
    boolean isPredator;
    int cageId;
    int upkeepPerMonth;

    public Animal(animalType type, String species, boolean isPredator, int upkeepPerMonth) {
        this.type = type;
        this.species = species;
        this.isPredator = isPredator;
        this.upkeepPerMonth = upkeepPerMonth;
    }
}
