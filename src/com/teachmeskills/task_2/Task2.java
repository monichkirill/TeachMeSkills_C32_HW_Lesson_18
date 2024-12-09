package com.teachmeskills.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        List<String> Students = new ArrayList<>();
        Students.add("Vlad");
        Students.add("Kirill");
        Students.add("Dmitry");
        Students.add("Marina");
        Students.add("Ilya");
        Students.add("Kirill");
        Students.add("Dmitry");
        Students.add("Kate");
        Students.add("Sergey");
        Students.add("Daniil");
        Students.add("Sultan");
        Students.add("Rita");
        Students.add("Oleg");
        Students.add("Igor");
        Scanner scanner = new Scanner(System.in);
        String FirstLetter = scanner.nextLine();
        List <String> StudFilteredNames = Students.stream()
                .filter(name -> name.toLowerCase().startsWith(String.valueOf(FirstLetter).toLowerCase()))
                .toList();
        System.out.println(StudFilteredNames);
        String FirstSortedName = StudFilteredNames.stream()
                .sorted()
                .findFirst()
                .orElse("There is no such names");
        System.out.println(FirstSortedName);
    }
}
