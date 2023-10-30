import entities.Pet;
import entities.TYPE;
import service.PetService;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(new Pet(1, "Pet1", "Spe1", 3, "Male", "Des1", TYPE.DOG, "Image 1"));
        petList.add(new Pet(2, "Pet2", "Spe2", 2, "Female", "Des2", TYPE.CAT, "Image 2"));
        petList.add(new Pet(3, "Pet3", "Spe3", 4, "Female", "Des3", TYPE.DOG, "Image 3"));
        petList.add(new Pet(4, "Pet4", "Spe4", 5, "Female", "Des4", TYPE.DOG, "Image 4"));
        petList.add(new Pet(5, "Pet5", "Spe5", 2, "Male", "Des5", TYPE.DOG, "Image 5"));
        petList.add(new Pet(6, "Pet6", "Spe6", 6, "Female", "Des6", TYPE.CAT, "Image 6"));
        petList.add(new Pet(7, "Pet7", "Spe7", 7, "Male", "Des7", TYPE.CAT, "Image 7"));
        petList.add(new Pet(8, "Pet8", "Spe8", 1, "Male", "Des8", TYPE.CAT, "Image 8"));
        petList.add(new Pet(9, "Pet9", "Spe9", 2, "Female", "Des9", TYPE.CAT, "Image 9"));
        PetService petService = new PetService();
        petService.match(petList,scanner);
    }
}