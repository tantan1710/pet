package service;

import entities.Pet;
import entities.TYPE;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PetService {
    Pet userPet;

    public void match(ArrayList<Pet> petList, Scanner scanner) {
        inputPet(scanner);
        while (true) {
            System.out.println("Thông tin pet ngẫu nhiên: ");
            Pet randomPet = getRandomPet(petList, userPet);
            printPetInfo(randomPet);
            System.out.print("Bạn có muốn tìm chú pet khác không? (Y/N): ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
            } else {
                System.out.println("Kết thúc chương trình.");
                break;
            }
        }

    }

    public void inputPet(Scanner scanner){
        System.out.println("Nhập thông tin pet của bạn:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Species: ");
        String species = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Sex: ");
        String sex = scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        System.out.print("Type (DOG/CAT): ");
        String typeString = scanner.nextLine();
        TYPE type = TYPE.valueOf(typeString.toUpperCase());
        System.out.print("Image: ");
        String image = scanner.nextLine();
        userPet = new Pet (id, name, species, age, sex, description, type, image);
    }

    public Pet getRandomPet(ArrayList<Pet> petList, Pet userPet) {
        Random random = new Random();
        Pet randomPet;
        do {
            randomPet = petList.get(random.nextInt(petList.size()));
        } while (randomPet.getTYPE() != userPet.getTYPE() || randomPet.getSex().equalsIgnoreCase(userPet.getSex()));
        return randomPet;
    }

    public void printPetInfo(Pet pet) {
        System.out.println("ID: " + pet.getId());
        System.out.println("Name: " + pet.getName());
        System.out.println("Species: " + pet.getSpecies());
        System.out.println("Age: " + pet.getAge());
        System.out.println("Sex: " + pet.getSex());
        System.out.println("Description: " + pet.getDescription());
        System.out.println("Image: " + pet.getImages());
    }
}
