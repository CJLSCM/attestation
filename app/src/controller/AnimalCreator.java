package controller;

import model.*;

import java.time.LocalDate;

public class AnimalCreator {

    public static Animal createAnimal(String name, LocalDate date, String commands, String className) {
        switch (className) {
            case "кот":
                return new Cat(name, date, commands, className);
            case "собака":
                return new Dog(name, date, commands, className);
            case "лошадь":
                return new Horse(name, date, commands, className);
            case "верблюд":
                return new Camel(name, date, commands, className);
            default:
                return null;
        }
    }
}
