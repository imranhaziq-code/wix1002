package VIVA3.NIAQ3;


public class Adopter {
    private String name;
    private String preferredSpecies;
    private String preferredAgeRange;

    public Adopter(String name, String preferredSpecies, String preferredAgeRange) {
        this.name = name;
        this.preferredSpecies = preferredSpecies;
        this.preferredAgeRange = preferredAgeRange;
    }

    public String getName() {
        return name;
    }

    public void viewMatchingPets(PetAdoptionCentre centre) {
        for (Pet pet : centre.getPets()) {
            if (!pet.isAdopted() && pet.getSpecies().equalsIgnoreCase(preferredSpecies)) {
                String[] range = preferredAgeRange.split("-");
                int minAge = Integer.parseInt(range[0]);
                int maxAge = Integer.parseInt(range[1]);
                if (pet.getAge() >= minAge && pet.getAge() <= maxAge) {
                    System.out.println(pet.getDetails());
                }
            }
        }
    }
}
