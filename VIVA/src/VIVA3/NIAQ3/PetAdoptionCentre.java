package VIVA3.NIAQ3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PetAdoptionCentre {
    private ArrayList<Pet> pets;

    public PetAdoptionCentre() {
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void adoptPet(Pet pet, Adopter adopter) {
        if (pets.contains(pet) && !pet.isAdopted()) {
            pet.adopt(adopter.getName());
        } else {
            System.out.println("Pet is either not in the centre or already adopted.");
        }
    }

    public void viewAvailablePets() {
        Collections.sort(pets, Comparator.comparingInt(Pet::getAge));
        for (Pet pet : pets) {
            if (!pet.isAdopted()) {
                System.out.println(pet.getDetails());
            }
        }
    }

    public Pet getPetByName(String petName) {
        for (Pet pet : pets) {
            if (pet.getName().equalsIgnoreCase(petName)) {
                return pet;
            }
        }
        System.out.println("Pet with name " + petName + " not found.");
        return null;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }
}
