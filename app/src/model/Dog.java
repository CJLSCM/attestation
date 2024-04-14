package model;

import java.time.LocalDate;

public class Dog extends Pets{
    public Dog(String name, LocalDate birthday, String commands, String className) {
        super(name, birthday, commands, className);
    }
}
