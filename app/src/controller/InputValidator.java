package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InputValidator {

    public static LocalDate validDate(String birthday) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        try {
            return LocalDate.parse(birthday, formatter);
        } catch (Exception e) {
            System.out.println("Неверно введена дата рождения.");
        }
        return null;
    }
}
