public class Human {

    String name;
    String organism;
    String species;
    String speciesScientificName;
    String origin;
    int speciesAgeInYears;
    String situatedCountry;
    int expectedLifeExpectancy;
    boolean isExtinct;
    boolean isSingleCelledOrganism;
    boolean isPredator;
    String diet;

    public Human(String name, String organism, String species, String speciesScientificName, String origin, int speciesAgeInYears, String situatedCountry, int expectedLifeExpectancy, boolean isExtinct, boolean isSingleCelledOrganism, boolean isPredator, String diet) {
        this.name = name;
        this.organism = organism;
        this.species = species;
        this.speciesScientificName = speciesScientificName;
        this.origin = origin;
        this.speciesAgeInYears = speciesAgeInYears;
        this.situatedCountry = situatedCountry;
        this.expectedLifeExpectancy = expectedLifeExpectancy;
        this.isExtinct = isExtinct;
        this.isSingleCelledOrganism = isSingleCelledOrganism;
        this.isPredator = isPredator;
        this.diet = diet;
    }

    public void speak(String whatToSay, boolean isWhisper){
        System.out.println(this.getClass().getName() + " -> " + new Throwable().getStackTrace()[0].getMethodName());
        System.out.println(isWhisper ? "*Whispering* "+ whatToSay : whatToSay);
    }
}
