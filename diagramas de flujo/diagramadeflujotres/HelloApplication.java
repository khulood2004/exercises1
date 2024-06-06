package com.example.diagramadeflujotres;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String array[] = {"z","b","e","f","a","c","o"};
        String temp ;
        int n = array.length;
        for (int i =0; i<n-1; i++){
            for (int j =0; j<n-1; j++){
                if (array[j].compareTo(array[j+1]) <0){
                    temp = array[j];
                    array [j] = array [j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}