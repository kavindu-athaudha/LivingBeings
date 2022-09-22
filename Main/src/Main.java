public class Main {

    public static void main(String[] args) {
        String name = "John";
        String organism = "Animal";
        String species = "Mammal";
        String speciesScientificName = "Mammalia";
        String origin = "Africa";
        int speciesAgeInYears = 200_000;
        String situatedCountry = "New Zealand";
        int expectedLifeExpectancy = 80;
        boolean isExtinct = false;
        boolean isSingleCelledOrganism = false;
        boolean isPredator = false;
        String diet = "Omnivore";
        
        Human john = new Human(name, organism, species, speciesScientificName, origin, speciesAgeInYears, situatedCountry, expectedLifeExpectancy, isExtinct, isSingleCelledOrganism, isPredator, diet);
        john.speak("Hello World", false);
    }
}