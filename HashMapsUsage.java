import java.util.HashMap;

public class HashMapsUsage {
    public static void main(String[] args) {
        String[] species1 = new String[] {"Rose", "Lily", "rose", "Tulip", "LILY", "Daisy"};
        System.out.println("Duplicate species: " + countDuplicateSpecies(species1));
        String[] species2 = new String[] {"Orchid", "Sunflower", "Carnation", "Lily"};
        System.out.println("Duplicate species: " + countDuplicateSpecies(species2));
        String[] species3 = new String[] {"Bambu", "bambu", "BAMBU", "Bambu"};
        System.out.println("Duplicate species: " + countDuplicateSpecies(species3));
    }

    public static int countDuplicateSpecies(String[] speciesNames) {
        HashMap<String, Integer> species = new HashMap<>();
        for (String name : speciesNames) {
            name = name.toLowerCase();
            if (species.get(name) == null) {
                species.put(name, 1);
            } else {
                species.put(name, species.get(name) + 1);
            }
        }

        int counter = 0;
        for (String speciesName : species.keySet()) {
            if (species.get(speciesName) > 1) {
                counter++;
            }
        }
        return counter;
    }
}
