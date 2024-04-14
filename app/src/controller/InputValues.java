package controller;

import java.util.Scanner;

public class InputValues {
    public static String[] inputValues(Scanner scanner) {
        String[] values = new String[3];
        System.out.println("Введите имя животного: ");
        values[0] = scanner.nextLine();
        System.out.println("Введите дату рождения в формате \"дд.мм.гггг\": ");
        values[1] = scanner.nextLine();
        System.out.println("Введите список команд в одну строку");
        values[2] = scanner.nextLine();
        return values;
    }
}
