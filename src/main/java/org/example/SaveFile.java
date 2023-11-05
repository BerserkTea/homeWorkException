package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public interface SaveFile {
    static void saveFile(String[] string) {
        File file = new File(string[0] + ".txt");
        try (FileWriter writer = new FileWriter(file, true)) {
            for (String typestring : string
            ) {
                writer.write(" <" + typestring + "> " + " ");
            }
            writer.write(System.lineSeparator());
            System.out.println("Данные успешно сохранены в файл " + string[0]);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
            throw new RuntimeException(e);
        }
    }
}
