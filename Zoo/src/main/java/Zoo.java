import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<WaterAnimal> waterAnimals;

    public Zoo(List<WaterAnimal> waterAnimals) {
        this.waterAnimals = waterAnimals;
    }



    public List<WaterAnimal> getWaterAnimals() {
        return waterAnimals;
    }

    List<WaterAnimal> findWaterAnimals(int bound) {
        List<WaterAnimal> waterAnimalsUpperBound = new ArrayList<WaterAnimal>();
        for (WaterAnimal waterAnimal : waterAnimals) {
            if (waterAnimal.getAge() > bound) {
                waterAnimalsUpperBound.add(waterAnimal);
            }
        }
        return waterAnimalsUpperBound;
    }

    List<WaterAnimal> findWaterAnimalsOlderFiveYears() {
        return findWaterAnimals(5);
    }

    void sort() {
        waterAnimals.sort((a, b) -> {

            int compare = a.getClass().getCanonicalName().compareTo(b.getClass().getCanonicalName());

            if (compare > 0) {
                return 1;
            }
            if (compare == 0) {
                return 0;
            }

            return -1;
        });
    }

    public static void main(String[] args) {
        List<WaterAnimal> waterAnimals = new ArrayList<WaterAnimal>();
        waterAnimals.add(new DanioRerio("DanerioReris", 4));
        waterAnimals.add(new SandSifter("SandSifter", 7));
        waterAnimals.add(new SiameseFighting("SiameseFighting", 5));
        waterAnimals.add(new Linckia("Linckia", 10));
        waterAnimals.add(new DanioRerio("DanerioReris", 6));
        waterAnimals.add(new SandSifter("SandSifter", 3));
        waterAnimals.add(new SiameseFighting("SiameseFighting", 4));
        waterAnimals.add(new Linckia("Linckia", 5));
        waterAnimals.add(new DanioRerio("DanerioReris", 4));
        waterAnimals.add(new SandSifter("SandSifter", 3));
        waterAnimals.add(new SiameseFighting("SiameseFighting", 9));
        waterAnimals.add(new Linckia("Linckia", 11));

        Zoo zoo = new Zoo(waterAnimals);
        zoo.sort();
        System.out.println(zoo.getWaterAnimals());
        System.out.println(zoo.findWaterAnimalsOlderFiveYears());
    }
}
