package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Program.start();
        }catch (GenderInputException e){
            e.printStackTrace();
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }
}