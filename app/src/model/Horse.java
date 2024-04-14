package model;

import java.time.LocalDate;

public class Horse extends PackAnimal{
    public Horse(String name, LocalDate birthday, String commands, String className) {
        super(name, birthday, commands, className);
    }
}
