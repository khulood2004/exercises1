package com.example.diagramadeflujo_6;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Snowwhite history");
        System.out.println("    ");
        System.out.println("Enter a Number: ");
        int Number = scanner.nextInt();
        if (Number == 1) {
            System.out.println("She went to the city");
            System.out.println("    ");
            System.out.println("Enter a Number: ");
            int number = scanner.nextInt();
            if (number == 1) {
                System.out.println("She found some friends and helped her. !CONGRATULATIONS, she survived!");
            }
            if (number == 2) {
                System.out.println("She died");
            }

        }
        if (Number == 2) {
            System.out.println("She went to the forest,and found a shelter with 7 dwarfs");
            System.out.println("    ");
            System.out.println("Enter a Number: ");
            int number = scanner.nextInt();
            if (number == 1) {
                System.out.println("She stayed in their house that night");
                System.out.println("The dwarfs took care of her that night,!CONGRATULATIONS, she survived!");
            }
            if (number == 2) {
                System.out.println("her stepmother dressed as an old woman and offered her an apple");
                System.out.println("    ");
                System.out.println("Enter a Number: ");
                int numberr = scanner.nextInt();
                if (numberr == 1) {
                    System.out.println("She accepted");
                    System.out.println("The apple was poisoned and she fainted. !SORRY, she didn't survived");
                }
                if (numberr == 2) {
                    System.out.println("She rejected");
                    System.out.println("!CONGRATULATIONS, she survived and lived a happy life !");
                }
            }

        }
    }
}
