package com.example.diagramadeflujo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int array[] = {100,10,2,0,-1,4,3,1000};
        int temp ;
        int n = array.length;
        for (int i =0; i<n-1; i++){
            for (int j =0; j<n-1; j++){
                if (array[j]> array[j+1]) {
                    temp = array[j];
                    array [j] = array [j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int s : array) {
            System.out.print(s + " ");
        }
    }
}