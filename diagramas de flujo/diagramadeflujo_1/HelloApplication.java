package com.example.diagramadeflujo_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci series terms: ");

        int numbers = scanner.nextInt();
        int number1 = 0, number2= 1;

        System.out.println("Fibonacci series for " + numbers + "terms: ");
        for (int i = 0; i < numbers ; i++) {

            System.out.print(number1 + " ");
            int next = number1 + number2;
            number1 = number2;
            number2 = next;

}
}

}