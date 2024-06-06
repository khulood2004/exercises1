package com.example.diagramadeflujo4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number for R:");
        int R = scanner.nextInt();
        System.out.println("Enter a number for G:");
        int G = scanner.nextInt();
        System.out.println("Enter a number for B:");
        int B = scanner.nextInt();
        if ((R >= 40 && R < 80) || (R > 120 && R < 140)) {
            if ((G >= 0 && G < 30) ) {
                if ((B >= -1 && G < 20) ) {


                }

            }
            System.out.print ("the result of R is: "+R);
            System.out.print ("the result of G is: "+G);
            System.out.print ("the result of B is: "+B);
        }


    }
}