package model;

import java.time.LocalDate;

public abstract class PackAnimal extends Animal{

    public PackAnimal(String name, LocalDate birthday, String commands, String className) {
        super(name, birthday, commands, className);
    }
}
