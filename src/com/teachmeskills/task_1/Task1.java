package com.teachmeskills.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(50));
        }

        System.out.println("Коллекция: " + numbers);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .toList();
        System.out.println("Уникальные числа: " + uniqueNumbers);

        List<Integer> evenInRange = uniqueNumbers.stream()
                .filter(n -> n % 2 == 0 && n >= 7 && n <= 17)
                .toList();
        System.out.println("Четные числа в диапазоне от 7 до 17: " + evenInRange);

        List<Integer> multiplied = uniqueNumbers.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println("Умноженные на 2: " + multiplied);

        List<Integer> sortedFirst4 = multiplied.stream()
                .sorted()
                .limit(4)
                .toList();
        System.out.println("Первые 4 элемента: " + sortedFirst4);

        long count = uniqueNumbers.size();
        System.out.println("Количество элементов: " + count);

        double average = uniqueNumbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("Среднее арифметическое: " + average);
    }
}
