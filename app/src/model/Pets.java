package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public abstract class Pets extends Animal{

    public Pets(String name, LocalDate birthday, String commands, String className) {
        super(name, birthday, commands, className);
    }
}
