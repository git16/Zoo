import java.util.ArrayList;

/**
 * Created by Vlad on 3/12/2016.
 */
public class Cage {
    public int id = 1;
    public enum cageType {CAGE, PADDOCK, AQUARIUM, TERRARIUM}
    public cageType type;
    public ArrayList<Animal> animalArr;
    int numberOfAnimals = animalArr.size();

    public int getExpensesPerMonth(){
        int expenses = 0;
        for(Animal temp: animalArr){
            expenses += temp.upkeepPerMonth;
        }
        return expenses;
    }

    Cage(cageType type){
        this.id=id++;
        this.type=type;
    }
}
