package view;


import controller.AnimalController;

import java.util.Scanner;

public class View {
    AnimalController controller = new AnimalController();
    private Scanner scanner = new Scanner(System.in);
    private String choice;

    public void start() {
        controller.addStarAinimals(); // заполнение репозитория стартовыми животными
        choice = "";
        while (true) {
            switch (choice) {
                case "1":
                    printAllAnimal();
                    printMainMenu();
                    break;
                case "2":
                    addAnimal();
                    break;
                case "3":
                    addNewCommand();
                    printMainMenu();
                    break;
                case "4":
                    System.out.println("\tПрограмма завершена.");
                    return;
                default:
                    printMainMenu();

            }
        }
    }

    private void printMainMenu() {
        System.out.println("\n\tВы находитесь главном меню. Выберите один из пунктов:");
        System.out.println("\t1. Вывести список животных.");
        System.out.println("\t2. Добавить новое животное.");
        System.out.println("\t3. Добавить животному новую команду.");
        System.out.println("\t4. Закрыть программу");
        System.out.print("\tВаш выбор: ");
        choice = scanner.nextLine();
    }

    private void printAddAnimalMenu() {
        System.out.println("\n\tМеню добавления нового животного");
        System.out.println("\t1. Добавить домашнее животное");
        System.out.println("\t2. Добавить вьючное животное");
        System.out.println("\t3. Вернуться на шаг назад");
        System.out.print("\tВаш выбор: ");
    }

    private void addAnimal() {
        choice = "";
        while (true) {
            switch (choice) {
                case "1":
                    addPet();
                    break;
                case "2":
                    addPackAnimal();
                    break;
                case "3":
                    return;
                default:
                    printAddAnimalMenu();
                    choice = scanner.nextLine();
            }
        }
    }

    private void printAddPetMenu() {
        System.out.println("\n\tМеню добавления домашнего животного");
        System.out.println("\t1. Добавить кошку");
        System.out.println("\t2. Добавить собаку");
        System.out.println("\t3. Вернуться на шаг назад");
        System.out.print("\tВаш выбор: ");
    }

    private void printAddPackMenu() {
        System.out.println("\n\tМеню добавления домашнего животного");
        System.out.println("\t1. Добавить лошадь");
        System.out.println("\t2. Добавить верблюда");
        System.out.println("\t3. Вернуться на шаг назад");
        System.out.print("\tВаш выбор: ");
    }

    private void addPet() {
        choice = "";
        while (true) {
            switch (choice) {
                case "1":
                    controller.addAnimal("кот", scanner);
                    return;
                case "2":
                    controller.addAnimal("собака", scanner);
                    return;
                case "3":
                    return;
                default:
                    printAddPetMenu();
                    choice = scanner.nextLine();
            }
        }
    }

    private void addPackAnimal() {
        choice = "";
        while (true) {
            switch (choice) {
                case "1":
                    controller.addAnimal("лошадь", scanner);
                    return;
                case "2":
                    controller.addAnimal("верблюд", scanner);
                    return;
                case "3":
                    return;
                default:
                    printAddPackMenu();
                    choice = scanner.nextLine();
            }
        }
    }

    private void printAllAnimal() {
        System.out.println();
        controller.getAllAnimals().stream()
                .forEach(System.out::println);
    }

    private void addNewCommand() {
        System.out.print("\tДля добавления команды, введите id животного: ");
        String id = scanner.nextLine();
        controller.addNewCommand(id);
    }


}
