import java.util.ArrayList;

/**
 * Created by Vlad on 3/12/2016.
 */
public class Zoo {
    ArrayList<Cage> cageArr;

    public void putAnimalIntoCage(Animal animal, Cage cage){
        cage.animalArr.add(animal);
        animal.cageId=cage.id;
    }

    public void moveAnimal(Animal animal, Cage destinationCage){
        cageArr.get(animal.cageId).animalArr.remove(animal);
        putAnimalIntoCage(animal, destinationCage);
    }

    public void getReport(){
        int expenses = 0;
        int numberOfAnimals = 0;
        int numberOfCages = cageArr.size();
        for(Cage temp: cageArr){
            expenses += temp.getExpensesPerMonth();
            numberOfAnimals += temp.numberOfAnimals;
        }
        System.out.println("Total expenses per month: $" + expenses);
        System.out.println("Total number of animals: " + numberOfAnimals);
        System.out.println("Total number of cages: " + numberOfCages);
        if ((numberOfAnimals % numberOfCages) > 5)
            System.out.println("Warning: Cages are overcrowded!");
    }

    public void addNewCage(Cage.cageType type){
        cageArr.add(new Cage(type));
    }

}
