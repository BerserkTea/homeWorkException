package org.example;

public interface OkParsed {
    /**
     * Проверка на соответствие ввода
     * @param string принимает строку для анализа
     * @return 1 если ок
     */
    static int itsOkParse (String string) {
        if (!string.isEmpty()) {
            String[] splittedString = string.split(" ");
            if (splittedString.length < 6) {
                throw new RuntimeException("Не все данные внесены, ошибка");
//                return -1;
            }
            if (splittedString.length == 6) {
                return 1;
            }
//            return 2;
            throw new RuntimeException("Слишком много данных внесено, ошибка");
        }throw new RuntimeException("Пустая строка, ошибка");
//        return 0;
    }
}
