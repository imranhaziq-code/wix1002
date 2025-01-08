package VIVA3.NIAQ3;

public class Pet {
    private String name;
    private String species;
    private String breed;
    private int age;
    private String healthRecord;
    private boolean isAdopted;
    private String adopterName;
    
    public Pet(String name, String species, String breed, int age, String healthRecord) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.healthRecord = healthRecord;
        this.isAdopted = false;
        this.adopterName = null;
    }
    
    public void adopt(String adopterName) {
        if(!isAdopted) {
            this.isAdopted = true;
            this.adopterName = adopterName;
        } else {
            System.out.println(name + " has already been adopted");
        }
    }
    
    public String getDetails() {
        return "PetName: " + name +
                "\nSpecies: " + species +
                "\nBreed: " + breed +
                "\nAge: " + age +
                "\nHealthRecord: " + healthRecord + 
                "\nAdopted: " + (isAdopted ? "adopted" : "not adopted") +
                "\nAdopter: " + (adopterName != null ? adopterName + "\n" : "null\n");   
    }
    
    public String getName() {
        return name;
    }
    public String getSpecies() {
        return species;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    public String getHealthRecord() {
        return healthRecord;
    }
    public boolean isAdopted() {
        return isAdopted;
    }
}
