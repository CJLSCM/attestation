package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Cat extends Pets{
    public Cat(String name, LocalDate birthday, String commands, String className) {
        super(name, birthday, commands, className);
    }
}
