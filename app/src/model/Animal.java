package model;

import controller.Counter;
import repository.AnimalRepository;

import java.time.LocalDate;

public abstract class Animal {
    private Long id;
    private String name;
    private LocalDate birthday;
    private String commands;
    private String className;

    public Animal(String name, LocalDate birthday, String commands, String className) {
        this.id = AnimalRepository.getNextId();
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\t" + className +
                " {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", commands='" + commands + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public String getCommands() {
        return commands;
    }
}
