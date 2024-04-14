package repository;

import model.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {
    private static Long idCount = 0L;
    private List<Animal> animals = new ArrayList<>();

    public Animal findById(Long id) {
        return animals.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);

    }

    public List<Animal> getAllAnimals() {
        return List.copyOf(animals);
    }

    public static Long getNextId() {
        return ++idCount;
    }

}
