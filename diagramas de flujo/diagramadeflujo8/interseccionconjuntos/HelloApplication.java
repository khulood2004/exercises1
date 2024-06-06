package com.example.interseccionconjuntos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of sets: ");
        int numSets = scanner.nextInt();
        scanner.nextLine();
        Set<Integer> intersection = new HashSet<>();

        for (int i = 0; i < numSets; i++) {
            System.out.println("Enter elements of set " + (i + 1) + " : ");
            String[] elements = scanner.nextLine().split(" ");

            Set<Integer> currentSet = new HashSet<>();
            for (String element : elements) {
                currentSet.add(Integer.parseInt(element));
            }

            if (i == 0) {
                intersection.addAll(currentSet);
            } else {
                intersection.retainAll(currentSet);
            }
            if (intersection.isEmpty()) {
                break;
            }
        }

        System.out.println("Intersection of all sets: " + intersection);
    }
}

