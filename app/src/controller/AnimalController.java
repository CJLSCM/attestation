package controller;

import model.*;
import repository.AnimalRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class AnimalController {
    private final AnimalRepository repoitory = new AnimalRepository();

    public void addAnimal(String className, Scanner scanner) {
        Animal animal = createAnimal(className, scanner);
        if (!(animal == null)) {
            repoitory.addAnimal(animal);
            System.out.println("Животное: " + animal.getName() + " добавлено в систему.");
        } else System.out.println("Животное не было добавлено в систему.");

    }

    public Animal createAnimal(String className, Scanner scanner) {
        String[] values = InputValues.inputValues(scanner);
        try {
            LocalDate date = InputValidator.validDate(values[1]);
            return AnimalCreator.createAnimal(values[0], date, values[2], className);
        } catch (Exception e) {
            System.out.println("Ошибка при создании записи нового животного.");
        }
        return null;
    }

    public List<Animal> getAllAnimals() {
        return repoitory.getAllAnimals();
    }


    public void addNewCommand(String id) {
        Animal animal = repoitory.findById(Long.parseLong(id));
        System.out.print("\tВведите команду: ");
        Scanner scanner = new Scanner(System.in);
        animal.setCommands(animal.getCommands() + ", " + scanner.nextLine());
        System.out.println("\t Команда добавлена: ");
        System.out.println("\t" + animal);
    }

    public void addStarAinimals() {
        repoitory.addAnimal(new Cat("Васка", LocalDate.of(2022, 12, 24), "кыс-кыс", "кот"));
        repoitory.addAnimal(new Dog("Дружок", LocalDate.of(2020, 01, 03), "фас, голос", "собака"));
        repoitory.addAnimal(new Horse("Гром", LocalDate.of(2018, 10, 15), "Хоп, тише, шагом", "лошадь"));
        repoitory.addAnimal(new Camel("Мул", LocalDate.of(2015, 11, 28), "ГИТ, ДУРР, ХАП-ХАП-ХАП-ХАП", "верблюд"));
    }


}
