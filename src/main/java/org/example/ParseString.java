package org.example;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class ParseString implements OkParsed {
    public static String ScanString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * Разбиваем строку и проверяем её элементы
     * @param string
     * @return массив из строки
     * @throws GenderInputException неверный пол
     */
    public static String[] parseString (String string) throws GenderInputException, DataInputException {
        String[] splittedString = string.split(" ");
        if     (splittedString[0].matches("^[0-9]*$") ||
                splittedString[1].matches("^[0-9]*$") ||
                splittedString[2].matches("^[0-9]*$")){
            throw new RuntimeException("Неверно введены ФИО");
        }
        if     (splittedString[3].matches("^[a-zA-Z]*$") || checkDate.dateIsOk(splittedString[3])){
            throw new RuntimeException("Неверно введена Дата рождения");
        }
        if     (splittedString[4].matches("^[a-zA-Z]*$")){
            throw new RuntimeException("Неверно введен телефон");
        }
        try{
            Long.parseLong(splittedString[4]);
        }catch (NumberFormatException e){
            System.out.println("Телефон неверный формат");
            e.getStackTrace();
        }
        if (splittedString[5].equals("f") || splittedString[5].equals("m")){
        }else throw new GenderInputException("Введен неверный пол");
        return splittedString;
    }
}
