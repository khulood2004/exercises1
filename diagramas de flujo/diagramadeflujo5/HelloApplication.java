package com.example.diagramadeflujo5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int primesFound = 0;
        int currentNumber = 1;

        for (; primesFound < number; currentNumber++) {
            int counter = 0;

            for (int x = 1; x <= currentNumber; x++) {
                if (currentNumber % x == 0) {
                    counter++;
                }
            }

            if (counter == 2) {
                primesFound++;
                System.out.println("the number is prime: " + currentNumber);
            }
        }
    }

}