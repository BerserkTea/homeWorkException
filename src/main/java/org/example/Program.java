package org.example;

import java.io.IOException;

public class Program {
    public static void start() throws GenderInputException,RuntimeException {
        System.out.println("А ну ка введи-ка Фамилия Имя Отчество датарождения номертелефона пол");
//                "Форматы данных:" +
//                "фамилия, имя, отчество - строки " +
//                "датарождения - строка формата dd.mm.yyyy " +
//                "номертелефона - целое беззнаковое число без форматирования" +
//                "пол - символ латиницей f или m.");
        String string = ParseString.ScanString();
        if (OkParsed.itsOkParse(string) == 1) {
                try {
                    SaveFile.saveFile(ParseString.parseString(string));
                } catch (DataInputException e) {
                    throw new RuntimeException(e);
                }

        }
        if (OkParsed.itsOkParse(string) == 0){
//            System.out.println("Пустая строка, ошибка");
            throw new RuntimeException("Пустая строка, ошибка");
        }
        if (OkParsed.itsOkParse(string) == -1){
//            System.out.println("Не все данные внесены, ошибка");
            throw new RuntimeException("Не все данные внесены, ошибка");
        }
        if (OkParsed.itsOkParse(string) == 2){
//            System.out.println("Слишком много данных внесено, ошибка");
            throw new RuntimeException("Слишком много данных внесено, ошибка");
        }
    }
}
