package org.example;

public class checkDate {
    /**
     * Класс ради метода, не уверен что верно
     * @param string принимает строку на анализ.
     * @return true или false
     */
    public static boolean dateIsOk(String string){
        String[] parsedDate = string.split(".");
        if (parsedDate.length==3){
            return true;
        }
        return false;
    } //todo допилить бы полную проверку.
}
